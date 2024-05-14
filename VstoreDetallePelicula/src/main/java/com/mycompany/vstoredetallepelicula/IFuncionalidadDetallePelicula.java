/**
 * Interfaz que define la funcionalidad de consultar detalles de una película en la tienda virtual.
 */
package com.mycompany.vstoredetallepelicula;

import com.mycompany.vstoredto.dtos.PeliculaDTO;

public interface IFuncionalidadDetallePelicula {

    /**
     * Método para consultar los detalles de una película por su nombre.
     *
     * @param nombre El nombre de la película de la que se desean obtener los
     * detalles.
     * @return Objeto PeliculaDTO con la información detallada de la película.
     */
    public PeliculaDTO consultarPelicula(String nombre);
}
