/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_19410233_CortesManriquez;

/**
 *
 * @author matias
 */
public class Version {
    protected String contenidoVersion;
    protected int idVersion;
    
    //---Constructor---//
    public Version(String contenidoVersion, int idVersion) {
        this.contenidoVersion = contenidoVersion;
        this.idVersion = idVersion;
    }
    
    //---Selectores---//
    public String getContenidoVersion() {
        return contenidoVersion;
    }
    public int getIdVersion() {
        return idVersion;
    }
    
    //---Modificadores---//
    public void setContenidoVersion(String contenidoVersion) {
        this.contenidoVersion = contenidoVersion;
    }
    public void setIdVersion(int idVersion) {
        this.idVersion = idVersion;
    }

    @Override
    public String toString() {
        return "Version{" + "contenidoVersion=" + contenidoVersion + ", idVersion=" + idVersion + '}';
    }
    
    
}
