/*
 * LinkedIn: https://www.linkedin.com/in/caiohenrks/
 * Github: https://github.com/Caiohenrks
 */
package br.com.caiohenrks.cadastroapi.cep;

import br.com.caiohenrks.cadastroapi.model.Endereco;
import com.gtbr.ViaCepClient;
import com.gtbr.domain.Cep;
import lombok.Data;

/**
 * @Caiohenrks
 */
@Data
public class EnderecoPorCep {

    public Endereco EnderecoPorCep(int cepInt) {
        Cep cep = ViaCepClient.findCep(String.valueOf(cepInt));
        Endereco endereco = new Endereco();
        
        endereco.setCep(cep.getCep());
        endereco.setLogradouro(cep.getLogradouro());
        endereco.setComplemento(cep.getComplemento());
        endereco.setBairro(cep.getBairro());
        endereco.setLocalidade(cep.getLocalidade());
        endereco.setUf(cep.getUf());
        endereco.setIbge(cep.getIbge());
        endereco.setGia(cep.getGia()); 
        endereco.setDdd(cep.getDdd());
        endereco.setSiafi(cep.getSiafi());

        return endereco;

    }

}
