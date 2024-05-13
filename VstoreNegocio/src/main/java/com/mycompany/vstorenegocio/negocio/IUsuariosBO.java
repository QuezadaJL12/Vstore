package com.mycompany.vstorenegocio.negocio;

import com.mycompany.vstoredto.dtos.UsuarioDTO;
import dominio.Usuario;

public interface IUsuariosBO {

    public void agregarUsuario(UsuarioDTO usuario);

    public UsuarioDTO consultarUsuario(UsuarioDTO usuario);

    public UsuarioDTO consultarUsuarioPorNombre(String nombre);

    public UsuarioDTO convertirUsuarioADTO(Usuario usuario);

    public Usuario convertirDTOAUsuario(UsuarioDTO usuario);

}
