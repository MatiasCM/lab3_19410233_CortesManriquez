/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_19410233_CortesManriquez;

import java.util.ArrayList;
import java.util.Date;

/**
 * Una clase para representar la plataforma de documentos
 * @author matias
 */
public class Editor {
    protected Usuario usuarioLog;
    protected ListUsuarios listUsuarios;
    protected ListDocumentos listaDocumentos;
    
    //---Constructor---//
    public Editor() {
        this.usuarioLog = new Usuario();
        this.listUsuarios = new ListUsuarios();
        this.listaDocumentos = new ListDocumentos();
    }
    
    //---Selectores---//
    public Usuario getUsuarioLog() {
        return usuarioLog;
    }
    public ListUsuarios getListUsuarios() {
        return listUsuarios;
    }
    public ListDocumentos getListaDocumentos() {
        return listaDocumentos;
    }
       
    //---Modificadores---//
    public void setUsuarioLog(Usuario usuarioLog) {
        this.usuarioLog = usuarioLog;
    }
    public void setListUsuarios(ListUsuarios listUsuarios) {
        this.listUsuarios = listUsuarios;
    }
    public void setListaDocumentos(ListDocumentos listaDocumentos) {
        this.listaDocumentos = listaDocumentos;
    }
   
    
    public void register(String userName,String password){
        if(listUsuarios.inUserList(userName)==0)
        {
            Usuario newUser = new Usuario();
            newUser.createUser(userName,password);
            listUsuarios.addUser(newUser);
        }
        else
        {
            System.out.println("-------------------------------------------------\n"
                    +          "|Usuario ya registrado con ese nombre de usuario|\n"
                    +          "-------------------------------------------------");
        }
    }
    
    public int login(String username,String pass){
        if(listUsuarios.inUserList(username)==0){
            System.out.println("-------------------------------------------------\n"
                    +          "|             Usuario no registrado             |\n"
                    +          "-------------------------------------------------");
            return 0;
        }
        else if(listUsuarios.inUserList(username)==1 ){
            int validate = listUsuarios.matchSearchAccessUser(username, pass);
            if(!(validate == -1)){
                //Usuario newLogin = listUsuarios.UL.get(validate);
                usuarioLog.setUserName(username);
                usuarioLog.setPassword(pass);
                System.out.println("|Logeado como: "+username+" |");
                return 1;
            }
            return 0;
        }
        else{
            System.out.println("-------------------------------------------------\n"
                    +          "|                Usuario Logeado                |\n"
                    +          "-------------------------------------------------");
            return 0;
        }
       
    }
    
     public void logout(){
        usuarioLog.setUserName("");
        usuarioLog.setPassword("");
        System.out.println("|DESLOGEADO DE LA SESION|");
    }
     
    public void create(String titulo, String contenido){
        Documento newD = new Documento();
        Date d = new Date();
        int id = listaDocumentos.getCantidadDocumentos();
        String autor = usuarioLog.getUserName();
        id = id + 1;
        Version ver = new Version(contenido, 0);
        
        newD.setIdDoc(id);
        newD.setAutor(autor);
        newD.setFechaCreacion(d);
        newD.setTitulo(titulo);
        newD.setContenido(contenido);
        newD.addVersion(ver);
        listaDocumentos.addDocumento(newD);  
        System.out.println("\n Se ha creado el documento: " + newD.toString() + "\n");
    }
    
    public void darPermiso(String usuario, String permiso, String idDoc){
        int numero = Integer.parseInt(idDoc);
        Documento d = listaDocumentos.existeDocId(numero);
        if(d.enListPermisos(usuario) == 1){
            ArrayList<Permisos> permisos = d.getListPermisos();
            d.removePermiso(permisos, usuario);
            Permisos p = new Permisos(usuario, permiso);
            d.addPermiso(p);
            System.out.println("\nSe ha compartido el documento con el permiso de " + permiso + " " + d.toString()+ "\n");
        }
        else{
            Permisos p = new Permisos(usuario, permiso);
            d.addPermiso(p);
            System.out.println("\nSe ha compartido el documento con el permiso de " + permiso + " " + d.toString()+ "\n");
        }
    }
    
    public void addContenido(Documento d, String contenidoNuevo){
        String textoViejo = d.getContenido();
        d.setContenido(textoViejo.concat(contenidoNuevo));
        ArrayList<Version> versiones = d.getVersiones();
        ArrayList<Version> ver = d.reverseVersionList(versiones);
        Version version = ver.get(0);
        int id = version.getIdVersion();
        Version v = new Version(textoViejo.concat(contenidoNuevo), id+1);
        d.reverseVersionList(ver);
        d.addVersion(v);
        System.out.println(d.toString());
    }
    
    public int rollback(Documento d, int idVersion){
        //ArrayList<Version> listaVersiones = d.getVersiones();
        if(d.enListVersiones(idVersion)==1){
            String contenidoVersion =d.returnVersion(idVersion);
            d.setContenido(contenidoVersion);
            String n = String.valueOf(idVersion);
            System.out.println("\nSe ha restaurado a la version "+n+ " "+d.toString()+"\n");
            return 1;
        }
        else{
            System.out.println("-------------------------------------------------\n"
                    +          "|                Version no existe               |\n"
                    +          "-------------------------------------------------");
            return 0;
        }
    }
    
    public void revokeAllAccess(int idDoc){
        ListDocumentos lista = getListaDocumentos();
        Documento d = lista.existeDocId(idDoc);
        ArrayList<Permisos> p = new ArrayList<Permisos>();
        d.setListPermisos(p);
        System.out.println("\nSe han revocado los permisos del documento " + d.toString()+"\n");
    }
    
    public String editorToString(){
        ListDocumentos lista = getListaDocumentos();
        ArrayList<Documento> documentos = lista.getDocumentos();
        String s = "---------------------\nDocumentos del editor\n---------------------\n";
        //String concat = "";
        for(int i = 0 ; i<lista.lenLD();i++){
            Documento d = documentos.get(i);
            int id = d.getIdDoc();
            String numero = String.valueOf(id);
            String autor = d.getAutor();
            String titulo = d.getTitulo();
            String contenido = d.getContenido();
            ArrayList<Version> versiones = d.getVersiones();
            ArrayList<Version> ver = d.reverseVersionList(versiones);
            Version version = ver.get(0);
            int cantidad = version.getIdVersion();
            String doc = "Documento " + numero + "\n  Autor: " + autor + "\n  Titulo: " + titulo + "\n  Contenido: " + contenido + "\n  N° Versiones: " + cantidad +"\n";
            s = s.concat(doc);
       }
       return s;
    }
    
    public String editorToStringLogin(){
        ListDocumentos lista = getListaDocumentos();
        ArrayList<Documento> documentos = lista.getDocumentos();
        Usuario user = getUsuarioLog();
        String userName = user.getUserName();
        String s = "\n------------------- \nDocumentos de " + userName + "\n-------------------\n";
        ArrayList<Documento> documentosUser = new ArrayList<Documento>();
        for(int i = 0 ; i<lista.lenLD();i++){
            if(documentos.get(i).getAutor().equals(userName)){
                documentosUser.add(documentos.get(i));
            }
        }
        for(int j = 0 ; j<documentosUser.size();j++){
            Documento d = documentosUser.get(j);
            int id = d.getIdDoc();
            String numero = String.valueOf(id);
            //String autor = d.getAutor();
            String titulo = d.getTitulo();
            String contenido = d.getContenido();
            ArrayList<Version> versiones = d.getVersiones();
            ArrayList<Version> ver = d.reverseVersionList(versiones);
            Version version = ver.get(0);
            int cantidad = version.getIdVersion();
            String doc = "Documento " + numero +  "\n  Titulo: " + titulo + "\n  Contenido: " + contenido + "\n  N° Versiones: " + cantidad +  "\n";
            s = s.concat(doc);
        }
        return s;
    }
    
    public void printEditor(String s){
        System.out.println(s);
    }
      
    public void delete(int idDoc, int caracteres){
        ListDocumentos lista = getListaDocumentos();
        Documento d = lista.existeDocId(idDoc);
        String contenido = d.getContenido();
        int largo = contenido.length();
        String content = null;
        if(largo<caracteres){
            content="";
        }
        else{
            for(int i = largo;i>=0;i--){
                content = contenido.substring(0, largo-caracteres);
            }
        }
        d.setContenido(content);
        ArrayList<Version> versiones = d.getVersiones();
        ArrayList<Version> ver = d.reverseVersionList(versiones);
        Version version = ver.get(0);
        int id = version.getIdVersion();
        Version v = new Version(content, id+1);
        d.reverseVersionList(ver);
        d.addVersion(v);
        System.out.println("\nSe han eliminado los caracteres " + d.toString() + "\n");
    }
    
    public void iniDocumentos(){
        Date f1 = new Date();
        Documento d1 = new Documento();
        Documento d2 = new Documento();
        Documento d3 = new Documento();
        Documento d4 = new Documento();
        Documento d5 = new Documento();
        Documento d6 = new Documento();
        Documento d7 = new Documento();
        Documento d8 = new Documento();
        Documento d9 = new Documento();
        Documento d10 = new Documento();
        d1.setIdDoc(1);
        d2.setIdDoc(2);
        d3.setIdDoc(3);
        d4.setIdDoc(4);
        d5.setIdDoc(5);
        d6.setIdDoc(6);
        d7.setIdDoc(7);
        d8.setIdDoc(8);
        d9.setIdDoc(9);
        d10.setIdDoc(10);
        d1.setAutor("user1");
        d2.setAutor("user1");
        d3.setAutor("user2");
        d4.setAutor("user3");
        d5.setAutor("user3");
        d6.setAutor("user4");
        d7.setAutor("user4");
        d8.setAutor("user5");
        d9.setAutor("user5");
        d10.setAutor("user1");
        d1.setFechaCreacion(f1);
        d2.setFechaCreacion(f1);
        d3.setFechaCreacion(f1);
        d4.setFechaCreacion(f1);
        d5.setFechaCreacion(f1);
        d6.setFechaCreacion(f1);
        d7.setFechaCreacion(f1);
        d8.setFechaCreacion(f1);
        d9.setFechaCreacion(f1);
        d10.setFechaCreacion(f1);
        d1.setTitulo("Primer doc user1");
        d2.setTitulo("Segundo doc user1");
        d3.setTitulo("Primer doc user2");
        d4.setTitulo("Primer doc user3");
        d5.setTitulo("Segundo doc user3");
        d6.setTitulo("Primer doc user4");
        d7.setTitulo("Segundo doc user4");
        d8.setTitulo("Primer doc user5");
        d9.setTitulo("Segundo doc user5");
        d10.setTitulo("Tercer doc user1");
        d1.setContenido("primer texto user1");
        Version vd1 = new Version("primer texto user1",0);
        d2.setContenido("segundo texto user1");
        Version vd2 = new Version("segundo texto user1",0);
        d3.setContenido("primer texto user2");
        Version vd3 = new Version("primer texto user2",0);
        d4.setContenido("primer texto user3");
        Version vd4 = new Version("primer texto user3",0);
        d5.setContenido("segundo texto user3");
        Version vd5 = new Version("segundo texto user3",0);
        d6.setContenido("primer texto user4");
        Version vd6 = new Version("primer texto user4",0);
        d7.setContenido("segundo texto user4");
        Version vd7 = new Version("segundo texto user4",0);
        d8.setContenido("primer texto user5");
        Version vd8 = new Version("primer texto user5",0);
        d9.setContenido("segundo texto user5");
        Version vd9 = new Version("segundo texto user5",0);
        d10.setContenido("tercer texto user1");
        Version vd10 = new Version("tercer texto user1",0);
        d1.addVersion(vd1);
        d2.addVersion(vd2);
        d3.addVersion(vd3);
        d4.addVersion(vd4);
        d5.addVersion(vd5);
        d6.addVersion(vd6);
        d7.addVersion(vd7);
        d8.addVersion(vd8);
        d9.addVersion(vd9);
        d10.addVersion(vd10);
        listaDocumentos.addDocumento(d1);
        listaDocumentos.addDocumento(d2);
        listaDocumentos.addDocumento(d3);
        listaDocumentos.addDocumento(d4);
        listaDocumentos.addDocumento(d5);
        listaDocumentos.addDocumento(d6);
        listaDocumentos.addDocumento(d7);
        listaDocumentos.addDocumento(d8);
        listaDocumentos.addDocumento(d9);
        listaDocumentos.addDocumento(d10);
        listaDocumentos.setCantidadDocumentos(10);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Editor{" + "usuarioLog=" + usuarioLog + ", listUsuarios=" + listUsuarios + ", listaDocumentos=" + listaDocumentos + '}';
    }
    
    
}
