
package com.mycompany.vstorenegocio.negocio;

import com.mycompany.vstoredto.dtos.PeliculaDTO;
import dominio.Pelicula;


public interface IAgregarPeliculaBO {

    public PeliculaDTO agregarPelicula(PeliculaDTO pelicula);

    public PeliculaDTO convertirPeliculaADTO(Pelicula pelicula);

    public Pelicula convertirDTOAPelicula(PeliculaDTO pelicula);
}
