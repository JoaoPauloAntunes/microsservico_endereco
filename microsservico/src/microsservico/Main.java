/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microsservico;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joao
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // String cep ="13419-200";
        String cep ="30110-012";
        
        MicrosservicoEndereco me = new MicrosservicoEndereco();
        try {
            me.buscar(cep);
            System.out.println(me.getBairro());
            System.out.println(me.getComplemento());
            System.out.println(me.getUf());
            System.out.println(me.getEstado());
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
