
package daos;

import dominio.Favorito;
import java.util.List;


public interface IFavoritoDAO {

    public Favorito agregar(Favorito favorito);

    public Favorito consultar(String usuario, String pelicula);

    public List<Favorito> consultar(String usuario);

    public boolean eliminar(Favorito favorito);
}
