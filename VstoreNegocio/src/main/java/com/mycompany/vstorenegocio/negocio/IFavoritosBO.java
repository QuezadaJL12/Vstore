/**
 * Interfaz que define la lógica de negocio para manejar los favoritos de los usuarios en la tienda virtual.
 */
package com.mycompany.vstorenegocio.negocio;

import com.mycompany.vstoredto.dtos.FavoritoDTO;
import dominio.Favorito;
import java.util.List;

public interface IFavoritosBO {

    /**
     * Método para agregar un favorito.
     *
     * @param favorito El objeto FavoritoDTO que representa el favorito que se
     * desea agregar.
     * @return El objeto FavoritoDTO de favorito agregado.
     */
    public FavoritoDTO agregarFavorito(FavoritoDTO favorito);

    /**
     * Método para consultar un favorito por usuario y película.
     *
     * @param usuario El nombre de usuario.
     * @param pelicula El nombre de la película.
     * @return El objeto FavoritoDTO que representa el favorito consultado, o
     * null si no se encuentra.
     */
    public FavoritoDTO consultar(String usuario, String pelicula);

    /**
     * Método para consultar los favoritos de una película.
     *
     * @param pelicula El nombre de la película.
     * @return Una lista de objetos FavoritoDTO que representan los favoritos de
     * la película.
     */
    public List<FavoritoDTO> consultar(String pelicula);


    /**
     * Método para eliminar un favorito.
     *
     * @param favorito El objeto FavoritoDTO que representa el favorito que se
     * desea eliminar.
     * @return true si se eliminó correctamente, false si no.
     */
    public boolean eliminar(FavoritoDTO favorito);

    /**
     * Método para convertir un objeto Favorito a FavoritoDTO.
     *
     * @param favorito El objeto Favorito que se desea convertir.
     * @return El objeto FavoritoDTO equivalente.
     */
    public FavoritoDTO convertirADTO(Favorito favorito);

    /**
     * Método para convertir un objeto FavoritoDTO a Favorito.
     *
     * @param favorito El objeto FavoritoDTO que se desea convertir.
     * @return El objeto Favorito equivalente.
     */
    public Favorito convertirFavoritoDTOAFavorito(FavoritoDTO favorito);
}
