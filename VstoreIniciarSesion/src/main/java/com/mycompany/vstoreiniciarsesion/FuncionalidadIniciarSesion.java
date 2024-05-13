/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vstoreiniciarsesion;

import com.mycompany.vstoredto.dtos.UsuarioDTO;
import com.mycompany.vstorenegocio.negocio.IUsuariosBO;
import com.mycompany.vstorenegocio.negocio.UsuariosBO;

/**
 *
 * @author af_da
 */
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
