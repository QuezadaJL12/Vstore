/**
 * Clase que implementa la funcionalidad de iniciar sesión en la tienda virtual.
 */
package com.mycompany.vstoreiniciarsesion;

import com.mycompany.vstoredto.dtos.UsuarioDTO;
import com.mycompany.vstorenegocio.negocio.IUsuariosBO;
import com.mycompany.vstorenegocio.negocio.UsuariosBO;

public class FuncionalidadIniciarSesion implements IFuncionalidadIniciarSesion {

    private IUsuariosBO usuariosBO;

    /**
     * Constructor de la clase FuncionalidadIniciarSesion.
     * Inicializa el objeto de negocio para manejar los usuarios.
     */
    public FuncionalidadIniciarSesion() {
        usuariosBO = new UsuariosBO();
    }

    /**
     * Método para iniciar sesión de un usuario.
     * @param usuario El objeto UsuarioDTO con las credenciales del usuario que intenta iniciar sesión.
     * @return El objeto UsuarioDTO si las credenciales son correctas, null si no.
     */
    @Override
    public UsuarioDTO iniciarSesion(UsuarioDTO usuario) {
        UsuarioDTO usuarioConsultado = usuariosBO.consultarUsuario(usuario);
        
                
        return usuarioConsultado;
    }

}

