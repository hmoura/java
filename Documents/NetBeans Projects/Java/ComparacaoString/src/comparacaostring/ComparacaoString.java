/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author hivisonmoura
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Hivison";
        String nome2 = "Hivison";
        String nome3 = new String ("Hivison");
        
        String res = (nome1.equals(nome3))?"Igual":"Diferente";
        System.out.println(res);
    }
    
}
