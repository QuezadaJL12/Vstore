/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vstoredetallepelicula;

import com.mycompany.vstoredto.dtos.PeliculaDTO;
import com.mycompany.vstorenegocio.negocio.ConsultarPeliculasBO;
import com.mycompany.vstorenegocio.negocio.IConsultarPeliculasBO;

/**
 *
 * @author af_da
 */
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
