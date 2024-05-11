
package pruebas;

import daos.UsuarioDAO;
import dominio.Usuario;


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
