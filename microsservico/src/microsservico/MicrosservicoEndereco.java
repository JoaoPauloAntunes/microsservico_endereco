/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microsservico;

import br.com.parg.viacep.ViaCEP;
import br.com.parg.viacep.ViaCEPException;

/**
 *
 * @author joao
 */
public class MicrosservicoEndereco extends AbstractEndereco {
    
    public MicrosservicoEndereco() {
    }
    
    public void buscar(String cep) throws Exception {
        this.cep = cep.replaceAll("\\D", "");
        
        if (this.cep.length() == 8) {
            ViaCEP viaCep = new ViaCEP();
            try {
                viaCep.buscar(cep);
                this.logradouro = viaCep.getLogradouro();
                this.bairro = viaCep.getBairro();
                this.complemento = viaCep.getComplemento();
                this.localidade = viaCep.getLocalidade();
                this.uf = viaCep.getUf();
            } catch (ViaCEPException ex) {
                throw ex;
            }
        } else {
            throw new Exception("O campo CEP deve ter 8 dígitos");
        }
    }
}
