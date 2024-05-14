/**
 * Clase que implementa la funcionalidad de consultar detalles de una película en la tienda virtual.
 */
package com.mycompany.vstoredetallepelicula;

import com.mycompany.vstoredto.dtos.PeliculaDTO;
import com.mycompany.vstorenegocio.negocio.ConsultarPeliculasBO;
import com.mycompany.vstorenegocio.negocio.IConsultarPeliculasBO;

public class FuncionalidadDetallePelicula implements IFuncionalidadDetallePelicula {

    private IConsultarPeliculasBO consultarPeliculasBO;

    /**
     * Constructor de la clase FuncionalidadDetallePelicula.
     * Inicializa el objeto de negocio para consultar películas.
     */
    public FuncionalidadDetallePelicula() {
        consultarPeliculasBO = new ConsultarPeliculasBO();
    }

    /**
     * Método para consultar los detalles de una película por su nombre.
     * @param nombre El nombre de la película de la que se desean obtener los detalles.
     * @return Objeto PeliculaDTO con la información detallada de la película.
     */
    @Override
    public PeliculaDTO consultarPelicula(String nombre) {
        return consultarPeliculasBO.consultarPorNombre(nombre);
    }

}
