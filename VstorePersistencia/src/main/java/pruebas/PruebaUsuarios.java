/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import daos.UsuarioDAO;
import dominio.Usuario;

/**
 *
 * @author af_da
 */
public class PruebaUsuarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = new Usuario();
        usuario.setUsuario("12");
        usuario.setContrasenia("12");
        System.out.println(usuarioDAO.consultar(usuario));
    }
    
}
