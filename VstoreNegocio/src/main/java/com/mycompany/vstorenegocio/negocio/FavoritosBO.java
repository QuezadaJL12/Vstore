
package com.mycompany.vstorenegocio.negocio;

import com.mycompany.vstoredto.dtos.FavoritoDTO;
import daos.FavoritoDAO;
import dominio.Favorito;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;


public class FavoritosBO implements IFavoritosBO {

    private FavoritoDAO favoritoDAO;

    public FavoritosBO() {
        favoritoDAO = new FavoritoDAO();
    }

    @Override
    public FavoritoDTO agregarFavorito(FavoritoDTO favorito) {
        return convertirADTO(favoritoDAO.agregar(convertirFavoritoDTOAFavorito(favorito)));
    }

    @Override
    public FavoritoDTO consultar(String usuario, String pelicula) {
        return convertirADTO(favoritoDAO.consultar(usuario, pelicula));
    }

    @Override
    public List<FavoritoDTO> consultar(String pelicula) {
        List<Favorito> listaFavoritos = favoritoDAO.consultar(pelicula);
        List<FavoritoDTO> favoritosDTO = new ArrayList<>();
        for (Favorito listaFavorito : listaFavoritos) {
            favoritosDTO.add(convertirADTO(listaFavorito));
        }

        return favoritosDTO;
    }

    @Override
    public boolean eliminar(FavoritoDTO favorito) {
        return favoritoDAO.eliminar(convertirFavoritoDTOAFavorito(favorito));
    }

    @Override
    public FavoritoDTO convertirADTO(Favorito favorito) {
        FavoritoDTO favoritoNuevo = new FavoritoDTO();
        favoritoNuevo.setId(favorito.getId().toHexString());
        favoritoNuevo.setPelicula(favorito.getPelicula());
        favoritoNuevo.setUsuario(favorito.getUsuario());
        return favoritoNuevo;
    }

    @Override
    public Favorito convertirFavoritoDTOAFavorito(FavoritoDTO favorito) {
        Favorito favoritoNuevo = new Favorito();
        //favoritoNuevo.setId(new ObjectId(favorito.getId()));
        favoritoNuevo.setPelicula(favorito.getPelicula());
        favoritoNuevo.setUsuario(favorito.getUsuario());
        return favoritoNuevo;
    }

}
