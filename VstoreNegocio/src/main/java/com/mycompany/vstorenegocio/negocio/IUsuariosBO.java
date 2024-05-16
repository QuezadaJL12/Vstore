/**
 * Interfaz que define la lógica de negocio para manejar los usuarios en la tienda virtual.
 */
package com.mycompany.vstorenegocio.negocio;

import com.mycompany.vstoredto.dtos.UsuarioDTO;
import dominio.Usuario;

public interface IUsuariosBO {

    /**
     * Método para agregar un nuevo usuario.
     *
     * @param usuario El objeto UsuarioDTO que representa el usuario que se
     * desea agregar.
     */
    public void agregarUsuario(UsuarioDTO usuario);

    /**
     * Método para consultar un usuario.
     *
     * @param usuario El objeto UsuarioDTO que representa el usuario que se
     * desea consultar.
     * @return El objeto UsuarioDTO del usuario consultado, o null si no se
     * encuentra.
     */
    public UsuarioDTO consultarUsuario(UsuarioDTO usuario);

    /**
     * Método para consultar un usuario.
     *
     * @param usuario El objeto UsuarioDTO que representa el usuario que se
     * desea consultar.
     * @return El objeto UsuarioDTO del usuario consultado, o null si no se
     * encuentra.
     */
    public UsuarioDTO consultarUsuario(String id);

    /**
     * Método para consultar un usuario por su nombre.
     *
     * @param nombre El nombre del usuario que se desea consultar.
     * @return El objeto UsuarioDTO del usuario consultado, o null si no se
     * encuentra.
     */
    public UsuarioDTO consultarUsuarioPorNombre(String nombre);

    /**
     * Método para convertir un objeto Usuario a UsuarioDTO.
     *
     * @param usuario El objeto Usuario que se desea convertir.
     * @return El objeto UsuarioDTO equivalente.
     */
    public UsuarioDTO convertirUsuarioADTO(Usuario usuario);

    /**
     * Método para convertir un objeto UsuarioDTO a Usuario.
     *
     * @param usuario El objeto UsuarioDTO que se desea convertir.
     * @return El objeto Usuario equivalente.
     */
    public Usuario convertirDTOAUsuario(UsuarioDTO usuario);
}
