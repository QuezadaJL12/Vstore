/**
 * Interfaz que define la lógica de negocio para agregar películas en la tienda virtual.
 */
package com.mycompany.vstorenegocio.negocio;

import com.mycompany.vstoredto.dtos.PeliculaDTO;
import dominio.Pelicula;

public interface IAgregarPeliculaBO {

    /**
     * Método para agregar una película.
     * @param pelicula El objeto PeliculaDTO que representa la película que se desea agregar.
     * @return El objeto PeliculaDTO de la película agregada.
     */
    public PeliculaDTO agregarPelicula(PeliculaDTO pelicula);

    /**
     * Método para convertir un objeto Pelicula a PeliculaDTO.
     * @param pelicula El objeto Pelicula que se desea convertir.
     * @return El objeto PeliculaDTO equivalente.
     */
    public PeliculaDTO convertirPeliculaADTO(Pelicula pelicula);

    /**
     * Método para convertir un objeto PeliculaDTO a Pelicula.
     * @param peliculaDTO El objeto PeliculaDTO que se desea convertir.
     * @return El objeto Pelicula equivalente.
     */
    public Pelicula convertirDTOAPelicula(PeliculaDTO pelicula);
}
