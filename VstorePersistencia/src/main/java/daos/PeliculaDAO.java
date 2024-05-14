/**
 * Clase que implementa la interfaz IPeliculaDAO y define los métodos para realizar operaciones CRUD en la colección de películas en la base de datos MongoDB.
 */
package daos;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import dominio.Pelicula;
import java.util.LinkedList;
import java.util.List;
import static com.mongodb.client.model.Filters.regex;
import static com.mongodb.client.model.Filters.eq;

public class PeliculaDAO implements IPeliculaDAO {

    private IConexion conexion;

    /**
     * Constructor de la clase PeliculaDAO que inicializa la conexión con la base de datos.
     */
    public PeliculaDAO() {
        conexion = new Conexion();
    }

    @Override
    public Pelicula agregar(Pelicula pelicula) {
        MongoClient cliente = conexion.obtenerCliente();
        MongoDatabase baseDatos = cliente.getDatabase("vstore");
        MongoCollection<Pelicula> coleccion = baseDatos.getCollection("peliculas", Pelicula.class);
        coleccion.insertOne(pelicula);
        return pelicula;
    }

    @Override
    public List<Pelicula> consultar() {
        MongoClient cliente = conexion.obtenerCliente();
        MongoDatabase baseDatos = cliente.getDatabase("vstore");
        MongoCollection<Pelicula> coleccion = baseDatos.getCollection("peliculas", Pelicula.class);
        FindIterable<Pelicula> resultados = coleccion.find();
        List<Pelicula> listaPelicula = new LinkedList<>();
        resultados.into(listaPelicula);
        return listaPelicula;
    }

    @Override
    public List<Pelicula> consultar(String nombre) {
        MongoClient cliente = conexion.obtenerCliente();
        MongoDatabase baseDatos = cliente.getDatabase("vstore");
        MongoCollection<Pelicula> coleccion = baseDatos.getCollection("peliculas", Pelicula.class);
        FindIterable<Pelicula> resultados = coleccion.find(regex("nombre", "^" + nombre, "i"));
        List<Pelicula> listaPelicula = new LinkedList<>();
        resultados.into(listaPelicula);
        return listaPelicula;
    }

    @Override
    public List<Pelicula> consultarPorGenero(String nombre) {
        MongoClient cliente = conexion.obtenerCliente();
        MongoDatabase baseDatos = cliente.getDatabase("vstore");
        MongoCollection<Pelicula> coleccion = baseDatos.getCollection("peliculas", Pelicula.class);
        FindIterable<Pelicula> resultados = coleccion.find(regex("genero", "^" + nombre, "i"));
        List<Pelicula> listaPelicula = new LinkedList<>();
        resultados.into(listaPelicula);
        return listaPelicula;
    }

    @Override
    public Pelicula consultarPorNombre(String nombre) {
        MongoClient cliente = conexion.obtenerCliente();
        MongoDatabase baseDatos = cliente.getDatabase("vstore");
        MongoCollection<Pelicula> coleccion = baseDatos.getCollection("peliculas", Pelicula.class);
        FindIterable<Pelicula> resultados = coleccion.find(eq("nombre", nombre));

        return resultados.first();
    }
}
