/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_tb2;

/**
 *
 * @author HP
 */
public class Usuarios {
    String credenciales;
    String clave;

    public Usuarios(String credenciales, String clave) {
        this.credenciales = credenciales;
        this.clave = clave;
    }

    public String getCredenciales() {
        return credenciales;
    }

    public void setCredenciales(String credenciales) {
        this.credenciales = credenciales;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
}
