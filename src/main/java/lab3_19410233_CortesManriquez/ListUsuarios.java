/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_19410233_CortesManriquez;

import java.util.ArrayList;
import java.util.List;

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
}
