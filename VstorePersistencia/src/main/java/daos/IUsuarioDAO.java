/**
 * Interfaz que define los métodos para realizar operaciones CRUD en la colección de usuarios en la base de datos MongoDB.
 */
package daos;

import dominio.Usuario;

public interface IUsuarioDAO {

    /**
     * Método para agregar un nuevo usuario a la base de datos.
     *
     * @param usuario El objeto Usuario que se desea agregar.
     */
    public void agregar(Usuario usuario);

    /**
     * Método para consultar un usuario en la base de datos.
     *
     * @param usuario El objeto Usuario que se desea consultar.
     * @return El objeto Usuario consultado, o null si no se encuentra.
     */
    public Usuario consultar(Usuario usuario);

    /**
     * Método para consultar un usuario en la base de datos.
     *
     * @param usuario El objeto Usuario que se desea consultar.
     * @return El objeto Usuario consultado, o null si no se encuentra.
     */
    public Usuario consultar(String id);

    /**
     * Método para consultar un usuario por su nombre de usuario.
     *
     * @param nombre El nombre de usuario del usuario que se desea consultar.
     * @return El objeto Usuario consultado, o null si no se encuentra.
     */
    public Usuario consultarPorNombre(String nombre);
}
