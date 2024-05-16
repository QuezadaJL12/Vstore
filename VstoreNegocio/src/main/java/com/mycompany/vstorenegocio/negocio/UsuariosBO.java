/**
 * Clase que implementa la lógica de negocio para manejar los usuarios en la tienda virtual.
 */
package com.mycompany.vstorenegocio.negocio;

import com.mycompany.vstoredto.dtos.UsuarioDTO;
import daos.IUsuarioDAO;
import daos.UsuarioDAO;
import dominio.Usuario;

public class UsuariosBO implements IUsuariosBO {

    private IUsuarioDAO usuarioDAO;

    /**
     * Constructor de la clase UsuariosBO.
     */
    public UsuariosBO() {
        usuarioDAO = new UsuarioDAO();
    }

    /**
     * Método para agregar un nuevo usuario.
     *
     * @param usuario El objeto UsuarioDTO que representa el usuario que se
     * desea agregar.
     */
    @Override
    public void agregarUsuario(UsuarioDTO usuario) {
        usuarioDAO.agregar(convertirDTOAUsuario(usuario));
    }

    /**
     * Método para consultar un usuario.
     *
     * @param usuario El objeto UsuarioDTO que representa el usuario que se
     * desea consultar.
     * @return El objeto UsuarioDTO del usuario consultado, o null si no se
     * encuentra.
     */
    @Override
    public UsuarioDTO consultarUsuario(UsuarioDTO usuario) {
        Usuario usuarioConsultado = usuarioDAO.consultar(convertirDTOAUsuario(usuario));

        if (usuarioConsultado == null) {
            return null;
        }
        System.out.println(usuarioConsultado.getId());
        System.out.println(this.convertirUsuarioADTO(usuarioConsultado).getId()+"usuarios convertidoid");
        return this.convertirUsuarioADTO(usuarioConsultado);
    }

    /**
     * Método para consultar un usuario por su nombre.
     *
     * @param nombre El nombre del usuario que se desea consultar.
     * @return El objeto UsuarioDTO del usuario consultado, o null si no se
     * encuentra.
     */
    @Override
    public UsuarioDTO consultarUsuarioPorNombre(String nombre) {
        Usuario usuario = usuarioDAO.consultarPorNombre(nombre);
        return this.convertirUsuarioADTO(usuario);
    }

    /**
     * Método para convertir un objeto Usuario a UsuarioDTO.
     *
     * @param usuario El objeto Usuario que se desea convertir.
     * @return El objeto UsuarioDTO equivalente.
     */
    @Override
    public UsuarioDTO convertirUsuarioADTO(Usuario usuario) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        if (usuario.getId() != null) {
            usuarioDTO.setId(usuario.getId().toHexString());
        }

        usuarioDTO.setNombre(usuario.getNombre());
        usuarioDTO.setUsuario(usuario.getUsuario());
        usuarioDTO.setContrasenia(usuario.getContrasenia());
        return usuarioDTO;
    }

    /**
     * Método para convertir un objeto UsuarioDTO a Usuario.
     *
     * @param usuario El objeto UsuarioDTO que se desea convertir.
     * @return El objeto Usuario equivalente.
     */
    @Override
    public Usuario convertirDTOAUsuario(UsuarioDTO usuario) {
        Usuario usuarioNuevo = new Usuario();
        usuarioNuevo.setNombre(usuario.getNombre());
        usuarioNuevo.setUsuario(usuario.getUsuario());
        usuarioNuevo.setContrasenia(usuario.getContrasenia());
        return usuarioNuevo;
    }

    @Override
    public UsuarioDTO consultarUsuario(String id) {
        Usuario usuarioConsultado = usuarioDAO.consultar(id);
        if (usuarioConsultado == null) {
            return null;
        }
        return this.convertirUsuarioADTO(usuarioConsultado);
    }
}
