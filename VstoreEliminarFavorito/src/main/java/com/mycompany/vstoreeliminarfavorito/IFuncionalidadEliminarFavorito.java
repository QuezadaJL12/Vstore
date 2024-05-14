/**
 * Interfaz que define la funcionalidad de eliminar un favorito de un usuario en la tienda virtual.
 */
package com.mycompany.vstoreeliminarfavorito;

import com.mycompany.vstoredto.dtos.FavoritoDTO;

public interface IFuncionalidadEliminarFavorito {

    /**
     * Método para eliminar un favorito de un usuario.
     *
     * @param favorito El objeto FavoritoDTO que se desea eliminar.
     * @return true si se eliminó correctamente, false si no.
     */
    public boolean eliminarFavorito(FavoritoDTO favorito);
}
