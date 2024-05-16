/**
 * Clase que implementa la funcionalidad de consultar películas en la tienda virtual.
 */
package com.mycompany.vstoreconsultarpeliculas;

import com.mycompany.vstoredto.dtos.PeliculaDTO;
import com.mycompany.vstorenegocio.negocio.ConsultarPeliculasBO;
import com.mycompany.vstorenegocio.negocio.IConsultarPeliculasBO;
import java.util.List;

public class FuncionalidadConsultarPeliculas implements IFuncionalidadConsultarPeliculas {

    private IConsultarPeliculasBO consultarPeliculasBO;

    /**
     * Constructor de la clase FuncionalidadConsultarPeliculas. Inicializa el
     * objeto de negocio para consultar películas.
     */
    public FuncionalidadConsultarPeliculas() {
        consultarPeliculasBO = new ConsultarPeliculasBO();
    }

    /**
     * Método para consultar películas por nombre.
     *
     * @param nombre El nombre de la película que se desea consultar.
     * @return Lista de objetos PeliculaDTO que coinciden con el nombre
     * especificado.
     */
    @Override
    public List<PeliculaDTO> consultarPeliculasCoincidentes(String nombre) {
        return consultarPeliculasBO.consultar(nombre);
    }

    /**
     * Método para consultar todas las películas disponibles.
     *
     * @return Lista de objetos PeliculaDTO con la información de todas las
     * películas disponibles.
     */
    @Override
    public List<PeliculaDTO> consultarPeliculas() {
        return consultarPeliculasBO.consultar();
    }

    /**
     * Método para consultar todas las películas disponibles.
     *
     * @return Lista de objetos PeliculaDTO con la información de todas las
     * películas disponibles.
     */
    @Override
    public PeliculaDTO consultarPeliculasPorNombre(String nombre) {
        return consultarPeliculasBO.consultarPorNombre(nombre);
    }

    @Override
    public PeliculaDTO consultarPorId(String id) {
        return consultarPeliculasBO.consultarPorId(id);
    }

}
