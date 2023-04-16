package br.com.example.exemplo_spring.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.example.exemplo_spring.modelo.Livro;


public interface LivroRepositorio extends JpaRepository<Livro, Long> {

}