package lab3_19410233_CortesManriquez;

import java.util.ArrayList;
import java.util.Date;

/**
 * Clase que representa un documento
 * @author Matias Cortes Manriquez
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

    /**
     * Constructor de un documento con la entrega de sus atributos
     * @param idDoc int numero del documento
     * @param autor String nombre del autor
     * @param fechaCreacion Date fecha de creacion
     * @param titulo String nombre del documento
     * @param contenido String texto del documento
     * @param versiones ArrayList lista con versiones del documento
     * @param listPermisos ArrayList lista con permisos del documento
     */
    public Documento(int idDoc, String autor, Date fechaCreacion, String titulo, String contenido, ArrayList<Version> versiones, ArrayList<Permisos> listPermisos) {
        this.idDoc = idDoc;
        this.autor = autor;
        this.fechaCreacion = fechaCreacion;
        this.titulo = titulo;
        this.contenido = contenido;
        this.versiones = versiones;
        this.listPermisos = listPermisos;
    }
    
    /**
     * Construcor de un documento vacio
     */
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

    /**
     * Retorna el id del documento
     * @return int
     */
    public int getIdDoc() {
        return idDoc;
    }

    /**
     * Retorna el autor del documento
     * @return String
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Retorna la fecha dde creacion del documento
     * @return Date
     */
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Retorna el titulo o nombre de un documento
     * @return String
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Retorna el texto o contenido de un documento
     * @return String
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * Retorna la lista de versiones
     * @return ArrayList
     */
    public ArrayList<Version> getVersiones() {
        return versiones;
    }

    /**
     * Retorna la lista de permisos
     * @return ArrayList
     */
    public ArrayList<Permisos> getListPermisos() {
        return listPermisos;
    }
    
    //---Modificadores---//

    /**
     * Cambia el id de un documento por el id entregado
     * @param idDoc int
     */
    public void setIdDoc(int idDoc) {
        this.idDoc = idDoc;
    }

    /**
     * Cambia el autor de un documento por el autor entregado
     * @param autor String
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Cambia la fecha de un documento por la fecha entregada
     * @param fechaCreacion Date
     */
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * Cambia el titulo de un documento por el titulo entregado
     * @param titulo String
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Cambia el contenido de un documento por el contenido entregado
     * @param contenido String
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * Cambia la lista de versiones de un documento por la lista entregada
     * @param versiones ArrayList
     */
    public void setVersiones(ArrayList<Version> versiones) {
        this.versiones = versiones;
    }

    /**
     * Cambia la lista de permisos de un documento por la lista entregada
     * @param listPermisos ArrayList
     */
    public void setListPermisos(ArrayList<Permisos> listPermisos) {
        this.listPermisos = listPermisos;
    }

    /**
     * Retorna un string con los atributos de la clase Documento
     * @return String
     */
    @Override
    public String toString() {
        return "Documento{" + "idDoc=" + idDoc + ", autor=" + autor + ", fechaCreacion=" + fechaCreacion + ", titulo=" + titulo + ", contenido=" + contenido + ", versiones=" + versiones + ", listPermisos=" + listPermisos + '}';
    }
    
    /**
     * Agrega un objeto Version a la lista de versiones
     * @param v Version 
     */
    public void addVersion(Version v){
        Version ver = v;
        this.versiones.add(ver);
    }
    
    /**
     * Agrega un objeto Permisos a la lista de permisos
     * @param p Permisos 
     */
    public void addPermiso(Permisos p){
        Permisos per = p;
        this.listPermisos.add(per);
    }
    
    /**
     * Retorna el tamanio de la lista de permisos
     * @return int
     */
    public int lenLP(){
        return this.listPermisos.size();
    }
     
    /**
     * Retorna el tamanio de la lista de versiones
     * @return int
     */
    public int lenLV(){
       return this.versiones.size();
    }
    
    /**
     * Verifica si existe un usuario especifico tiene un permiso
     * @param nombreU String nombre de usuario
     * @return int 1 si existe, 0 si no existe
     */
    public int enListPermisos(String nombreU){
        for(int i = 0; i<lenLP();i++){
            if(listPermisos.get(i).getUserNamePermitido().equals(nombreU)){
                return 1;
            }
        }
        return 0;
    }
    
    /**
     * Elimina el permiso de un usuario especifico
     * @param p ArrayList lista de permisos
     * @param usuario String nombre de usuario
     */
    public void removePermiso(ArrayList<Permisos> p, String usuario){
        for(int i = 0; i<lenLP();i++){
            if(p.get(i).getUserNamePermitido().equals(usuario)){
                p.remove(i);
            }
        }
    }
    
    /**
     * Verifica si un usuario posee el permiso de escritura
     * @param p ArrayList lista de permisos
     * @param usuario String nombre de usuario
     * @return int 1 si existe, 0 si no existe
     */
    public int existePermisoEscritura(ArrayList<Permisos> p, String usuario){
        for(int i = 0; i<lenLP();i++){
            if(listPermisos.get(i).getUserNamePermitido().equals(usuario) && listPermisos.get(i).getPermiso().equals("escritura")){
                return 1;
            }
        }
        return 0;
    }
    
    /**
     * Revierte el orden de las versiones de la lista de versiones
     * @param versiones ArrayList lista de versiones
     * @return ArrayList lista de versiones
     */
    public ArrayList<Version> reverseVersionList(ArrayList<Version> versiones) {
        for(int i = 0, j = versiones.size() - 1; i < j; i++) {
            versiones.add(i, versiones.remove(j));
        }
        return versiones;
    }
    
    /**
     * Retorna una version de un documento a partir del id de la version
     * @param id int numero de la version
     * @return String contenido de la version
     */
    public String returnVersion(int id){
        for(int i = 0; i<lenLV();i++){
            if(versiones.get(i).getIdVersion()==id){
                String v = versiones.get(i).getContenidoVersion();
                return v;
            }
        }
        return null;
    }
     
    /**
     * Verifica si existe una version segun su id
     * @param id int id de la version
     * @return  int 1 si existe, 0 si no existe
     */
    public int enListVersiones(int id){
        for(int i = 0; i<lenLV();i++){
            if(versiones.get(i).getIdVersion()==id){
                return 1;
            }
        }
        return 0;
    }
    
}
