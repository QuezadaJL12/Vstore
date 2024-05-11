
package dominio;

import org.bson.types.ObjectId;

public class Pelicula {

    private ObjectId id;
    private String nombre;
    private byte[] img;
    private String genero;

    public Pelicula(String nombre, byte[] img, String genero) {
        this.nombre = nombre;
        this.img = img;
        this.genero = genero;
    }

    public Pelicula() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
