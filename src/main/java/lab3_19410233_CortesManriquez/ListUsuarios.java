package lab3_19410233_CortesManriquez;

import java.util.ArrayList;

/**
 * Clase que representa una lista de usaurios
 * @author Matias Cortes Manriquez
 */
public class ListUsuarios {
    public ArrayList<Usuario> UL;
    
    //---Constructor---//

    /**
     * Constructor de Listusuarios
     */
    public ListUsuarios(){
        ArrayList<Usuario> ul = new ArrayList<Usuario>();
        this.UL = ul;
    }

    /**
     * Retorna un String que contiene los atributos de la clase ListUsuarios
     * @return String
     */
    @Override
    public String toString() {
        return "ListUsuarios{" + "UL=" + UL + '}';
    } 
    
    /**
     * Retorna el tamagno de la lista de usuarios
     * @return int
     */
    public int lenUL(){
        return this.UL.size();
    }
    
    /**
     * Verifica si existe un usuario segun un nombre de usuario
     * @param nombreU String nombre de usuario
     * @return int 1 si existe, 0 si no existe
     */
    public int inUserList(String nombreU){
        for(int i = 0; i<lenUL();i++){
            if(UL.get(i).getUserName().equals(nombreU)){
                return 1;
            }
        }
        return 0;
    }
    
    /**
     * Agrega un usuario a la lista de usuarios
     * @param u Usuario
     */
    public void addUser(Usuario u){
        Usuario us = u;
        this.UL.add(us);
    }
     
    /**
     * dado el nombre de usuario y contrasegna del usuario determina
     * la posicion de este en el listado
     * @param nombreU String nombre de usuario
     * @param pass String contrasegna
     * @return int posicion del usuario ,si este no se encuentra retorna -1
     */
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
