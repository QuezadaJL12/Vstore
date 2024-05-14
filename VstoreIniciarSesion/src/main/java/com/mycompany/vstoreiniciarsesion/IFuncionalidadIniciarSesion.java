/**
 * Interfaz que define la funcionalidad de iniciar sesión en la tienda virtual.
 */
package com.mycompany.vstoreiniciarsesion;

import com.mycompany.vstoredto.dtos.UsuarioDTO;

public interface IFuncionalidadIniciarSesion {
    /**
     * Método para iniciar sesión de un usuario.
     * @param usuario El objeto UsuarioDTO con las credenciales del usuario que intenta iniciar sesión.
     * @return El objeto UsuarioDTO si las credenciales son correctas, null si no.
     */
    public UsuarioDTO iniciarSesion(UsuarioDTO usuario);
}
