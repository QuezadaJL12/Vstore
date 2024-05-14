/**
 * Clase que implementa la funcionalidad de agregar favoritos a un usuario en la tienda virtual.
 */
package com.mycompany.vstoreagregarfavoritos;

import com.mycompany.vstoredto.dtos.FavoritoDTO;
import com.mycompany.vstorenegocio.negocio.FavoritosBO;
import com.mycompany.vstorenegocio.negocio.IFavoritosBO;

public class FuncionalidadAgregarFavoritos implements IFuncionalidadAgregarFavoritos {

    private IFavoritosBO favoritosBO;

    /**
     * Constructor de la clase FuncionalidadAgregarFavoritos.
     * Inicializa el objeto de negocio para manejar los favoritos.
     */
    public FuncionalidadAgregarFavoritos() {
        favoritosBO = new FavoritosBO();
    }

    /**
     * Método para agregar un favorito al usuario.
     * @param favorito Objeto FavoritoDTO que contiene la información del favorito a agregar.
     * @return Objeto FavoritoDTO con la información del favorito agregado.
     */
    @Override
    public FavoritoDTO agregarFavoritos(FavoritoDTO favorito) {
        return favoritosBO.agregarFavorito(favorito);
    }

}
