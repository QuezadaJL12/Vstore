package dominio;

import org.bson.types.ObjectId;

/**
 * Representa un favorito de usuario, donde se almacena la información de películas favoritas.
 * Esta clase está diseñada para ser utilizada en conjunción con bases de datos que admiten
 * el tipo ObjectId, como MongoDB.
 */
public class Favorito {

    private ObjectId id; // Identificador único del favorito
    private String usuario; // Nombre de usuario del propietario del favorito
    private String pelicula; // Título de la película favorita

    /**
     * Constructor por defecto.
     */
    public Favorito() {
    }

    /**
     * Constructor que inicializa un nuevo favorito con los detalles especificados.
     *
     * @param id El identificador único del favorito, como un objeto ObjectId.
     * @param usuario El nombre de usuario del propietario del favorito.
     * @param pelicula El título de la película que se ha marcado como favorita.
     */
    public Favorito(ObjectId id, String usuario, String pelicula) {
        this.id = id;
        this.usuario = usuario;
        this.pelicula = pelicula;
    }

    /**
     * Devuelve el identificador único del favorito.
     *
     * @return El ObjectId que representa el identificador único del favorito.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador único del favorito.
     *
     * @param id El nuevo ObjectId para el favorito.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Devuelve el nombre de usuario del propietario del favorito.
     *
     * @return Una cadena que representa el nombre de usuario del propietario.
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Establece el nombre de usuario del propietario del favorito.
     *
     * @param usuario La nueva cadena que representa el nombre de usuario del propietario.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Devuelve el título de la película favorita.
     *
     * @return Una cadena que representa el título de la película favorita.
     */
    public String getPelicula() {
        return pelicula;
    }

    /**
     * Establece el título de la película favorita.
     *
     * @param pelicula La nueva cadena que representa el título de la película favorita.
     */
    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }
    
}
