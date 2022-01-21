/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_19410233_CortesManriquez;

import java.util.ArrayList;

/**
 *
 * @author matias
 */
public class ListDocumentos {
    public ArrayList<Documento> documentos;
    public int cantidadDocumentos;
    
    //---Constructor---//
    public ListDocumentos(ArrayList<Documento> documentos, int cantidadDocumentos) {
        this.documentos = documentos;
        this.cantidadDocumentos = cantidadDocumentos;
    }
    
    public ListDocumentos(){
        ArrayList<Documento> ld = new ArrayList<Documento>();
        this.documentos = ld;
        this.cantidadDocumentos = 0;
    }
    
    //---Selectores---//
    public ArrayList<Documento> getDocumentos() {
        return documentos;
    }
    public int getCantidadDocumentos() {
        return cantidadDocumentos;
    }
    
    //---Modificadores---//
    public void setDocumentos(ArrayList<Documento> documentos) {
        this.documentos = documentos;
    }
    public void setCantidadDocumentos(int cantidadDocumentos) {
        this.cantidadDocumentos = cantidadDocumentos;
    }
    
     public void addDocumento(Documento d){
        Documento doc = d;
        this.documentos.add(doc);
    }

    @Override
    public String toString() {
        return "ListDocumentos{" + "documentos=" + documentos + ", cantidadDocumentos=" + cantidadDocumentos + '}';
    }
     
     
      
}
