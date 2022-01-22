/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_19410233_CortesManriquez;


/**
 *
 * @author matias
 */
public class Permisos {
    protected String userNamePermitido;
    protected String permiso;
    
    //---Constructor---//
    public Permisos(String userNamePermitido, String Permiso) {
        this.userNamePermitido = userNamePermitido;
        this.permiso = Permiso;
    }
    
    //---Selectores---//
    public String getUserNamePermitido() {
        return userNamePermitido;
    }
    public String getPermiso() {
        return permiso;
    }
    
    //---Mopdificadores---//
    public void setUserNamePermitido(String userNamePermitido) {
        this.userNamePermitido = userNamePermitido;
    }
    public void setPermiso(String permiso) {
        this.permiso = permiso;
    }

    @Override
    public String toString() {
        return "Permisos{" + "userNamePermitido=" + userNamePermitido + ", permiso=" + permiso + '}';
    }
     
    
}
