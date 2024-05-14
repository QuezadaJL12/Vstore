/**
 * Interfaz que define la funcionalidad de agregar favoritos a un usuario en la tienda virtual.
 */
package com.mycompany.vstoreagregarfavoritos;

import com.mycompany.vstoredto.dtos.FavoritoDTO;

public interface IFuncionalidadAgregarFavoritos {

    /**
     * Método para agregar un favorito al usuario.
     * @param favorito Objeto FavoritoDTO que contiene la información del favorito a agregar.
     * @return Objeto FavoritoDTO con la información del favorito agregado.
     */
    public FavoritoDTO agregarFavoritos(FavoritoDTO favorito);
}

