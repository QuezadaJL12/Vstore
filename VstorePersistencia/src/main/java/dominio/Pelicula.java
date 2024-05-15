package dominio;

import org.bson.types.ObjectId;

/**
 * Representa una película en un sistema de gestión de contenido cinematográfico.
 * Esta clase incluye información sobre el título, imagen, género y descripción de la película.
 */
public class Pelicula {

    private ObjectId id; // Identificador único de la película, adecuado para bases de datos como MongoDB.
    private String nombre; // Nombre de la película.
    private byte[] img; // Imagen de la película almacenada en formato de array de bytes.
    private String genero; // Género de la película.
    private String descripcion; // Descripción detallada de la película.

    /**
     * Constructor predeterminado para la clase Pelicula.
     */
    public Pelicula() {
    }

    /**
     * Constructor que inicializa una nueva instancia de Pelicula con los parámetros especificados,
     * omitiendo la descripción.
     *
     * @param nombre El nombre de la película.
     * @param img La imagen de la película en formato de array de bytes.
     * @param genero El género de la película.
     */
    public Pelicula(String nombre, byte[] img, String genero) {
        this.nombre = nombre;
        this.img = img;
        this.genero = genero;
    }

    /**
     * Devuelve el identificador único de la película.
     *
     * @return El ObjectId que representa el identificador único de la película.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador único de la película.
     *
     * @param id El nuevo ObjectId para identificar esta película.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Devuelve el nombre de la película.
     *
     * @return Una cadena que representa el nombre de la película.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la película.
     *
     * @param nombre La nueva cadena que representa el nombre de la película.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la imagen de la película.
     *
     * @return Un array de bytes que representa la imagen de la película.
     */
    public byte[] getImg() {
        return img;
    }

    /**
     * Establece la imagen de la película.
     *
     * @param img El nuevo array de bytes que representa la imagen de la película.
     */
    public void setImg(byte[] img) {
        this.img = img;
    }

    /**
     * Devuelve el género de la película.
     *
     * @return Una cadena que representa el género de la película.
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Establece el género de la película.
     *
     * @param genero La nueva cadena que representa el género de la película.
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Devuelve la descripción de la película.
     *
     * @return Una cadena que representa la descripción detallada de la película.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción de la película.
     *
     * @param descripcion La nueva descripción detallada de la película.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
