
package com.mycompany.vstoreconsultarpeliculas;

import com.mycompany.vstoredto.dtos.PeliculaDTO;
import java.util.List;


public interface IFuncionalidadConsultarPeliculas {

    public List<PeliculaDTO> consultarPeliculasPorNombre(String nombre);

    public List<PeliculaDTO> consultarPeliculas();
}
