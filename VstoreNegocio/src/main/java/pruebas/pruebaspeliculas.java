/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import com.mycompany.vstorenegocio.negocio.ConsultarPeliculasBO;

/**
 *
 * @author af_da
 */
public class pruebaspeliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConsultarPeliculasBO cs = new ConsultarPeliculasBO();
        System.out.println(cs.consultarPorNombre("qwe"));
    }

}
