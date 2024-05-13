package daos;

import dominio.Pelicula;
import java.util.List;

public interface IPeliculaDAO {

    public Pelicula agregar(Pelicula pelicula);

    public List<Pelicula> consultar();

    public List<Pelicula> consultar(String nombre);

    public Pelicula consultarPorNombre(String nombre);

    public List<Pelicula> consultarPorGenero(String nombre);
}
