/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horadosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author gabriel
 */
public class HoraDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date relogio = new Date();
        System.out.println("A hora do sistema é "+relogio.toString());
        System.out.println("");
        
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma do sistema é "+idioma);
        System.out.println("");
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension tela = tk.getScreenSize();
        System.out.println("A resolução da tela é "+tela.width+"x"+tela.height);
        
    }
    
}
