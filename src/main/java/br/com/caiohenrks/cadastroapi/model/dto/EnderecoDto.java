/*
 * LinkedIn: https://www.linkedin.com/in/caiohenrks/
 * Github: https://github.com/Caiohenrks
 */
package br.com.caiohenrks.cadastroapi.model.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;

/**
 *  @Caiohenrks
 */
@Getter
public class EnderecoDto {
    
    @NotBlank
    private String cep;
    
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;

}
