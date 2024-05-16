/**
 * Interfaz que define los métodos para realizar operaciones CRUD en la colección de películas en la base de datos MongoDB.
 */
package daos;

import dominio.Pelicula;
import java.util.List;

public interface IPeliculaDAO {

    /**
     * Método para agregar una nueva película a la base de datos.
     *
     * @param pelicula El objeto Pelicula que se desea agregar.
     * @return El objeto Pelicula agregado.
     */
    public Pelicula agregar(Pelicula pelicula);

    /**
     * Método para consultar todas las películas en la base de datos.
     *
     * @return Una lista de objetos Pelicula que representan todas las películas
     * en la base de datos.
     */
    public List<Pelicula> consultar();

    /**
     * Método para consultar películas por nombre.
     *
     * @param nombre El nombre de la película que se desea consultar.
     * @return Una lista de objetos Pelicula que coinciden con el nombre
     * especificado.
     */
    public Pelicula consultarPorId(String nombre);

    /**
     * Método para consultar películas por nombre.
     *
     * @param nombre El nombre de la película que se desea consultar.
     * @return Una lista de objetos Pelicula que coinciden con el nombre
     * especificado.
     */
    public List<Pelicula> consultar(String nombre);

    /**
     * Método para consultar una película por su nombre exacto.
     *
     * @param nombre El nombre exacto de la película que se desea consultar.
     * @return El objeto Pelicula que coincide con el nombre especificado, o
     * null si no se encuentra.
     */
    public Pelicula consultarPorNombre(String nombre);

    /**
     * Método para consultar películas por género.
     *
     * @param genero El género de las películas que se desean consultar.
     * @return Una lista de objetos Pelicula que pertenecen al género
     * especificado.
     */
    public List<Pelicula> consultarPorGenero(String genero);
}
