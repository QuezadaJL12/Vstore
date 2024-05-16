/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import daos.FavoritoDAO;
import daos.PeliculaDAO;
import daos.UsuarioDAO;
import dominio.Favorito;
import dominio.Pelicula;
import dominio.Usuario;

/**
 *
 * @author af_da
 */
public class PruebaFavoritos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FavoritoDAO f = new FavoritoDAO();
        UsuarioDAO u = new UsuarioDAO();
        PeliculaDAO p = new PeliculaDAO();
        
        
        Usuario usuario = u.consultar("664311dace1f853c668fe56e");
        Favorito favorito = new Favorito();
        Pelicula pelicula = p.consultarPorNombre("qwe");
        favorito.setUsuario(usuario.getId());
        favorito.setPelicula(pelicula.getId());
        f.agregar(favorito);
    }

}
