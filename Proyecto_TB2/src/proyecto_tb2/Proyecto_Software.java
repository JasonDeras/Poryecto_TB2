package proyecto_tb2;

import java.util.*;

public class Proyecto_Software {
    int codigo_P;
    String nombre_P;
    String fecha_I;
    String fecha_F;
    ArrayList<Desarollador>desarrolladores;
    ArrayList<Bug>bugs;
    ArrayList<Bug>bugs_finalizados;

    public Proyecto_Software(int codigo_P, String nombre_P) {
        this.codigo_P = codigo_P;
        this.nombre_P = nombre_P;
    }
    
    

    public Proyecto_Software(int codigo_P, String nombre_P, String fecha_I, String fecha_F) {
        this.codigo_P = codigo_P;
        this.nombre_P = nombre_P;
        this.fecha_I = fecha_I;
        this.fecha_F = fecha_F;
    }

    public int getCodigo_P() {
        return codigo_P;
    }

    public void setCodigo_P(int codigo_P) {
        this.codigo_P = codigo_P;
    }

    public String getNombre_P() {
        return nombre_P;
    }

    public void setNombre_P(String nombre_P) {
        this.nombre_P = nombre_P;
    }

    public String getFecha_I() {
        return fecha_I;
    }

    public void setFecha_I(String fecha_I) {
        this.fecha_I = fecha_I;
    }

    public String getFecha_F() {
        return fecha_F;
    }

    public void setFecha_F(String fecha_F) {
        this.fecha_F = fecha_F;
    }

    public ArrayList<Desarollador> getDesarrolladores() {
        return desarrolladores;
    }

    public void addDesarollador(Desarollador desarrolladores) {
        this.desarrolladores.add(desarrolladores);
    }

    public ArrayList<Bug> getBugs() {
        return bugs;
    }

    public void addBugs(Bug bug) {
        if (bug.getEstado().equalsIgnoreCase("finalizado")) {
           bugs_finalizados.add(bug);
        }else{
            bugs.add(bug);
        }
    }

    public ArrayList<Bug> getBugs_finalizados() {
        return bugs_finalizados;
    }
}
