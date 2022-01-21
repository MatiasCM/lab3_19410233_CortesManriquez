/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_19410233_CortesManriquez;

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
        Version vd1 = new Version("primer texto user1",1);
        d2.setContenido("segundo texto user1");
        Version vd2 = new Version("segundo texto user1",1);
        d3.setContenido("primer texto user2");
        Version vd3 = new Version("primer texto user2",1);
        d4.setContenido("primer texto user3");
        Version vd4 = new Version("primer texto user3",1);
        d5.setContenido("segundo texto user3");
        Version vd5 = new Version("segundo texto user3",1);
        d6.setContenido("primer texto user4");
        Version vd6 = new Version("primer texto user4",1);
        d7.setContenido("segundo texto user4");
        Version vd7 = new Version("segundo texto user4",1);
        d8.setContenido("primer texto user5");
        Version vd8 = new Version("primer texto user5",1);
        d9.setContenido("segundo texto user5");
        Version vd9 = new Version("segundo texto user5",1);
        d10.setContenido("tercer texto user1");
        Version vd10 = new Version("tercer texto user1",1);
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
