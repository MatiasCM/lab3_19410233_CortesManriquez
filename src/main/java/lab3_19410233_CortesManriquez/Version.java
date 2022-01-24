package lab3_19410233_CortesManriquez;

/**
 * Clase que representa una Version de un documento
 * @author Matias Cortes Manriquez
 */
public class Version {
    protected String contenidoVersion;
    protected int idVersion;
    
    //---Constructor---//

    /**
     * Constructor de Version con la entrega de sus atributos
     * @param contenidoVersion
     * @param idVersion
     */
    public Version(String contenidoVersion, int idVersion) {
        this.contenidoVersion = contenidoVersion;
        this.idVersion = idVersion;
    }
    
    //---Selectores---//

    /**
     * Retorna el contenido de la version
     * @return String 
     */
    public String getContenidoVersion() {
        return contenidoVersion;
    }

    /**
     * Retorna el id de la version
     * @return int
     */
    public int getIdVersion() {
        return idVersion;
    }
    
    //---Modificadores---//

    /**
     * Cambia el contenido de la version por el contenido entregado
     * @param contenidoVersion String
     */
    public void setContenidoVersion(String contenidoVersion) {
        this.contenidoVersion = contenidoVersion;
    }

    /**
     * Cambia el id de la version por el id entregado
     * @param idVersion int
     */
    public void setIdVersion(int idVersion) {
        this.idVersion = idVersion;
    }

    /**
     * String que contiene los atributos de la clase Version
     * @return String
     */
    @Override
    public String toString() {
        return "Version{" + "contenidoVersion=" + contenidoVersion + ", idVersion=" + idVersion + '}';
    }   
}
