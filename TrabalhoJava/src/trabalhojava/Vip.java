/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhojava;

/**
 *
 * @author Yara Watanabe
 */
public class Vip extends Ingresso {
    
    double valorAdicional;

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
   public double valorComAdicional(){
       return this.valorReais + this.valorAdicional;
   }
}
