/**
 * Clase que representa un objeto DTO para un usuario en la tienda virtual.
 */
package com.mycompany.vstoredto.dtos;

public class UsuarioDTO {
    private String id;
    private String nombre;
    private String usuario;
    private String contrasenia;

    /**
     * Constructor por defecto de la clase UsuarioDTO.
     */
    public UsuarioDTO() {
    }

    /**
     * Constructor de la clase UsuarioDTO.
     * @param id El identificador del usuario.
     * @param nombre El nombre del usuario.
     * @param usuario El nombre de usuario del usuario.
     * @param contrasenia La contraseña del usuario.
     */
    public UsuarioDTO(String id, String nombre, String usuario, String contrasenia) {
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    /**
     * Método para obtener el identificador del usuario.
     * @return El identificador del usuario.
     */
    public String getId() {
        return id;
    }

    /**
     * Método para establecer el identificador del usuario.
     * @param id El identificador del usuario.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Método para obtener el nombre del usuario.
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del usuario.
     * @param nombre El nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el nombre de usuario del usuario.
     * @return El nombre de usuario del usuario.
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Método para establecer el nombre de usuario del usuario.
     * @param usuario El nombre de usuario del usuario.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Método para obtener la contraseña del usuario.
     * @return La contraseña del usuario.
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Método para establecer la contraseña del usuario.
     * @param contrasenia La contraseña del usuario.
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
