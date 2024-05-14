/**
 * Interfaz que define la funcionalidad de consultar películas en la tienda virtual.
 */
package com.mycompany.vstoreconsultarpeliculas;

import com.mycompany.vstoredto.dtos.PeliculaDTO;
import java.util.List;

public interface IFuncionalidadConsultarPeliculas {

    /**
     * Método para consultar películas por nombre.
     * @param nombre El nombre de la película que se desea consultar.
     * @return Lista de objetos PeliculaDTO que coinciden con el nombre especificado.
     */
    public List<PeliculaDTO> consultarPeliculasPorNombre(String nombre);

    /**
     * Método para consultar todas las películas disponibles.
     * @return Lista de objetos PeliculaDTO con la información de todas las películas disponibles.
     */
    public List<PeliculaDTO> consultarPeliculas();
}
