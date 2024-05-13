
package com.mycompany.vstoreconsultarpelicula;

import com.mycompany.vstoredto.dtos.PeliculaDTO;
import com.mycompany.vstorenegocio.negocio.ConsultarPeliculasBO;
import com.mycompany.vstorenegocio.negocio.IConsultarPeliculasBO;
import java.util.List;


public class FuncionalidadConsultarPeliculasPorGenero implements IFuncionalidadConsultarPeliculasPorGenero {

    private IConsultarPeliculasBO consultarPeliculasBO;

    public FuncionalidadConsultarPeliculasPorGenero() {
        consultarPeliculasBO = new ConsultarPeliculasBO();

    }

    @Override
    public List<PeliculaDTO> consultarPeliculas(String genero) {
        return consultarPeliculasBO.consultarPorGenero(genero);

    }

}
