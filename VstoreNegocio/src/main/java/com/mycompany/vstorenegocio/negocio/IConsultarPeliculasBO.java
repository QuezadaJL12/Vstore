
package com.mycompany.vstorenegocio.negocio;

import com.mycompany.vstoredto.dtos.PeliculaDTO;
import dominio.Pelicula;
import java.util.List;


public interface IConsultarPeliculasBO {

    public List<PeliculaDTO> consultar();

    public List<PeliculaDTO> consultar(String nombre);

    public PeliculaDTO convertirPeliculaADTO(Pelicula pelicula);

    public Pelicula convertirDTOAPelicula(PeliculaDTO pelicula);

    public List<PeliculaDTO> consultarPorGenero(String genero);

    public PeliculaDTO consultarPorNombre(String nombre);

}
