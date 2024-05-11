
package com.mycompany.vstoreiniciarsesion;

import com.mycompany.vstoredto.dtos.UsuarioDTO;
import com.mycompany.vstorenegocio.negocio.IUsuariosBO;
import com.mycompany.vstorenegocio.negocio.UsuariosBO;


public class FuncionalidadIniciarSesion implements IFuncionalidadIniciarSesion {

    private IUsuariosBO usuariosBO;

    public FuncionalidadIniciarSesion() {
        usuariosBO = new UsuariosBO();
    }

    @Override
    public UsuarioDTO iniciarSesion(UsuarioDTO usuario) {
        UsuarioDTO usuarioConsultado = usuariosBO.consultarUsuario(usuario);
        return usuarioConsultado;
    }

}
