package com.mycompany.vstorenegocio.negocio;

import com.mycompany.vstoredto.dtos.PeliculaDTO;
import daos.PeliculaDAO;
import dominio.Pelicula;
import java.util.LinkedList;
import java.util.List;

public class ConsultarPeliculasBO implements IConsultarPeliculasBO {
    
    private PeliculaDAO peliculaDAO;
    
    public ConsultarPeliculasBO() {
        peliculaDAO = new PeliculaDAO();
    }
    
    @Override
    public List<PeliculaDTO> consultar() {
        List<Pelicula> peliculas = peliculaDAO.consultar();
        List<PeliculaDTO> peliculasDTO = new LinkedList<>();
        for (Pelicula pelicula : peliculas) {
            peliculasDTO.add(convertirPeliculaADTO(pelicula));
        }
        return peliculasDTO;
    }
    
    @Override
    public List<PeliculaDTO> consultar(String nombre) {
        List<Pelicula> peliculas = peliculaDAO.consultar(nombre);
        List<PeliculaDTO> peliculasDTO = new LinkedList<>();
        for (Pelicula pelicula : peliculas) {
            peliculasDTO.add(convertirPeliculaADTO(pelicula));
        }
        return peliculasDTO;
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
        return pelicula;
    }
    
    @Override
    public List<PeliculaDTO> consultarPorGenero(String genero) {
        List<Pelicula> peliculas = peliculaDAO.consultarPorGenero(genero);
        List<PeliculaDTO> peliculasDTO = new LinkedList<>();
        for (Pelicula pelicula : peliculas) {
            peliculasDTO.add(convertirPeliculaADTO(pelicula));
        }
        return peliculasDTO;
    }
    
    @Override
    public PeliculaDTO consultarPorNombre(String nombre) {
        Pelicula pelicula = peliculaDAO.consultarPorNombre(nombre);
        
        return this.convertirPeliculaADTO(pelicula);
    }
    
}
