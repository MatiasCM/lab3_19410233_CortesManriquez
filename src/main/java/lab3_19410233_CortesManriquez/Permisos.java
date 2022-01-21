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
public class Permisos {
    protected String userNamePermitido;
    protected ArrayList<String> listPermisos;
    
    //---Constructor---//
    public Permisos(String userNamePermitido, ArrayList<String> listPermisos) {
        this.userNamePermitido = userNamePermitido;
        this.listPermisos = listPermisos;
    }
    
    //---Selectores---//
    public String getUserNamePermitido() {
        return userNamePermitido;
    }
    public ArrayList<String> getListPermisos() {
        return listPermisos;
    }
    
    //---Mopdificadores---//
    public void setUserNamePermitido(String userNamePermitido) {
        this.userNamePermitido = userNamePermitido;
    }
    public void setListPermisos(ArrayList<String> listPermisos) {
        this.listPermisos = listPermisos;
    }

    @Override
    public String toString() {
        return "Permisos{" + "userNamePermitido=" + userNamePermitido + ", listPermisos=" + listPermisos + '}';
    }
     
    
}
