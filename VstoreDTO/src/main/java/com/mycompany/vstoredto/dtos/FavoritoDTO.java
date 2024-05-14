/**
 * Clase que representa un objeto DTO para los favoritos en la tienda virtual.
 */
package com.mycompany.vstoredto.dtos;

public class FavoritoDTO {

    private String id;
    private String usuario;
    private String pelicula;

    /**
     * Constructor de la clase FavoritoDTO.
     * @param id El identificador del favorito.
     * @param usuario El nombre de usuario asociado al favorito.
     * @param pelicula El nombre de la película asociada al favorito.
     */
    public FavoritoDTO(String id, String usuario, String pelicula) {
        this.id = id;
        this.usuario = usuario;
        this.pelicula = pelicula;
    }

    /**
     * Constructor por defecto de la clase FavoritoDTO.
     */
    public FavoritoDTO() {
    }

    /**
     * Método para obtener el identificador del favorito.
     * @return El identificador del favorito.
     */
    public String getId() {
        return id;
    }

    /**
     * Método para establecer el identificador del favorito.
     * @param id El identificador del favorito.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Método para obtener el nombre de usuario asociado al favorito.
     * @return El nombre de usuario asociado al favorito.
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Método para establecer el nombre de usuario asociado al favorito.
     * @param usuario El nombre de usuario asociado al favorito.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Método para obtener el nombre de la película asociada al favorito.
     * @return El nombre de la película asociada al favorito.
     */
    public String getPelicula() {
        return pelicula;
    }

    /**
     * Método para establecer el nombre de la película asociada al favorito.
     * @param pelicula El nombre de la película asociada al favorito.
     */
    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

}
