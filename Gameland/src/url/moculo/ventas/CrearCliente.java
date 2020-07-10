package url.moculo.ventas;

import javax.swing.JOptionPane;
import url.controlador.ClienteJpaController;
import url.controladorBD.Cliente;

public class CrearCliente {
    private ClienteJpaController clientJpa = new ClienteJpaController();
    private Cliente cliente=new Cliente();
    private String mensaje="";
    
    public String insertarCliente (String nit,String nombre,String direccion, String telefono){
        try{
            cliente.setId(Integer.BYTES);
            cliente.setNit(nit);
            cliente.setNombre(nombre);
            cliente.setDireccion(direccion);
            cliente.setTelefono(telefono);
            clientJpa.create(cliente);
            mensaje="Usuario creado con exito";
        }catch(Exception e){
           mensaje="error al crear el usuario";
        }
        return mensaje;
    }
    public String ActualizarCliente (String nit,String nombre,String direccion, String telefono){
        try{
            cliente.setId(Integer.BYTES);
            cliente.setNit(nit);
            cliente.setNombre(nombre);
            cliente.setDireccion(direccion);
            cliente.setTelefono(telefono);
            clientJpa.create(cliente);
            mensaje="Usuario creado con exito";
        }catch(Exception e){
           mensaje="error al crear el usuario";
        }
        return mensaje;
    }
    public String EliminarCliente (){
        return null;
    }
    

}
