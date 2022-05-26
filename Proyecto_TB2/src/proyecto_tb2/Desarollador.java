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
public class Desarollador {
    int codigo_D;
    String nombre;
    ArrayList<String>lenguajes=new ArrayList();
    ArrayList<String>tecnologias=new ArrayList();
    Bug reparar;
     ArrayList<Proyecto_Software>proyectos=new ArrayList();

    public String getProject(int index){
        return proyectos.get(index).getNombre_P();
    }

    public Desarollador(int codigo_D, String nombre) {
        this.codigo_D = codigo_D;
        this.nombre = nombre;
    }

    public int getCodigo_D() {
        return codigo_D;
    }

    public void setCodigo_D(int codigo_D) {
        this.codigo_D = codigo_D;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getLenguajes() {
        return lenguajes;
    }

    public void addLenguaje(String lenguaje) {
        this.lenguajes.add(lenguaje);
    }

    public ArrayList<String> getTecnologias() {
        return tecnologias;
    }

    public void addTecnologia(String tecnologia) {
        this.tecnologias.add(tecnologia);
    }

    public Bug getReparar() {
        return reparar;
    }

    public void setReparar(Bug reparar) {
        this.reparar = reparar;
    }
    
    
}
