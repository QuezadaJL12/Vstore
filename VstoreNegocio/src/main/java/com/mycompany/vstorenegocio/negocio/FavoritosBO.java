/**
 * Clase que implementa la lógica de negocio para manejar los favoritos de los usuarios en la tienda virtual.
 */
package com.mycompany.vstorenegocio.negocio;

import com.mycompany.vstoredto.dtos.FavoritoDTO;
import daos.FavoritoDAO;
import daos.IFavoritoDAO;
import daos.IUsuarioDAO;
import daos.UsuarioDAO;
import dominio.Favorito;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

public class FavoritosBO implements IFavoritosBO {

    private IFavoritoDAO favoritoDAO;
    private IUsuarioDAO usuarioDAO;

    /**
     * Constructor de la clase FavoritosBO. Inicializa el objeto de acceso a
     * datos para favoritos.
     */
    public FavoritosBO() {
        favoritoDAO = new FavoritoDAO();
        usuarioDAO = new UsuarioDAO();

    }

    /**
     * Método para agregar un favorito.
     *
     * @param favorito El objeto FavoritoDTO que representa el favorito que se
     * desea agregar.
     * @return El objeto FavoritoDTO de favorito agregado.
     */
    @Override
    public FavoritoDTO agregarFavorito(FavoritoDTO favorito) {
        return convertirADTO(favoritoDAO.agregar(convertirFavoritoDTOAFavorito(favorito)));
    }

    /**
     * Método para consultar un favorito por usuario y película.
     *
     * @param usuario El nombre de usuario.
     * @param pelicula El nombre de la película.
     * @return El objeto FavoritoDTO que representa el favorito consultado, o
     * null si no se encuentra.
     */
    @Override
    public FavoritoDTO consultar(String usuario, String pelicula) {
        return convertirADTO(favoritoDAO.consultar(usuario, pelicula));
    }

    /**
     * Método para consultar todos los favoritos de un usuario.
     *
     * @param usuario El nombre de usuario.
     * @return Una lista de objetos FavoritoDTO que representan los favoritos
     * del usuario.
     */
    @Override
    public List<FavoritoDTO> consultar(String usuario) {
        List<Favorito> listaFavoritos = favoritoDAO.consultar(usuario);
        List<FavoritoDTO> favoritosDTO = new ArrayList<>();
        for (Favorito listaFavorito : listaFavoritos) {
            favoritosDTO.add(convertirADTO(listaFavorito));
        }
        return favoritosDTO;
    }

    /**
     * Método para eliminar un favorito.
     *
     * @param favorito El objeto FavoritoDTO que representa el favorito que se
     * desea eliminar.
     * @return true si se eliminó correctamente, false si no.
     */
    @Override
    public boolean eliminar(FavoritoDTO favorito) {
        return favoritoDAO.eliminar(convertirFavoritoDTOAFavorito(favorito));
    }

    /**
     * Método para convertir un objeto Favorito a FavoritoDTO.
     *
     * @param favorito El objeto Favorito que se desea convertir.
     * @return El objeto FavoritoDTO equivalente.
     */
    @Override
    public FavoritoDTO convertirADTO(Favorito favorito) {
        FavoritoDTO favoritoNuevo = new FavoritoDTO();
        if (favorito == null) {
            return null;
        }
        favoritoNuevo.setId(favorito.getId().toHexString());
        favoritoNuevo.setPelicula(favorito.getPelicula().toHexString());
        favoritoNuevo.setUsuario(usuarioDAO.consultar(favorito.getUsuario().toHexString()).getId().toHexString());
        return favoritoNuevo;
    }

    /**
     * Método para convertir un objeto FavoritoDTO a Favorito.
     *
     * @param favorito El objeto FavoritoDTO que se desea convertir.
     * @return El objeto Favorito equivalente.
     */
    @Override
    public Favorito convertirFavoritoDTOAFavorito(FavoritoDTO favorito) {
        Favorito favoritoNuevo = new Favorito();
        favoritoNuevo.setPelicula(new ObjectId(favorito.getPelicula()));
        favoritoNuevo.setUsuario(new ObjectId(favorito.getUsuario()));

        return favoritoNuevo;
    }
}
