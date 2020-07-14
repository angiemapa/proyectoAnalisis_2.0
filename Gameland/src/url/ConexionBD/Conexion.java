
package url.conexionBD;

import java.beans.PersistenceDelegate;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.spi.PersistenceProvider;
import javax.persistence.spi.PersistenceUnitInfo;
import javax.persistence.spi.ProviderUtil;

/**
 *
 * @author carlo
 */
public class Conexion {

    private static EntityManager em;
    private static EntityManagerFactory emf;
    
    private Conexion() { }

    public static EntityManagerFactory obtenerConexion(){
    
        if(Conexion.em==null){
            Conexion.emf= Persistence.createEntityManagerFactory("game");
        }
        return emf;
    }
}
