/**
 * Clase que implementa la funcionalidad de eliminar un favorito de un usuario en la tienda virtual.
 */
package com.mycompany.vstoreeliminarfavorito;

import com.mycompany.vstoredto.dtos.FavoritoDTO;
import com.mycompany.vstorenegocio.negocio.FavoritosBO;

public class FuncionalidadEliminarFavorito implements IFuncionalidadEliminarFavorito {

    private FavoritosBO favoritoBo;

    /**
     * Constructor de la clase FuncionalidadEliminarFavorito.
     * Inicializa el objeto de negocio para manejar los favoritos.
     */
    public FuncionalidadEliminarFavorito() {
        favoritoBo = new FavoritosBO();
    }

    /**
     * Método para eliminar un favorito de un usuario.
     * @param favorito El objeto FavoritoDTO que se desea eliminar.
     * @return true si se eliminó correctamente, false si no.
     */
    @Override
    public boolean eliminarFavorito(FavoritoDTO favorito) {
        return favoritoBo.eliminar(favorito);
    }

}
