
package daos;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import dominio.Favorito;
import java.util.LinkedList;
import java.util.List;
import static com.mongodb.client.model.Filters.regex;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.result.DeleteResult;


public class FavoritoDAO implements IFavoritoDAO {

    private IConexion conexion;

    public FavoritoDAO() {
        conexion = new Conexion();
    }

    @Override
    public Favorito agregar(Favorito favorito) {
        MongoClient cliente = conexion.obtenerCliente();
        MongoDatabase baseDatos = cliente.getDatabase("vstore");
        MongoCollection<Favorito> coleccion = baseDatos.getCollection("favoritos", Favorito.class);
        coleccion.insertOne(favorito);
        return favorito;
    }

    @Override
    public Favorito consultar(String usuario, String pelicula) {
        MongoClient cliente = conexion.obtenerCliente();
        MongoDatabase baseDatos = cliente.getDatabase("vstore");
        MongoCollection<Favorito> coleccion = baseDatos.getCollection("favoritos", Favorito.class);
        FindIterable<Favorito> resultados = coleccion.find(and(eq("usuario", usuario), eq("pelicula", pelicula)));

        return resultados.first();
    }

    @Override
    public List<Favorito> consultar(String usuario) {
        MongoClient cliente = conexion.obtenerCliente();
        MongoDatabase baseDatos = cliente.getDatabase("vstore");
        MongoCollection<Favorito> coleccion = baseDatos.getCollection("favoritos", Favorito.class);
        FindIterable<Favorito> resultados = coleccion.find(and(eq("usuario", usuario)));
        List<Favorito> listaPelicula = new LinkedList<>();
        resultados.into(listaPelicula);
        return listaPelicula;
    }

    @Override
    public boolean eliminar(Favorito favorito) {
        MongoClient cliente = conexion.obtenerCliente();
        MongoDatabase baseDatos = cliente.getDatabase("vstore");
        MongoCollection<Favorito> coleccion = baseDatos.getCollection("favoritos", Favorito.class);
        DeleteResult response = coleccion.deleteOne(eq("usuario", favorito.getUsuario()));
        return response.getDeletedCount() == 1;
    }

}
