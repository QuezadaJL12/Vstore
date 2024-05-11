
package com.mycompany.vstoredto.dtos;


public class PeliculaDTO {

    private String id;
    private String nombre;
    private byte[] img;
    private String genero;

    public PeliculaDTO(String nombre, byte[] img, String genero) {
        this.nombre = nombre;
        this.img = img;
        this.genero = genero;
    }

    public PeliculaDTO(String id, String nombre, byte[] img, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.img = img;
        this.genero = genero;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
