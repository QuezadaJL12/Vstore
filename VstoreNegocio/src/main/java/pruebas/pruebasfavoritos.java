/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import com.mycompany.vstoredto.dtos.FavoritoDTO;
import com.mycompany.vstoredto.dtos.PeliculaDTO;
import com.mycompany.vstoredto.dtos.UsuarioDTO;
import com.mycompany.vstorenegocio.negocio.ConsultarPeliculasBO;
import com.mycompany.vstorenegocio.negocio.FavoritosBO;
import com.mycompany.vstorenegocio.negocio.UsuariosBO;
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
public class pruebasfavoritos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FavoritosBO f = new FavoritosBO();
        UsuariosBO u = new UsuariosBO();
        ConsultarPeliculasBO c = new ConsultarPeliculasBO();

        UsuarioDTO usuario = u.consultarUsuario("664311dace1f853c668fe56e");
        FavoritoDTO favorito = new FavoritoDTO();
        PeliculaDTO pelicula = c.consultarPorNombre("qwe");
        favorito.setUsuario(usuario.getId());
        favorito.setPelicula(pelicula.getId());
        f.agregarFavorito(favorito);

    }

}
