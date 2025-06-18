package br.com.Projeto.api.forumhubb.repository;

import br.com.Projeto.api.forumhubb.domain.autor.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
