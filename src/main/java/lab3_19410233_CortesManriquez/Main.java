/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3_19410233_CortesManriquez;

/**
 *
 * @author matias
 */
public class Main {
    private Editor editor;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main programa = new Main();
        programa.iniEditor();
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
    
}
