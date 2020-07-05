
package url.modulo.compras;

import javax.persistence.EntityManagerFactory;
import url.controlador.ProductoJpaController;
import url.controladorBD.Producto;

public class CrearProducto {
    private ProductoJpaController control;
    public void Crearproducto(EntityManagerFactory emf){
        this.control = new ProductoJpaController(emf);
    }
    public void nuevoproducto(Producto producto){
        this.control.create(producto);
    }
}
