package dominio;

import org.bson.types.ObjectId;

/**
 * Clase Usuario que representa a un usuario dentro de un sistema.
 * Incluye información básica como identificación, nombre, nombre de usuario y contraseña.
 */
public class Usuario {
    private ObjectId id;          // Identificador único del usuario, adecuado para bases de datos como MongoDB.
    private String nombre;        // Nombre completo del usuario.
    private String usuario;       // Nombre de usuario para el inicio de sesión.
    private String contrasenia;   // Contraseña del usuario para el inicio de sesión.

    /**
     * Constructor por defecto de la clase Usuario.
     */
    public Usuario() {
    }

    /**
     * Constructor con parámetros para crear un nuevo usuario.
     * 
     * @param id ObjectId que representa el identificador único del usuario.
     * @param nombre El nombre completo del usuario.
     * @param usuario El nombre de usuario utilizado para el inicio de sesión.
     * @param contrasenia La contraseña del usuario para el inicio de sesión.
     */
    public Usuario(ObjectId id, String nombre, String usuario, String contrasenia) {
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    /**
     * Obtiene el identificador único del usuario.
     * 
     * @return El ObjectId que representa el identificador del usuario.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador único del usuario.
     * 
     * @param id El ObjectId nuevo para el usuario.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre completo del usuario.
     * 
     * @return Una cadena que representa el nombre completo del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre completo del usuario.
     * 
     * @param nombre La nueva cadena que representa el nombre completo del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre de usuario.
     * 
     * @return Una cadena que representa el nombre de usuario para inicio de sesión.
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Establece el nombre de usuario para inicio de sesión.
     * 
     * @param usuario La nueva cadena que representa el nombre de usuario.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtiene la contraseña del usuario.
     * 
     * @return Una cadena que representa la contraseña del usuario.
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Establece la contraseña del usuario.
     * 
     * @param contrasenia La nueva contraseña del usuario.
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
