/**
 * Interfaz que define los métodos para realizar operaciones CRUD en la colección de favoritos en la base de datos MongoDB.
 */
package daos;

import dominio.Favorito;
import java.util.List;

public interface IFavoritoDAO {

    /**
     * Método para agregar un nuevo favorito a la base de datos.
     * @param favorito El objeto Favorito que se desea agregar.
     * @return El objeto Favorito agregado.
     */
    public Favorito agregar(Favorito favorito);

    /**
     * Método para consultar un favorito por usuario y película.
     * @param usuario El usuario del favorito que se desea consultar.
     * @param pelicula La película del favorito que se desea consultar.
     * @return El objeto Favorito consultado, o null si no se encuentra.
     */
    public Favorito consultar(String usuario, String pelicula);

    /**
     * Método para consultar todos los favoritos de un usuario.
     * @param usuario El usuario de los favoritos que se desean consultar.
     * @return Una lista de objetos Favorito del usuario especificado.
     */
    public List<Favorito> consultar(String usuario);

    /**
     * Método para eliminar un favorito de la base de datos.
     * @param favorito El objeto Favorito que se desea eliminar.
     * @return true si se eliminó correctamente, false de lo contrario.
     */
    public boolean eliminar(Favorito favorito);
}
