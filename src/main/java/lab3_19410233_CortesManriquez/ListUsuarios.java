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
public class ListUsuarios {
    public ArrayList<Usuario> UL;
    
    //---Constructor---//
    public ListUsuarios(){
        ArrayList<Usuario> ul = new ArrayList<Usuario>();
        this.UL = ul;
    }

    @Override
    public String toString() {
        return "ListUsuarios{" + "UL=" + UL + '}';
    } 
    
    public int lenUL(){
        return this.UL.size();
    }
    
    public int inUserList(String nombreU){
        for(int i = 0; i<lenUL();i++){
            if(UL.get(i).getUserName().equals(nombreU)){
                return 1;
            }
        }
        return 0;
    }
    
     public void addUser(Usuario u){
        Usuario us = u;
        this.UL.add(us);
    }
     
     public int matchSearchAccessUser(String nombreU, String pass){
        if(UL.isEmpty()){
            return -1;
        }
        
        for(int i = 0; i<lenUL();i++){
            if(UL.get(i).getUserName().equals(nombreU)){
                if(UL.get(i).getPassword().equals(pass)){
                    return i;
                }
                else{
                    System.out.println("-------------------------------------------------\n"
                    +          "|  Contrasegna Incorrecta, intentelo nuevamente  |\n"
                    +          "-------------------------------------------------");
                    return -1;
                }
            }
        }
        System.out.println("-------------------------------------------------\n"
                    +          "|     Usuario y Contrasegna Incorrectos     |\n"
                    +          "-------------------------------------------------");
        return -1;
    }
}
