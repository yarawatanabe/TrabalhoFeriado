/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maiornumero;
import javax.swing.JOptionPane;
/**
 *
 * @author Yara Watanabe
 */
public class MaiorNumero {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numeroUm;
        int numeroDois;
        int maiorNumero;
   
        // TODO code application logic here
        
        numeroUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro:"));
        numeroDois= Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro:"));
        
        if (numeroUm > numeroDois){
            maiorNumero = numeroUm;
        }
        else {
           maiorNumero = numeroDois; 
        }
        JOptionPane.showMessageDialog(null,"O maior número é: " + maiorNumero);
        
       
    }
    
}
