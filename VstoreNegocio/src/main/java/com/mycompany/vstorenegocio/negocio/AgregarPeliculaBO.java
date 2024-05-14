/**
 * Clase que implementa la lógica de negocio para agregar películas en la tienda virtual.
 */
package com.mycompany.vstorenegocio.negocio;

import com.mycompany.vstoredto.dtos.PeliculaDTO;
import daos.PeliculaDAO;
import dominio.Pelicula;

public class AgregarPeliculaBO implements IAgregarPeliculaBO {
    
    private PeliculaDAO peliculaDAO;
    
    /**
     * Constructor de la clase AgregarPeliculaBO.
     * Inicializa el objeto de acceso a datos para películas.
     */
    public AgregarPeliculaBO() {
        peliculaDAO = new PeliculaDAO();
    }
    
    /**
     * Método para agregar una película.
     * @param pelicula El objeto PeliculaDTO que representa la película que se desea agregar.
     * @return El objeto PeliculaDTO de la película agregada.
     */
    @Override
    public PeliculaDTO agregarPelicula(PeliculaDTO pelicula) {
        return convertirPeliculaADTO(peliculaDAO.agregar(convertirDTOAPelicula(pelicula)));
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
        pelicula.setDescripcion(peliculaDTO.getDescripcion());
        return pelicula;
    }
}
