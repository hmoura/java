/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author hivisonmoura
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s  = 0;
        Scanner teclado = new Scanner(System.in);
        String resp;
        do{
            System.out.println("Digite um numero");
            n = teclado.nextInt();
            s += n;
            System.out.println("Quer continuar ? [S/N]");
            resp = teclado.next();
        }while (resp.equals("s"));
        System.out.println("A soma de todos os valore é : " + s);
    }
    
}
