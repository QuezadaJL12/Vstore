/**
 * Clase que implementa la interfaz IUsuarioDAO y define los métodos para realizar operaciones CRUD en la colección de usuarios en la base de datos MongoDB.
 */
package daos;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import dominio.Usuario;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

public class UsuarioDAO implements IUsuarioDAO {

    private IConexion conexion;

    /**
     * Constructor de la clase UsuarioDAO que inicializa la conexión con la base
     * de datos.
     */
    public UsuarioDAO() {
        conexion = new Conexion();
    }

    @Override
    public void agregar(Usuario usuario) {
        MongoClient cliente = conexion.obtenerCliente();
        MongoDatabase baseDatos = cliente.getDatabase("vstore");
        MongoCollection<Usuario> coleccion = baseDatos.getCollection("usuarios", Usuario.class);
        coleccion.insertOne(usuario);
    }

    @Override
    public Usuario consultar(Usuario usuario) {
        MongoClient cliente = conexion.obtenerCliente();
        MongoDatabase baseDatos = cliente.getDatabase("vstore");
        MongoCollection<Usuario> coleccion = baseDatos.getCollection("usuarios", Usuario.class);

        // Construir la consulta
        Bson query = Filters.and(
                Filters.eq("usuario", usuario.getUsuario()),
                Filters.eq("contrasenia", usuario.getContrasenia())
        );

        // Realizar la consulta
        Usuario result = coleccion.find(query).first();
        return result;
    }

    @Override
    public Usuario consultarPorNombre(String nombre) {
        MongoClient cliente = conexion.obtenerCliente();
        MongoDatabase baseDatos = cliente.getDatabase("vstore");
        MongoCollection<Usuario> coleccion = baseDatos.getCollection("usuarios", Usuario.class);

        // Construir la consulta
        Bson query = Filters.eq("usuario", nombre);

        // Realizar la consulta
        Usuario result = coleccion.find(query).first();
        return result;
    }

    @Override
    public Usuario consultar(String id) {
        MongoClient cliente = conexion.obtenerCliente();
        MongoDatabase baseDatos = cliente.getDatabase("vstore");
        MongoCollection<Usuario> coleccion = baseDatos.getCollection("usuarios", Usuario.class);

        Bson query = Filters.eq("_id", new ObjectId(id));

        Usuario result = coleccion.find(query).first();
        return result;
    }

}
