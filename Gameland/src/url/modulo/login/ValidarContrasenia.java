/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.login;

import javax.persistence.EntityManagerFactory;
import url.conexionBD.Conexion;
import url.controlador.LoginJpaController;
import url.controladorBD.Login;

/**
 *
 * @author PAOLITA
 */
public class ValidarContrasenia implements ValidarUsuario{
    private EntityManagerFactory emf = Conexion.obtenerConexion();
    LoginJpaController controllogin = new LoginJpaController(emf);
    private Login encontrado;
    @Override
    public boolean validardatos(String usuario, String contraseña) {
        encontrado = controllogin.buscar(usuario, contraseña);
        if(encontrado != null){
            return true;
        }
        return false;
    }

    @Override
    public Login Getusuarioconfirmado() {
        return encontrado;
    }

    
}
