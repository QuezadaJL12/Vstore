/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.vstoredetallepelicula;

import com.mycompany.vstoredto.dtos.PeliculaDTO;

/**
 *
 * @author af_da
 */
public interface IFuncionalidadDetallePelicula {
    public PeliculaDTO consultarPelicula(String nombre);
}
