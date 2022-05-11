/*
 * LinkedIn: https://www.linkedin.com/in/caiohenrks/
 * Github: https://github.com/Caiohenrks
 */
package br.com.caiohenrks.cadastroapi.controller;

import br.com.caiohenrks.cadastroapi.model.Usuario;
import br.com.caiohenrks.cadastroapi.model.dto.UsuarioDto;
import br.com.caiohenrks.cadastroapi.service.UsuarioService;
import java.util.List;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Caiohenrks
 */
@RequiredArgsConstructor
@RestController
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public ResponseEntity listarUsuarios() {
        List<Usuario> usuarios = usuarioService.listarUsuarios();
        if (usuarios.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(usuarios);
    }

    @PostMapping("/usuario")
    public ResponseEntity<Usuario> salvarUsuario(@Valid @RequestBody UsuarioDto usuarioDto) {
        usuarioService.salvarUsuario(usuarioDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    
    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<Usuario> buscarUsuario(@PathVariable Long usuarioId) {
        Usuario usuario = usuarioService.buscarUsuarioPorId(usuarioId);

        if (usuario == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(usuario);
    }

    @DeleteMapping("/usuario/{usuarioId}")
    public ResponseEntity deletarUsuario(@PathVariable Long usuarioId) {
        Usuario usuario = usuarioService.buscarUsuarioPorId(usuarioId);

        if (usuario == null) {
            return ResponseEntity.notFound().build();
        }
        usuarioService.deletarUsuarioPorId(usuarioId);
        return ResponseEntity.ok().build();
    }
}
