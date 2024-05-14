/**
 * Clase que representa un objeto DTO para una película en la tienda virtual.
 */
package com.mycompany.vstoredto.dtos;

public class PeliculaDTO {

    private String id;
    private String nombre;
    private byte[] img;
    private String genero;
    private String descripcion;

    /**
     * Constructor de la clase PeliculaDTO.
     * @param nombre El nombre de la película.
     * @param img El contenido de la imagen de la película.
     * @param genero El género de la película.
     */
    public PeliculaDTO(String nombre, byte[] img, String genero) {
        this.nombre = nombre;
        this.img = img;
        this.genero = genero;
    }

    /**
     * Constructor de la clase PeliculaDTO.
     * @param id El identificador de la película.
     * @param nombre El nombre de la película.
     * @param img El contenido de la imagen de la película.
     * @param genero El género de la película.
     */
    public PeliculaDTO(String id, String nombre, byte[] img, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.img = img;
        this.genero = genero;
    }

    /**
     * Método para obtener la descripción de la película.
     * @return La descripción de la película.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método para establecer la descripción de la película.
     * @param descripcion La descripción de la película.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método para obtener el identificador de la película.
     * @return El identificador de la película.
     */
    public String getId() {
        return id;
    }

    /**
     * Método para establecer el identificador de la película.
     * @param id El identificador de la película.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Método para obtener el nombre de la película.
     * @return El nombre de la película.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre de la película.
     * @param nombre El nombre de la película.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el contenido de la imagen de la película.
     * @return El contenido de la imagen de la película.
     */
    public byte[] getImg() {
        return img;
    }

    /**
     * Método para establecer el contenido de la imagen de la película.
     * @param img El contenido de la imagen de la película.
     */
    public void setImg(byte[] img) {
        this.img = img;
    }

    /**
     * Método para obtener el género de la película.
     * @return El género de la película.
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Método para establecer el género de la película.
     * @param genero El género de la película.
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
