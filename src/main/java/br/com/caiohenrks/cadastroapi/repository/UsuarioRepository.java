/*
 * LinkedIn: https://www.linkedin.com/in/caiohenrks/
 * Github: https://github.com/Caiohenrks
 */
package br.com.caiohenrks.cadastroapi.repository;

import br.com.caiohenrks.cadastroapi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *  @Caiohenrks
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
