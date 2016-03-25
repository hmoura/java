/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoravoto;

import com.sun.webkit.dom.KeyboardEventImpl;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author hivisonmoura
 */
public class CalculadoraVoto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String texto;
        int year = Calendar.getInstance().get(Calendar.YEAR); // Pegar o ano atual do sistema com a classe Calendar do Java
        System.out.print("Digite o ano de nascimento : ");
        Scanner teclado = new Scanner(System.in); // Classe para entrar dados com teclado do computador
        int nasc = teclado.nextInt();
        int idade = year - nasc;

        if (idade < 16) {
            texto = "Não pode votar";
        } else if (idade >= 16 && idade <= 18 || idade > 70) {
            texto = "Opcional";
        } else {
            texto = "Obrigatório";
        }

        System.out.println(texto);
    }

}
