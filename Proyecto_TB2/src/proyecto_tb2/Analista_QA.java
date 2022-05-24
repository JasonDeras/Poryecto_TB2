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
public class Analista_QA {
    Bug Reportar;

    public Analista_QA(Bug Reportar) {
        this.Reportar = Reportar;
    }

    public Bug getReportar() {
        return Reportar;
    }

    public void setReportar(Bug Reportar) {
        this.Reportar = Reportar;
    }
    
    
}

