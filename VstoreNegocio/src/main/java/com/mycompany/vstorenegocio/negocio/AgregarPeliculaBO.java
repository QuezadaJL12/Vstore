
package com.mycompany.vstorenegocio.negocio;

import com.mycompany.vstoredto.dtos.PeliculaDTO;
import daos.PeliculaDAO;
import dominio.Pelicula;


public class AgregarPeliculaBO implements IAgregarPeliculaBO {
    
    private PeliculaDAO peliculaDAO;
    
    public AgregarPeliculaBO() {
        peliculaDAO = new PeliculaDAO();
    }
    
    @Override
    public PeliculaDTO agregarPelicula(PeliculaDTO pelicula) {
        return convertirPeliculaADTO(peliculaDAO.agregar(convertirDTOAPelicula(pelicula)));
    }
    
    @Override
    public PeliculaDTO convertirPeliculaADTO(Pelicula pelicula) {
        PeliculaDTO peliculaDTO = new PeliculaDTO(pelicula.getId().toString(), pelicula.getNombre(), pelicula.getImg(), pelicula.getGenero());
        peliculaDTO.setDescripcion(pelicula.getDescripcion());
        return peliculaDTO;
    }
    
    @Override
    public Pelicula convertirDTOAPelicula(PeliculaDTO peliculaDTO) {
        Pelicula pelicula = new Pelicula(peliculaDTO.getNombre(), peliculaDTO.getImg(), peliculaDTO.getGenero());
        pelicula.setDescripcion(peliculaDTO.getDescripcion());
        return pelicula;
    }
    
}
