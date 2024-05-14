
/**
 * Interfaz que define la funcionalidad de consultar favoritos de un usuario en la tienda virtual.
 */
package com.mycompany.vstoreconsultarfavoritos;

import com.mycompany.vstoredto.dtos.FavoritoDTO;
import java.util.List;

public interface IFuncionalidadConsultarFavoritos {
    /**
     * Método para consultar un favorito específico de un usuario para una película.
     * @param usuario El nombre de usuario del usuario cuyo favorito se desea consultar.
     * @param pelicula El nombre de la película cuyo favorito se desea consultar.
     * @return Objeto FavoritoDTO con la información del favorito consultado.
     */
    public FavoritoDTO consultarFavorito(String usuario, String pelicula);
    
    /**
     * Método para consultar todos los favoritos de un usuario.
     * @param usuario El nombre de usuario del usuario cuyos favoritos se desean consultar.
     * @return Lista de objetos FavoritoDTO con la información de los favoritos consultados.
     */
    public List<FavoritoDTO> consultarFavoritos(String usuario);
}
