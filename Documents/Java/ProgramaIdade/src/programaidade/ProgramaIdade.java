/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author hivisonmoura
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Em que ano você nasceu ? ");
        Scanner t = new Scanner (System.in);
        int nasc = t.nextInt();
        int ano = Calendar.getInstance().get(Calendar.YEAR);
        int idade = ano - nasc;
        System.out.println("Sua idade é " + idade);
        if (idade < 18) {
            System.out.println("Menor de idade ");    
        }else {
            System.out.println("Maior de idade");
        }
    }
    
}
