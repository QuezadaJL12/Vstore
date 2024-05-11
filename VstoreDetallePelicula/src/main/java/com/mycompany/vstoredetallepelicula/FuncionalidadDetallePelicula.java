
package com.mycompany.vstoredetallepelicula;

import com.mycompany.vstoredto.dtos.PeliculaDTO;
import com.mycompany.vstorenegocio.negocio.ConsultarPeliculasBO;
import com.mycompany.vstorenegocio.negocio.IConsultarPeliculasBO;


public class FuncionalidadDetallePelicula implements IFuncionalidadDetallePelicula {

    private IConsultarPeliculasBO consultarPeliculasBO;

    public FuncionalidadDetallePelicula() {
        consultarPeliculasBO = new ConsultarPeliculasBO();
    }

    @Override
    public PeliculaDTO consultarPelicula(String nombre) {
        return consultarPeliculasBO.consultarPorNombre(nombre);
    }

}
