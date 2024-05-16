/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import org.bson.types.ObjectId;

/**
 *
 * @author af_da
 */
public class Favorito {

    private ObjectId id;
    private ObjectId usuario;
    private ObjectId pelicula;

    public Favorito() {
    }

    public Favorito(ObjectId id, ObjectId usuario, ObjectId pelicula) {
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

    public ObjectId getUsuario() {
        return usuario;
    }

    public void setUsuario(ObjectId usuario) {
        this.usuario = usuario;
    }

    public ObjectId getPelicula() {
        return pelicula;
    }

    public void setPelicula(ObjectId pelicula) {
        this.pelicula = pelicula;
    }

}
