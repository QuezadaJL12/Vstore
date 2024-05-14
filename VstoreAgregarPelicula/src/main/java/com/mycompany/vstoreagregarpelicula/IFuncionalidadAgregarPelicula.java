/**
 * Interfaz que define la funcionalidad de agregar una película a la tienda virtual.
 */
package com.mycompany.vstoreagregarpelicula;

import com.mycompany.vstoredto.dtos.PeliculaDTO;

public interface IFuncionalidadAgregarPelicula {
    /**
     * Método para agregar una película a la tienda virtual.
     * @param pelicula Objeto PeliculaDTO que contiene la información de la película a agregar.
     * @return Objeto PeliculaDTO con la información de la película agregada.
     */
    public PeliculaDTO agregarPelicula(PeliculaDTO pelicula);
}
