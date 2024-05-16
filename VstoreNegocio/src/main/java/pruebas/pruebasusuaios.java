/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import com.mycompany.vstoredto.dtos.UsuarioDTO;
import com.mycompany.vstorenegocio.negocio.UsuariosBO;

/**
 *
 * @author af_da
 */
public class pruebasusuaios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UsuariosBO usi = new UsuariosBO();
        UsuarioDTO usuario = new UsuarioDTO();
        usuario.setUsuario("da");
        usuario.setContrasenia("12");
        System.out.println(usi.consultarUsuario(usuario));

    }

}
