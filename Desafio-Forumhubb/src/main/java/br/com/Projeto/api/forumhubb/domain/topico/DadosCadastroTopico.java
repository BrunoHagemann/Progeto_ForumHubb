package br.com.Projeto.api.forumhubb.domain.topico;

import br.com.Projeto.api.forumhubb.domain.autor.Autor;
import br.com.Projeto.api.forumhubb.domain.curso.Curso;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosCadastroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensagem,

        LocalDateTime dataCriacao,
        @NotBlank
        String status,
        @NotNull
        @Valid
        Autor autor,
        @NotNull
        @Valid
        Curso curso
 ) {
}
