package br.com.Projeto.api.forumhubb.repository;

import br.com.Projeto.api.forumhubb.domain.curso.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
