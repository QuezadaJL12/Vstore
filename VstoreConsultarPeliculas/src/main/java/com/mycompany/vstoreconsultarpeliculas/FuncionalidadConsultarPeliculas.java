

package com.mycompany.vstoreconsultarpeliculas;

import com.mycompany.vstoredto.dtos.PeliculaDTO;
import com.mycompany.vstorenegocio.negocio.ConsultarPeliculasBO;
import com.mycompany.vstorenegocio.negocio.IConsultarPeliculasBO;
import java.util.List;



public class FuncionalidadConsultarPeliculas implements IFuncionalidadConsultarPeliculas {

    private IConsultarPeliculasBO consultarPeliculasBO;

    public FuncionalidadConsultarPeliculas() {
        consultarPeliculasBO = new ConsultarPeliculasBO();
    }

    @Override
    public List<PeliculaDTO> consultarPeliculasPorNombre(String nombre) {
        return consultarPeliculasBO.consultar(nombre);

    }

    @Override
    public List<PeliculaDTO> consultarPeliculas() {
        return consultarPeliculasBO.consultar();
    }

}
