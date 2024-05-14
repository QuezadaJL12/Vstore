/**
 * Interfaz que define un método para obtener un cliente MongoDB.
 */
package daos;

import com.mongodb.client.MongoClient;

public interface IConexion {

    /**
     * Método para obtener un cliente MongoDB.
     * @return El objeto MongoClient para interactuar con la base de datos.
     */
    public MongoClient obtenerCliente();

}
