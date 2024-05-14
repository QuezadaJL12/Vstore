/**
 * Interfaz que define la funcionalidad de consultar películas por género en la tienda virtual.
 */
package com.mycompany.vstoreconsultarpelicula;

import com.mycompany.vstoredto.dtos.PeliculaDTO;
import java.util.List;

public interface IFuncionalidadConsultarPeliculasPorGenero {

    /**
     * Método para consultar películas por género.
     * @param genero El género de las películas que se desean consultar.
     * @return Lista de objetos PeliculaDTO con la información de las películas encontradas.
     */
    public List<PeliculaDTO> consultarPeliculas(String genero);

}
