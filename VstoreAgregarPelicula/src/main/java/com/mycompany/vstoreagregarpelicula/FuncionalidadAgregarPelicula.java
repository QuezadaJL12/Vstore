
/**
 * Clase que implementa la funcionalidad de agregar una película a la tienda virtual.
 */
package com.mycompany.vstoreagregarpelicula;

import com.mycompany.vstoredto.dtos.PeliculaDTO;
import com.mycompany.vstorenegocio.negocio.AgregarPeliculaBO;

public class FuncionalidadAgregarPelicula implements IFuncionalidadAgregarPelicula {

    private AgregarPeliculaBO agregarPeliculaBO;

    /**
     * Constructor de la clase FuncionalidadAgregarPelicula.
     * Inicializa el objeto de negocio para agregar películas.
     */
    public FuncionalidadAgregarPelicula() {
        agregarPeliculaBO = new AgregarPeliculaBO();
    }

    /**
     * Método para agregar una película a la tienda virtual.
     * @param pelicula Objeto PeliculaDTO que contiene la información de la película a agregar.
     * @return Objeto PeliculaDTO con la información de la película agregada.
     */
    @Override
    public PeliculaDTO agregarPelicula(PeliculaDTO pelicula) {
        return agregarPeliculaBO.agregarPelicula(pelicula);
    }

}

