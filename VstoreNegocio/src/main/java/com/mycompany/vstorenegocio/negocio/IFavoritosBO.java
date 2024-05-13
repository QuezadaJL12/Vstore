
package com.mycompany.vstorenegocio.negocio;

import com.mycompany.vstoredto.dtos.FavoritoDTO;
import dominio.Favorito;
import java.util.List;

public interface IFavoritosBO {

    public FavoritoDTO agregarFavorito(FavoritoDTO favorito);

    public FavoritoDTO consultar(String usuario, String pelicula);

    public List<FavoritoDTO> consultar(String pelicula);

    public boolean eliminar(FavoritoDTO favorito);

    public FavoritoDTO convertirADTO(Favorito favorito);

    public Favorito convertirFavoritoDTOAFavorito(FavoritoDTO favorito);
}
