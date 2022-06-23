/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_tb2;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Analista_QA {

    ArrayList<Bug> Reportar = new ArrayList();
    String codigo;

    public Analista_QA() {
    }

    public void addBug(Bug lenguaje) {
        this.Reportar.add(lenguaje);
    }

    public ArrayList<Bug> getBugs() {
        return Reportar;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
