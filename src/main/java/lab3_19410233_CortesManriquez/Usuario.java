package lab3_19410233_CortesManriquez;

/**
 * Clase que representa un Usuario 
 * @author Matias Cortes Manriquez
 */
public class Usuario {
    protected String userName;
    protected String password;
    
    //---Constructor---//

    /**
     * Constructor de usuario con la entrega de sus atributos
     * @param userName String nombre de usuario
     * @param password String contrasegna
     */
    public Usuario(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    
    /**
     * Constructor de un usuario vacio
     */
    public Usuario() {
        this.userName = "";
        this.password = "";
    }
    
    //---Selectores---//

    /**
     * Retorna el nombre de usuario
     * @return String
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Retorna la contrasegna
     * @return String
     */
    public String getPassword() {
        return password;
    }
    
    //---Modificadores---//

    /**
     * Cambia el nombre de usuario por el nombre entregado
     * @param userName String
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Cambia la contrasegna por la contrasegna entregada
     * @param password String
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Retorna un String con los atributos de la clase Usuario
     * @return tring
     */
    @Override
    public String toString() {
        return "Usuario{" + "userName=" + userName + ", password=" + password + '}';
    }
    
    /**
     * Crea un usuario
     * @param nombre String
     * @param pass String
     */
    public void createUser(String nombre,String pass){
      this.userName = nombre;
      this.password = pass;
  }
}
