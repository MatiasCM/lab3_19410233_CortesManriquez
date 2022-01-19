/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_19410233_CortesManriquez;

import java.time.LocalDate;
import java.util.List;

/**
 * Una clase para representar la plataforma de documentos
 * @author matias
 */
public class Editor {
    public String nombre;
    public LocalDate fechaCreacion;
    protected Usuario usuarioLog;
    protected List<Usuario> listUsuarios;
    protected ListDocumentos listaDocumentos;
    
    //---Constructor---//
    public Editor(String nombre, LocalDate fechaCreacion, Usuario usuarioLog, List<Usuario> listUsuarios, ListDocumentos listaDocumentos) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.usuarioLog = usuarioLog;
        this.listUsuarios = listUsuarios;
        this.listaDocumentos = listaDocumentos;
    }
    
    //---Selectores---//
    public String getNombre() {
        return nombre;
    }
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
    public Usuario getUsuarioLog() {
        return usuarioLog;
    }
    public List<Usuario> getListUsuarios() {
        return listUsuarios;
    }
    public ListDocumentos getListaDocumentos() {
        return listaDocumentos;
    }
    
    //---Modificadores---//
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public void setUsuarioLog(Usuario usuarioLog) {
        this.usuarioLog = usuarioLog;
    }
    public void setListUsuarios(List<Usuario> listUsuarios) {
        this.listUsuarios = listUsuarios;
    }
    public void setListaDocumentos(ListDocumentos listaDocumentos) {
        this.listaDocumentos = listaDocumentos;
    }
      
}
