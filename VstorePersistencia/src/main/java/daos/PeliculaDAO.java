package daos;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import dominio.Pelicula;
import java.util.LinkedList;
import java.util.List;
import static com.mongodb.client.model.Filters.regex;

public class PeliculaDAO implements IPeliculaDAO {

    private IConexion conexion;

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

}