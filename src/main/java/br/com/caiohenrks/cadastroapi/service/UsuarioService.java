/*
 * LinkedIn: https://www.linkedin.com/in/caiohenrks/
 * Github: https://github.com/Caiohenrks
 */
package br.com.caiohenrks.cadastroapi.service;

import br.com.caiohenrks.cadastroapi.cep.EnderecoPorCep;
import br.com.caiohenrks.cadastroapi.model.Endereco;
import br.com.caiohenrks.cadastroapi.model.Usuario;
import br.com.caiohenrks.cadastroapi.model.dto.EnderecoDto;
import br.com.caiohenrks.cadastroapi.model.dto.UsuarioDto;
import br.com.caiohenrks.cadastroapi.repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

/**
 * @Caiohenrks
 */
@RequiredArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final ModelMapper modelMapper;

    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    public void salvarUsuario(UsuarioDto usuarioDto) {
        Usuario usuario = modelMapper.map(usuarioDto, Usuario.class);
        //Endereco endereco = modelMapper.map(enderecoDto, Endereco.class);
        //System.out.println(endereco);
        //usuario.setEndereco(endereco);
        usuarioRepository.save(usuario);
    }

    public void deletarUsuarioPorId(Long id) {
        usuarioRepository.deleteById(id);
    }

    public Usuario buscarUsuarioPorId(Long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);

        if (!usuario.isPresent()) {
            return null;
        }

        return usuario.get();
    }

}
