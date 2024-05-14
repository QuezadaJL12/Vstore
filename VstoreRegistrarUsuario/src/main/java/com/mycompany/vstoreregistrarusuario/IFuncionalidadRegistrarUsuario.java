package com.mycompany.vstoreregistrarusuario;

import com.mycompany.vstoredto.dtos.UsuarioDTO;

/**
 * Esta interfaz define el contrato para la funcionalidad de registrar un usuario en el sistema.
 */
public interface IFuncionalidadRegistrarUsuario {
    
    /**
     * Registra un nuevo usuario en el sistema.
     * 
     * @param usuario El objeto UsuarioDTO que representa al usuario a registrar.
     */
    public void registrarUsuario(UsuarioDTO usuario);
}
