
package com.mycompany.vstoreregistrarusuario;

import com.mycompany.vstoredto.dtos.UsuarioDTO;
import com.mycompany.vstorenegocio.negocio.IUsuariosBO;
import com.mycompany.vstorenegocio.negocio.UsuariosBO;


public class FuncionalidadRegistrarUsuario implements IFuncionalidadRegistrarUsuario {
    
    private IUsuariosBO usuariosBO;
    
    public FuncionalidadRegistrarUsuario() {
        usuariosBO = new UsuariosBO();
    }
    
    @Override
    public void registrarUsuario(UsuarioDTO usuario) {
        usuariosBO.agregarUsuario(usuario);
    }
    
}
