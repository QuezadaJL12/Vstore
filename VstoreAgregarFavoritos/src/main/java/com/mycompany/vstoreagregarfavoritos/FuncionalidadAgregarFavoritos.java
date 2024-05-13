
package com.mycompany.vstoreagregarfavoritos;

import com.mycompany.vstoredto.dtos.FavoritoDTO;
import com.mycompany.vstorenegocio.negocio.FavoritosBO;
import com.mycompany.vstorenegocio.negocio.IFavoritosBO;


public class FuncionalidadAgregarFavoritos implements IFuncionalidadAgregarFavoritos {

    private IFavoritosBO favoritosBO;

    public FuncionalidadAgregarFavoritos() {
        favoritosBO = new FavoritosBO();
    }

    @Override
    public FavoritoDTO agregarFavoritos(FavoritoDTO favorito) {
        return favoritosBO.agregarFavorito(favorito);
    }

}
