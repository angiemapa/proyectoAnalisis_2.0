/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.login;

import url.controladorBD.Login;

/**
 *
 * @author PAOLITA
 */
public interface ValidarUsuario {
    boolean validardatos(String usuario, String contraseña);
    Login Getusuarioconfirmado();
}
