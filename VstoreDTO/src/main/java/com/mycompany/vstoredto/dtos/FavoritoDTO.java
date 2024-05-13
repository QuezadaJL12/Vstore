
package com.mycompany.vstoredto.dtos;


public class FavoritoDTO {

    private String id;
    private String usuario;
    private String pelicula;

    public FavoritoDTO(String id, String usuario, String pelicula) {
        this.id = id;
        this.usuario = usuario;
        this.pelicula = pelicula;
    }

    public FavoritoDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
