/**
 * Interfaz que define la lógica de negocio para consultar películas en la tienda virtual.
 */
package com.mycompany.vstorenegocio.negocio;

import com.mycompany.vstoredto.dtos.PeliculaDTO;
import dominio.Pelicula;
import java.util.List;

public interface IConsultarPeliculasBO {

    /**
     * Método para consultar todas las películas disponibles.
     *
     * @return Una lista de objetos PeliculaDTO que representan todas las
     * películas disponibles.
     */
    public List<PeliculaDTO> consultar();

    /**
     * Método para consultar películas por nombre.
     *
     * @param nombre El nombre de la película a consultar.
     * @return Una lista de objetos PeliculaDTO que representan las películas
     * con el nombre proporcionado.
     */
    public List<PeliculaDTO> consultar(String nombre);

    /**
     * Método para convertir un objeto Pelicula a PeliculaDTO.
     *
     * @param pelicula El objeto Pelicula que se desea convertir.
     * @return El objeto PeliculaDTO equivalente.
     */
    public PeliculaDTO convertirPeliculaADTO(Pelicula pelicula);

    /**
     * Método para convertir un objeto PeliculaDTO a Pelicula.
     *
     * @return El objeto Pelicula equivalente.
     */
    public Pelicula convertirDTOAPelicula(PeliculaDTO pelicula);

    /**
     * Método para consultar películas por género.
     *
     * @param genero El género de las películas a consultar.
     * @return Una lista de objetos PeliculaDTO que representan las películas
     * del género proporcionado.
     */
    public List<PeliculaDTO> consultarPorGenero(String genero);

    /**
     * Método para consultar una película por su nombre.
     *
     * @param nombre El nombre de la película a consultar.
     * @return El objeto PeliculaDTO que representa la película consultada, o
     * null si no se encuentra.
     */
    public PeliculaDTO consultarPorNombre(String nombre);

    /**
     * Método para consultar una película por su nombre.
     *
     * @param nombre El nombre de la película a consultar.
     * @return El objeto PeliculaDTO que representa la película consultada, o
     * null si no se encuentra.
     */
    public PeliculaDTO consultarPorId(String id);
}
