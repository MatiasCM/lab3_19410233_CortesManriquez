/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3_19410233_CortesManriquez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author matias
 */
public class Main {
    public Editor editor;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main programa = new Main();
        programa.iniEditor();
        programa.start();
    }
    
    public Main()
    {
        this.editor = new Editor(); 
    }

    public void iniEditor() {
        editor.register("user1", "pass1");
        editor.register("user2", "pass2");
        editor.register("user3", "pass3");
        editor.register("user4", "pass4");
        editor.register("user5", "pass5");
        editor.iniDocumentos();
        
        
    }
    
    public void start(){
        int exit = 0;
        String opcion;
        while(exit == 0){
            Scanner accion = new Scanner(System.in);
            String u; //Username
            String p; //Password
            System.out.println("Escoja su opcion: ");
            System.out.println("1. Registrarse");
            System.out.println("2. Logearse");
            System.out.println("3. Visualizar documentos");
            System.out.println("4. Salir del Programa");
            System.out.println("-------------------------------");
            System.out.println("INTRODUZCA SU OPCION: ");
            opcion = accion.nextLine();
            switch(opcion){
                case "1"://REGISTER
                    System.out.println("Ingrese nombre de Usuario: ");
                    u = accion.nextLine();
                    System.out.println("Ingrese contrasegna de Usuario: ");
                    p = accion.nextLine();
                    editor.register(u, p);
                    break;
                case "2"://LOGIN
                    System.out.println("Ingrese nombre de Usuario: ");
                    u = accion.nextLine();
                    System.out.println("Ingrese contrasegna de Usuario: ");
                    p = accion.nextLine();
                    if(editor.login(u,p)==1){
                       this.menu();
                       exit = 1;
                    }
                    break;
                case "3": //Visualizar documentos
                    String d = editor.editorToString();
                    editor.printEditor(d);
                    break;
                case "4"://SALIR DEL PROGRAMA
                    System.out.println("-| HA SALIDO DEL PROGRAMA |-");
                    exit = 1;
                    break;
                default:
                    System.out.println("Ingresar un valor acorde a las opciones");
                    break;
            }
            
        }
    }
    
    public void menu(){
    
      int exit = 0;
      String opcion;
      
      
      while(exit==0)
      {
       
        String titulo;
        String contenido;
        String idDoc;
        String user;
        String permiso;
        String idVersion;
        String caracteres;
          
        Scanner accion = new Scanner(System.in);
        System.out.println("Escoja su opcion: ");
        System.out.println("1. Crear nuevo documento");
        System.out.println("2. Compartir documento");
        System.out.println("3. Agregar contenido a un documento");
        System.out.println("4. Restaurar versión de un documento");
        System.out.println("5. Revocar acceso a un documento");
        System.out.println("6. Visualizar documentos");
        System.out.println("7. Eliminar caracteres");
        System.out.println("8. Cerrar sesión");
        System.out.println("9. Cerrar el programa");
        System.out.println("-------------------------------");
        System.out.println("INTRODUZCA SU OPCION: ");
        opcion = accion.nextLine();
        switch(opcion){
          case "1":
            System.out.println("Ingrese el titulo del documento: ");
            titulo = accion.nextLine();
            System.out.println("Ingrese el contenido del documento: ");
            contenido = accion.nextLine();
            editor.create(titulo, contenido);
            break;
          case "2":
            System.out.println("Ingrese el id del documento: ");
            idDoc = accion.nextLine();
            System.out.println("Ingrese el usuario al que quiere compartir: ");
            user = accion.nextLine();
            System.out.println("Ingrese el tipo de permiso (lectura, escritura, comentar): ");
            permiso = accion.nextLine();
            if("lectura".equals(permiso) || "escritura".equals(permiso) || "comentar".equals(permiso)){
                editor.darPermiso(user, permiso, idDoc);
                break;
            }
            else{
                System.out.println("-------------------------------------------------\n"
                    +          "|                Permiso erroneo                |\n"
                    +          "-------------------------------------------------");
                break;
            }
          case "3":
            System.out.println("Ingrese el id del documento: ");
            idDoc = accion.nextLine();
            System.out.println("Ingrese el contenido del documento: ");
            contenido = accion.nextLine();
            ListDocumentos lista = editor.getListaDocumentos();
            int numero = Integer.parseInt(idDoc);
            Documento d = lista.existeDocId(numero);
            String autor = d.getAutor();
            Usuario usuario = editor.getUsuarioLog();
            String userName = usuario.getUserName();
            ArrayList<Permisos> permisos = d.getListPermisos();
            if(autor.equals(userName)){
                editor.addContenido(d, contenido);
                break;
            }
            else if(d.enListPermisos(userName)==1){
                if(d.existePermisoEscritura(permisos, userName)==1){
                    editor.addContenido(d, contenido);
                    break;
                }
                else{
                    System.out.println("-------------------------------------------------\n"
                    +          "|                Usuario no posee el permiso                |\n"
                    +          "-------------------------------------------------");
                    break;
                }
            }
          case "4":
            System.out.println("Ingrese el id del documento: ");
            idDoc = accion.nextLine();
            System.out.println("Ingrese el id de la version: ");
            idVersion = accion.nextLine();
            ListDocumentos lista2 = editor.getListaDocumentos();
            int numero2 = Integer.parseInt(idDoc);
            Documento d2 = lista2.existeDocId(numero2);
            String autor2 = d2.getAutor();
            Usuario usuario2 = editor.getUsuarioLog();
            String userName2 = usuario2.getUserName();
            int numeroVersion = Integer.parseInt(idVersion);
            if(autor2.equals(userName2)){
                editor.rollback(d2, numeroVersion);
                break;
            }
            else{
                System.out.println("-------------------------------------------------\n"
                +          "|                Usuario no es el autor               |\n"
                +          "-------------------------------------------------");
                break;
            }
          case "5":
            System.out.println("Ingresar id del documento: ");
            idDoc= accion.nextLine();
            ListDocumentos lista3 = editor.getListaDocumentos();
            int numero3 = Integer.parseInt(idDoc);
            Documento d3 = lista3.existeDocId(numero3);
            String autor3 = d3.getAutor();
            Usuario usuario3 = editor.getUsuarioLog();
            String userName3 = usuario3.getUserName();
            if(autor3.equals(userName3)){
                editor.revokeAllAccess(numero3);
                break;
            }
            else{
                System.out.println("-------------------------------------------------\n"
                +          "|                Usuario no es el autor           |\n"
                +          "-------------------------------------------------");
                break;
            }
          case "6":
            String s = editor.editorToStringLogin();
            editor.printEditor(s);
            break;
          case "7":
            System.out.println("Ingrese el id del documento: ");
            idDoc = accion.nextLine();
            System.out.println("Ingrese la cantidad de caracteres a eliminar: ");
            caracteres = accion.nextLine();
            int id = Integer.parseInt(idDoc);
            int cantidadCaracteres= Integer.parseInt(caracteres);
            ListDocumentos lista4 = editor.getListaDocumentos();
            Documento d4 = lista4.existeDocId(id);
            String autor4 = d4.getAutor();
            Usuario usuario4 = editor.getUsuarioLog();
            String userName4 = usuario4.getUserName();
            ArrayList<Permisos> permisos2 = d4.getListPermisos();
            if(autor4.equals(userName4)){
                editor.delete(id,cantidadCaracteres);
                break;
            }
            else if(d4.enListPermisos(userName4)==1){
                if(d4.existePermisoEscritura(permisos2, userName4)==1){
                    editor.delete(id,cantidadCaracteres);
                    break;
                }
            }
            else{
                System.out.println("-------------------------------------------------\n"
                +          "|                Usuario no posee el permiso                |\n"
                +          "-------------------------------------------------");
                break;
            }
          case "8": //Deslogearse
            editor.logout();
            exit = 1;
            this.start();
            break;
          case "9":
            System.out.println("-| HA SALIDO DEL PROGRAMA |-");
            exit = 1;
            break;
          default:
            System.out.println("Ingresar un valor acorde a las opciones");
            break;
        }
      }

    }
    
}
