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
}
