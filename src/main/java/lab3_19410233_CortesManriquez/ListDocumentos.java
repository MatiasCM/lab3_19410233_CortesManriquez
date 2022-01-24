package lab3_19410233_CortesManriquez;

import java.util.ArrayList;

/**
 * Clase que contiene una lista de documentos y la cantidad existente
 * @author Matias Cortes Manriquez
 */
public class ListDocumentos {
    public ArrayList<Documento> documentos;
    public int cantidadDocumentos;
    
    //---Constructor---//

    /**
     * Constructor de ListDocumentos con la entrega de sus atributos
     * @param documentos ArrayList lista de documentos
     * @param cantidadDocumentos int cantidad de documentos
     */
    public ListDocumentos(ArrayList<Documento> documentos, int cantidadDocumentos) {
        this.documentos = documentos;
        this.cantidadDocumentos = cantidadDocumentos;
    }
    
    /**
     * Construcor de un listDocumentos vacio
     */
    public ListDocumentos(){
        ArrayList<Documento> ld = new ArrayList<Documento>();
        this.documentos = ld;
        this.cantidadDocumentos = 0;
    }
    
    //---Selectores---//

    /**
     * Retorna la lista de documentos
     * @return ArrayList
     */
    public ArrayList<Documento> getDocumentos() {
        return documentos;
    }

    /**
     * Retorna la cantidad de documentos
     * @return int
     */
    public int getCantidadDocumentos() {
        return cantidadDocumentos;
    }
    
    //---Modificadores---//

    /**
     * Cambia la lista de documentos por la lista entregada
     * @param documentos ArrayList 
     */
    public void setDocumentos(ArrayList<Documento> documentos) {
        this.documentos = documentos;
    }

    /**
     * Cambia la cantidad de documentos por la cantidad entregada
     * @param cantidadDocumentos int
     */
    public void setCantidadDocumentos(int cantidadDocumentos) {
        this.cantidadDocumentos = cantidadDocumentos;
    }
    
    /**
     * Agrega un documento a la lista de documentos
     * @param d Documento 
     */
    public void addDocumento(Documento d){
        Documento doc = d;
        this.documentos.add(doc);
    }
    
    /** 
     * Rertorna el tamanio de la lista de documentos
     * @return int
     */
    public int lenLD(){
       return this.documentos.size();
    }
     
    /**
     * Retorna un documento a partir de su id
     * @param idDoc int id del documento
     * @return Documento
     */
    public Documento existeDocId(int idDoc){
       for(int i = 0 ; i<lenLD();i++){
           if(documentos.get(i).getIdDoc() == idDoc){
               Documento d = documentos.get(i);
               return d;
           }
       }
        return null;
      
    }
    
    /**
     * Verifica si un documento es de un autor en especifico
     * @param nombreU String nombre de usuario 
     * @return int 1 si es el autor, 0 si no lo es
     */
    public int inDocList(String nombreU){
        for(int i = 0; i<lenLD();i++){
            if(documentos.get(i).getAutor().equals(nombreU)){
                return 1;
            }
        }
        return 0;
    }
    
    /**
     * Retorna un documento segun el autor 
     * @param userName String nombre de usuario 
     * @return Documento
     */
    public Documento existeDocUser(String userName){
       for(int i = 0 ; i<lenLD();i++){
           if(documentos.get(i).getAutor().equals(userName)){
               Documento d = documentos.get(i);
               return d;
           }
       }
        return null;
    }

    /**
     * Retorna un String con los atributos de ListDocumentos
     * @return String
     */
    @Override
    public String toString() {
        return "ListDocumentos{" + "documentos=" + documentos + ", cantidadDocumentos=" + cantidadDocumentos + '}';
    } 
}
