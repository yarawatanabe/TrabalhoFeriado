/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacaodivisao;

import javax.swing.JOptionPane;

/**
 *
 * @author Yara Watanabe
 */
public class MultiplicacaoDivisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int resto, multi = 0, soma = 0;

        // TODO code application logic here
        for (int i = 0; i <= 30; i++) {

            resto = i % 2;

            if (resto > 0) {
                soma +=i;

                System.out.println("Soma " + soma);

            } else {
                multi = multi * i;

                System.out.println("Multiplica " + multi);
            }

        }

    }

}
