
/**
 * Clase que implementa la funcionalidad de consultar películas por género en la tienda virtual.
 */
package com.mycompany.vstoreconsultarpelicula;

import com.mycompany.vstoredto.dtos.PeliculaDTO;
import com.mycompany.vstorenegocio.negocio.ConsultarPeliculasBO;
import com.mycompany.vstorenegocio.negocio.IConsultarPeliculasBO;
import java.util.List;

public class FuncionalidadConsultarPeliculasPorGenero implements IFuncionalidadConsultarPeliculasPorGenero {

    private IConsultarPeliculasBO consultarPeliculasBO;

    /**
     * Constructor de la clase FuncionalidadConsultarPeliculasPorGenero.
     * Inicializa el objeto de negocio para consultar películas por género.
     */
    public FuncionalidadConsultarPeliculasPorGenero() {
        consultarPeliculasBO = new ConsultarPeliculasBO();
    }

    /**
     * Método para consultar películas por género.
     * @param genero El género de las películas que se desean consultar.
     * @return Lista de objetos PeliculaDTO con la información de las películas encontradas.
     */
    @Override
    public List<PeliculaDTO> consultarPeliculas(String genero) {
        return consultarPeliculasBO.consultarPorGenero(genero);
    }

}

