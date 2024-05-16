/**
 * Clase que proporciona métodos para interactuar con la colección de favoritos en la base de datos MongoDB.
 */
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
import org.bson.types.ObjectId;

public class FavoritoDAO implements IFavoritoDAO {

    private IConexion conexion;

    /**
     * Constructor de la clase FavoritoDAO.
     */
    public FavoritoDAO() {
        conexion = new Conexion();
    }

    /**
     * Método para agregar un nuevo favorito a la base de datos.
     *
     * @param favorito El objeto Favorito que se desea agregar.
     * @return El objeto Favorito agregado.
     */
    @Override
    public Favorito agregar(Favorito favorito) {
        MongoClient cliente = conexion.obtenerCliente();
        MongoDatabase baseDatos = cliente.getDatabase("vstore");
        MongoCollection<Favorito> coleccion = baseDatos.getCollection("favoritos", Favorito.class);
        coleccion.insertOne(favorito);
        return favorito;
    }

    /**
     * Método para consultar un favorito por usuario y película.
     *
     * @param usuario El usuario del favorito que se desea consultar.
     * @param pelicula La película del favorito que se desea consultar.
     * @return El objeto Favorito consultado, o null si no se encuentra.
     */
    @Override
    public Favorito consultar(String usuario, String pelicula) {
        MongoClient cliente = conexion.obtenerCliente();
        MongoDatabase baseDatos = cliente.getDatabase("vstore");
        MongoCollection<Favorito> coleccion = baseDatos.getCollection("favoritos", Favorito.class);
        FindIterable<Favorito> resultados = coleccion.find(and(eq("usuario", new ObjectId(usuario)), eq("pelicula", new ObjectId(pelicula))));
        return resultados.first();
    }

    /**
     * Método para consultar todos los favoritos de un usuario.
     *
     * @param usuario El usuario de los favoritos que se desean consultar.
     * @return Una lista de objetos Favorito del usuario especificado.
     */
    @Override
    public List<Favorito> consultar(String id) {
        MongoClient cliente = conexion.obtenerCliente();
        MongoDatabase baseDatos = cliente.getDatabase("vstore");
        MongoCollection<Favorito> coleccion = baseDatos.getCollection("favoritos", Favorito.class);
        FindIterable<Favorito> resultados = coleccion.find(and(eq("usuario", new ObjectId(id))));
        List<Favorito> listaPelicula = new LinkedList<>();
        resultados.into(listaPelicula);
        return listaPelicula;
    }

    /**
     * Método para eliminar un favorito de la base de datos.
     *
     * @param favorito El objeto Favorito que se desea eliminar.
     * @return true si se eliminó correctamente, false de lo contrario.
     */
    @Override
    public boolean eliminar(Favorito favorito) {
        MongoClient cliente = conexion.obtenerCliente();
        MongoDatabase baseDatos = cliente.getDatabase("vstore");
        MongoCollection<Favorito> coleccion = baseDatos.getCollection("favoritos", Favorito.class);
        DeleteResult response = coleccion.deleteOne(and(eq("usuario", favorito.getUsuario()), eq("pelicula", favorito.getPelicula())));
        return response.getDeletedCount() == 1;
    }

}
