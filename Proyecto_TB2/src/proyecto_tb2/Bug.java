/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_tb2;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Bug {
    int codigo;
    String descripcion;
    int CP_Software;
    int urgencia;//1..5;
    String estado;
    String F_Inicio;
    String F_Finalizado;
    ArrayList <String> comentarios =new ArrayList();

    public Bug(int codigo, String descripcion, int CP_Software, int urgencia, String estado, String F_Inicio, String F_Finalizado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.CP_Software = CP_Software;
        this.urgencia = urgencia;
        this.estado = estado;
        this.F_Inicio = F_Inicio;
        this.F_Finalizado = F_Finalizado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCP_Software() {
        return CP_Software;
    }

    public void setCP_Software(int CP_Software) {
        this.CP_Software = CP_Software;
    }

    public int getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(int urgencia) {
        this.urgencia = urgencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getF_Inicio() {
        return F_Inicio;
    }

    public void setF_Inicio(String F_Inicio) {
        this.F_Inicio = F_Inicio;
    }

    public String getF_Finalizado() {
        return F_Finalizado;
    }

    public void setF_Finalizado(String F_Finalizado) {
        this.F_Finalizado = F_Finalizado;
    }
    
    
}
