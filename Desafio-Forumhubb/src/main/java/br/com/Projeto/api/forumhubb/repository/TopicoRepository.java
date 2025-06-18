package br.com.Projeto.api.forumhubb.repository;

import br.com.Projeto.api.forumhubb.domain.topico.Topico;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TopicoRepository extends JpaRepository<Topico, Long> {

}
