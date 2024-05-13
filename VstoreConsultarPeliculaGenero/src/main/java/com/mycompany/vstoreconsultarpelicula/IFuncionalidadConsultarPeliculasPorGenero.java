
package com.mycompany.vstoreconsultarpelicula;

import com.mycompany.vstoredto.dtos.PeliculaDTO;
import java.util.List;

public interface IFuncionalidadConsultarPeliculasPorGenero {

    public List<PeliculaDTO> consultarPeliculas(String genero);

}
