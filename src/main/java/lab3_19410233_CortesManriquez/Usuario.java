/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_19410233_CortesManriquez;

/**
 *
 * @author matias
 */
public class Usuario {
    protected String userName;
    protected String password;
    
    //---Constructor---//
    public Usuario(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    
    public Usuario() {
        this.userName = "";
        this.password = "";
    }
    
    //---Selectores---//
    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
    
    //---Modificadores---//
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "userName=" + userName + ", password=" + password + '}';
    }
    
    public void createUser(String nombre,String pass){
      this.userName = nombre;
      this.password = pass;
  }
}
