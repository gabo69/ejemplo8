/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplo8;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Mantuano ---- Luis Torres
 */
public class Ejemplo8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     int a=0,lngtd;
     String cadn;
     cadn=JOptionPane.showInputDialog("Ingrese una Frase");
     cadn=" "+ cadn;         
     char[] frase = cadn.toCharArray();  
     for (int i = 0; i< cadn.length() ; i++)
        {
        if (frase[i]=='A'||frase[i]=='a') 
        {
        a=a+1;
        for (int j = i; j < cadn.length(); j++) 
        {
        if (frase[j]==' ') 
        {
        i=j;
        j=cadn.length();                      
                    }   
                }                
            }            
        }
        System.out.println(cadn);
        JOptionPane.showMessageDialog(null,"Hay "+a+ " palabras que tiene/n letras A");
    }
}
