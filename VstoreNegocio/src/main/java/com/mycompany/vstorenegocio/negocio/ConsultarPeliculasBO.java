/**
 * Clase que implementa la lógica de negocio para consultar películas en la tienda virtual.
 */
package com.mycompany.vstorenegocio.negocio;

import com.mycompany.vstoredto.dtos.PeliculaDTO;
import daos.PeliculaDAO;
import dominio.Pelicula;
import java.util.LinkedList;
import java.util.List;

public class ConsultarPeliculasBO implements IConsultarPeliculasBO {
    
    private PeliculaDAO peliculaDAO;
    
    /**
     * Constructor de la clase ConsultarPeliculasBO.
     * Inicializa el objeto de acceso a datos para películas.
     */
    public ConsultarPeliculasBO() {
        peliculaDAO = new PeliculaDAO();
    }
    
    /**
     * Método para consultar todas las películas disponibles.
     * @return Una lista de objetos PeliculaDTO que representan todas las películas disponibles.
     */
    @Override
    public List<PeliculaDTO> consultar() {
        List<Pelicula> peliculas = peliculaDAO.consultar();
        List<PeliculaDTO> peliculasDTO = new LinkedList<>();
        for (Pelicula pelicula : peliculas) {
            peliculasDTO.add(convertirPeliculaADTO(pelicula));
        }
        return peliculasDTO;
    }
    
    /**
     * Método para consultar películas por nombre.
     * @param nombre El nombre de la película a consultar.
     * @return Una lista de objetos PeliculaDTO que representan las películas con el nombre proporcionado.
     */
    @Override
    public List<PeliculaDTO> consultar(String nombre) {
        List<Pelicula> peliculas = peliculaDAO.consultar(nombre);
        List<PeliculaDTO> peliculasDTO = new LinkedList<>();
        for (Pelicula pelicula : peliculas) {
            peliculasDTO.add(convertirPeliculaADTO(pelicula));
        }
        return peliculasDTO;
    }
    
    /**
     * Método para convertir un objeto Pelicula a PeliculaDTO.
     * @param pelicula El objeto Pelicula que se desea convertir.
     * @return El objeto PeliculaDTO equivalente.
     */
    @Override
    public PeliculaDTO convertirPeliculaADTO(Pelicula pelicula) {
        PeliculaDTO peliculaDTO = new PeliculaDTO(pelicula.getId().toString(), pelicula.getNombre(), pelicula.getImg(), pelicula.getGenero());
        peliculaDTO.setDescripcion(pelicula.getDescripcion());
        return peliculaDTO;
    }
    
    /**
     * Método para convertir un objeto PeliculaDTO a Pelicula.
     * @param peliculaDTO El objeto PeliculaDTO que se desea convertir.
     * @return El objeto Pelicula equivalente.
     */
    @Override
    public Pelicula convertirDTOAPelicula(PeliculaDTO peliculaDTO) {
        Pelicula pelicula = new Pelicula(peliculaDTO.getNombre(), peliculaDTO.getImg(), peliculaDTO.getGenero());
        return pelicula;
    }
    
    /**
     * Método para consultar películas por género.
     * @param genero El género de las películas a consultar.
     * @return Una lista de objetos PeliculaDTO que representan las películas del género proporcionado.
     */
    @Override
    public List<PeliculaDTO> consultarPorGenero(String genero) {
        List<Pelicula> peliculas = peliculaDAO.consultarPorGenero(genero);
        List<PeliculaDTO> peliculasDTO = new LinkedList<>();
        for (Pelicula pelicula : peliculas) {
            peliculasDTO.add(convertirPeliculaADTO(pelicula));
        }
        return peliculasDTO;
    }
    
    /**
     * Método para consultar una película por su nombre.
     * @param nombre El nombre de la película a consultar.
     * @return El objeto PeliculaDTO que representa la película consultada, o null si no se encuentra.
     */
    @Override
    public PeliculaDTO consultarPorNombre(String nombre) {
        Pelicula pelicula = peliculaDAO.consultarPorNombre(nombre);
        return convertirPeliculaADTO(pelicula);
    }
    
}
