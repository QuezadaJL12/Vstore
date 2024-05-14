package com.mycompany.vstoreregistrarusuario;

import com.mycompany.vstoredto.dtos.UsuarioDTO;
import com.mycompany.vstorenegocio.negocio.IUsuariosBO;
import com.mycompany.vstorenegocio.negocio.UsuariosBO;

// Clase que implementa la funcionalidad para registrar un nuevo usuario en el sistema
public class FuncionalidadRegistrarUsuario implements IFuncionalidadRegistrarUsuario {
    
    // Variable para manejar la lógica relacionada con los usuarios en el sistema
    private IUsuariosBO usuariosBO;
    
    // Constructor que inicializa el objeto para manejar la lógica de usuarios
    public FuncionalidadRegistrarUsuario() {
        usuariosBO = new UsuariosBO();
    }
    
    // Método para registrar un nuevo usuario en el sistema
    @Override
    public void registrarUsuario(UsuarioDTO usuario) {
        // Llama al método agregarUsuario del objeto usuariosBO para agregar el usuario al sistema
        usuariosBO.agregarUsuario(usuario);
    }
    
}
