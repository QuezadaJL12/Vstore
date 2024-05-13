
package daos;

import dominio.Usuario;


public interface IUsuarioDAO {

    public void agregar(Usuario usuario);

    public Usuario consultar(Usuario usuario);

    public Usuario consultarPorNombre(String nombre);
}
