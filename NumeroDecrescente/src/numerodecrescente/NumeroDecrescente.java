/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerodecrescente;

import javax.swing.JOptionPane;

/**
 *
 * @author Yara Watanabe
 */
public class NumeroDecrescente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero;

        // TODO code application logic here
        numero = Integer.parseInt(JOptionPane.showInputDialog("Dígite um número inteiro"));

        do {
            System.out.println(numero);
            numero--;
        } while (numero >= 0);
    }

}
