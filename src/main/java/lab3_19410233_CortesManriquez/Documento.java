/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_19410233_CortesManriquez;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author matias
 */
public class Documento {
    public int idDoc;
    public String autor;
    public Date fechaCreacion;
    protected String titulo;
    protected String  contenido;
    protected ArrayList<Version> versiones;
    protected ArrayList<Permisos> listPermisos;
    
    //---Constructor---//
    public Documento(int idDoc, String autor, Date fechaCreacion, String titulo, String contenido, ArrayList<Version> versiones, ArrayList<Permisos> listPermisos) {
        this.idDoc = idDoc;
        this.autor = autor;
        this.fechaCreacion = fechaCreacion;
        this.titulo = titulo;
        this.contenido = contenido;
        this.versiones = versiones;
        this.listPermisos = listPermisos;
    }
    
    public Documento (){
        this.idDoc = 0;
        this.autor = "";
        this.fechaCreacion = null;
        this.titulo = "";
        this.contenido = "";
        ArrayList<Version> ver = new ArrayList<Version>();
        this.versiones = ver;
        ArrayList<Permisos> p = new ArrayList<Permisos>();
        this.listPermisos = p;
    }
    
    //---Selectores---//
    public int getIdDoc() {
        return idDoc;
    }
    public String getAutor() {
        return autor;
    }
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getContenido() {
        return contenido;
    }
    public ArrayList<Version> getVersiones() {
        return versiones;
    }
    public ArrayList<Permisos> getListPermisos() {
        return listPermisos;
    }
    
    //---Modificadores---//
    public void setIdDoc(int idDoc) {
        this.idDoc = idDoc;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public void setVersiones(ArrayList<Version> versiones) {
        this.versiones = versiones;
    }
    public void setListPermisos(ArrayList<Permisos> listPermisos) {
        this.listPermisos = listPermisos;
    }

    @Override
    public String toString() {
        return "Documento{" + "idDoc=" + idDoc + ", autor=" + autor + ", fechaCreacion=" + fechaCreacion + ", titulo=" + titulo + ", contenido=" + contenido + ", versiones=" + versiones + ", listPermisos=" + listPermisos + '}';
    }
    
    public void addVersion(Version v){
        Version ver = v;
        this.versiones.add(ver);
    }
       
}
