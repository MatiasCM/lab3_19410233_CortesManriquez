package lab3_19410233_CortesManriquez;

/**
 * Clase que representa el permiso de un documento
 * @author Matias Cortes Manriquez
 */
public class Permisos {
    protected String userNamePermitido;
    protected String permiso;
    
    //---Constructor---//

    /**
     * Constructor de Permisos
     * @param userNamePermitido String nombre de usuario
     * @param Permiso String tipo de permiso
     */
    public Permisos(String userNamePermitido, String Permiso) {
        this.userNamePermitido = userNamePermitido;
        this.permiso = Permiso;
    }
    
    //---Selectores---//

    /**
     * Retorna el nombre del usuario al que se le dio el permiso
     * @return String
     */
    public String getUserNamePermitido() {
        return userNamePermitido;
    }

    /**
     * Retorna el tipo de permiso
     * @return String
     */
    public String getPermiso() {
        return permiso;
    }
    
    //---Mopdificadores---//

    /**
     * Cambia el nombre de usuario de un permiso por el nombre entregado
     * @param userNamePermitido String
     */
    public void setUserNamePermitido(String userNamePermitido) {
        this.userNamePermitido = userNamePermitido;
    }

    /**
     * Cambia el tipo de permiso por el permiso entregado
     * @param permiso String
     */
    public void setPermiso(String permiso) {
        this.permiso = permiso;
    }

    /**
     * Retorna un string con los atributos de la clase Permisos
     * @return String
     */
    @Override
    public String toString() {
        return "Permisos{" + "userNamePermitido=" + userNamePermitido + ", permiso=" + permiso + '}';
    }
}
