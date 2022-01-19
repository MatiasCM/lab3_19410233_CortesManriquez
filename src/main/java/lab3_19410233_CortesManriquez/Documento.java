/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_19410233_CortesManriquez;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author matias
 */
public class Documento {
    public int idDoc;
    public String autor;
    public LocalDate fechaCreacion;
    protected String titulo;
    protected String  contenido;
    protected List<Version> versiones;
    protected List<Permisos> listPermisos;
    
    //---Constructor---//
    public Documento(int idDoc, String autor, LocalDate fechaCreacion, String titulo, String contenido, List<Version> versiones, List<Permisos> listPermisos) {
        this.idDoc = idDoc;
        this.autor = autor;
        this.fechaCreacion = fechaCreacion;
        this.titulo = titulo;
        this.contenido = contenido;
        this.versiones = versiones;
        this.listPermisos = listPermisos;
    }
    
    //---Selectores---//
    public int getIdDoc() {
        return idDoc;
    }
    public String getAutor() {
        return autor;
    }
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getContenido() {
        return contenido;
    }
    public List<Version> getVersiones() {
        return versiones;
    }
    public List<Permisos> getListPermisos() {
        return listPermisos;
    }
    
    //---Modificadores---//
    public void setIdDoc(int idDoc) {
        this.idDoc = idDoc;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public void setVersiones(List<Version> versiones) {
        this.versiones = versiones;
    }
    public void setListPermisos(List<Permisos> listPermisos) {
        this.listPermisos = listPermisos;
    }
       
}
