/**
 * Clase que proporciona métodos para establecer una conexión con la base de datos MongoDB.
 */
package daos;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

public class Conexion implements IConexion {

    // Nombre de la base de datos MongoDB
    String nombreBaseDatos = "Vstore";
    // Cadena de conexión para MongoDB
    String cadenaConexion = "mongodb://127.0.0.1:27017";

    /**
     * Método para obtener un cliente MongoDB.
     * @return El objeto MongoClient para interactuar con la base de datos.
     */
    @Override
    public MongoClient obtenerCliente() {
        // Registrar un proveedor de códecs para las clases POJO
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        // Configurar los ajustes del cliente MongoDB
        MongoClientSettings settings = MongoClientSettings.builder()
                .codecRegistry(pojoCodecRegistry).applyConnectionString(new ConnectionString(cadenaConexion))
                .build();
        // Crear y devolver un nuevo cliente MongoDB
        MongoClient cliente = MongoClients.create(settings);
        return cliente;
    }

}
