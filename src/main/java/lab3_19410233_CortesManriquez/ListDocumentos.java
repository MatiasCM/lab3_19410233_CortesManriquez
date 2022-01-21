/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_19410233_CortesManriquez;

import java.util.List;

/**
 *
 * @author matias
 */
public class ListDocumentos {
    public List<Documento> documentos;
    public int cantidadDocumentos;
    
    //---Constructor---//
    public ListDocumentos() {
        this.documentos = documentos;
        this.cantidadDocumentos = cantidadDocumentos;
    }
    
    //---Selectores---//
    public List<Documento> getDocumentos() {
        return documentos;
    }
    public int getCantidadDocumentos() {
        return cantidadDocumentos;
    }
    
    //---Modificadores---//
    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }
    public void setCantidadDocumentos(int cantidadDocumentos) {
        this.cantidadDocumentos = cantidadDocumentos;
    }
      
}
