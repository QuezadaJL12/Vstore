
package daos;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import dominio.Usuario;
import org.bson.Document;
import org.bson.conversions.Bson;

public class UsuarioDAO implements IUsuarioDAO {

    private IConexion conexion;

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
        System.out.println(usuario.getUsuario());
        System.out.println(usuario.getContrasenia());

        Bson query = Filters.and(
                Filters.eq("usuario", usuario.getUsuario()),
                Filters.eq("contrasenia", usuario.getContrasenia())
        );

        Usuario result = coleccion.find(query).first();
        return result;
    }

    @Override
    public Usuario consultarPorNombre(String nombre) {
        MongoClient cliente = conexion.obtenerCliente();
        MongoDatabase baseDatos = cliente.getDatabase("vstore");
        MongoCollection<Usuario> coleccion = baseDatos.getCollection("usuarios", Usuario.class);

        Bson query = Filters.eq("usuario", nombre);

        // Realizar la consulta
        Usuario result = coleccion.find(query).first();
        return result;
    }

}
