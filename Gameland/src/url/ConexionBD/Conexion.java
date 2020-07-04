
package url.conexionBD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
            Conexion.emf=Persistence.createEntityManagerFactory("gameland");
        }
        return emf;
    }
    
    
    
}
