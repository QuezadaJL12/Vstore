
package dominio;

import org.bson.types.ObjectId;


public class Favorito {

    private ObjectId id;
    private String usuario;
    private String pelicula;

    public Favorito() {
    }

    public Favorito(ObjectId id, String usuario, String pelicula) {
        this.id = id;
        this.usuario = usuario;
        this.pelicula = pelicula;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }
    
    
}
