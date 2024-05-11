
package com.mycompany.vstoreagregarpelicula;

import com.mycompany.vstoredto.dtos.PeliculaDTO;
import com.mycompany.vstorenegocio.negocio.AgregarPeliculaBO;


public class FuncionalidadAgregarPelicula implements IFuncionalidadAgregarPelicula {

    private AgregarPeliculaBO agregarPeliculaBO;

    public FuncionalidadAgregarPelicula() {
        agregarPeliculaBO = new AgregarPeliculaBO();
    }

    @Override
    public PeliculaDTO agregarPelicula(PeliculaDTO pelicula) {
        return agregarPeliculaBO.agregarPelicula(pelicula);
    }

}
