/**
 * Clase que implementa la funcionalidad de consultar favoritos de un usuario en la tienda virtual.
 */
package com.mycompany.vstoreconsultarfavoritos;

import com.mycompany.vstoredto.dtos.FavoritoDTO;
import com.mycompany.vstorenegocio.negocio.FavoritosBO;
import com.mycompany.vstorenegocio.negocio.IFavoritosBO;
import java.util.List;

public class FuncionalidadConsultarFavoritos implements IFuncionalidadConsultarFavoritos {

    private IFavoritosBO favoritoBO;

    /**
     * Constructor de la clase FuncionalidadConsultarFavoritos.
     * Inicializa el objeto de negocio para manejar los favoritos.
     */
    public FuncionalidadConsultarFavoritos() {
        favoritoBO = new FavoritosBO();
    }

    /**
     * Método para consultar un favorito específico de un usuario para una película.
     * @param usuario El nombre de usuario del usuario cuyo favorito se desea consultar.
     * @param pelicula El nombre de la película cuyo favorito se desea consultar.
     * @return Objeto FavoritoDTO con la información del favorito consultado.
     */
    @Override
    public FavoritoDTO consultarFavorito(String usuario, String pelicula) {
        return favoritoBO.consultar(usuario, pelicula);
    }

    /**
     * Método para consultar todos los favoritos de un usuario.
     * @param usuario El nombre de usuario del usuario cuyos favoritos se desean consultar.
     * @return Lista de objetos FavoritoDTO con la información de los favoritos consultados.
     */
    @Override
    public List<FavoritoDTO> consultarFavoritos(String usuario) {
        return favoritoBO.consultar(usuario);
    }

}
