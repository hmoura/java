/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author hivisonmoura
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        int p  = 0;
        int i  = 0;
        int c  = 0;
        float m  = 0;
        int cc = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("<html>Informe um número : <br><em>Valor 0 interrompe</em></html>"));
            s +=n;
              cc ++;
            if (n > 100) {
               c ++; 
                    
            }
            if (n % 2 == 0){
                ++ p;
            }else {
                ++ i;
            }
            
            
        } while (n != 0);
        cc --;
        p --;
        
        m = s / cc;
       JOptionPane.showMessageDialog(null, "<html> Resultado final<hr>" +
                "<br> Somatório vale : " + s +  
                "<br> Total de pares : " + p +
                "<br> Total de impares : " + i +
                "<br> Acima de 100 : " + c + 
                "<br> Media de valores : " + m + 
                "<br>" + cc + "</html>"); 

    }

}
