
package com.mycompany.vstorenegocio.negocio;

import com.mycompany.vstoredto.dtos.UsuarioDTO;
import daos.IUsuarioDAO;
import daos.UsuarioDAO;
import dominio.Usuario;


public class UsuariosBO implements IUsuariosBO {

    private IUsuarioDAO usuarioDAO;

    public UsuariosBO() {
        usuarioDAO = new UsuarioDAO();
    }

    @Override
    public void agregarUsuario(UsuarioDTO usuario) {
        usuarioDAO.agregar(convertirDTOAUsuario(usuario));
    }

    @Override
    public UsuarioDTO consultarUsuario(UsuarioDTO usuario) {
        return this.convertirUsuarioADTO(usuarioDAO.consultar(convertirDTOAUsuario(usuario)));
    }

    @Override
    public UsuarioDTO consultarUsuarioPorNombre(String nombre) {
        Usuario usuario = usuarioDAO.consultarPorNombre(nombre);
        return this.convertirUsuarioADTO(usuario);
    }

    @Override
    public UsuarioDTO convertirUsuarioADTO(Usuario usuario) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setNombre(usuario.getNombre());
        usuarioDTO.setUsuario(usuario.getUsuario());
        usuarioDTO.setContrasenia(usuario.getContrasenia());
        return usuarioDTO;
    }

    @Override
    public Usuario convertirDTOAUsuario(UsuarioDTO usuario) {

        Usuario usuarioNuevo = new Usuario();
        usuarioNuevo.setNombre(usuario.getNombre());
        usuarioNuevo.setUsuario(usuario.getUsuario());
        usuarioNuevo.setContrasenia(usuario.getContrasenia());
        return usuarioNuevo;
    }

}
