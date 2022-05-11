/*
 * LinkedIn: https://www.linkedin.com/in/caiohenrks/
 * Github: https://github.com/Caiohenrks
 */
package br.com.caiohenrks.cadastroapi.model.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;

/**
 * @Caiohenrks
 */
@Getter
public class UsuarioDto {

    @NotBlank
    private String nome;

    private String telefone;
    private String data_nascimento;
    private String cpf;
    private String cep;

}
