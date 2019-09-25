package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	List<Topico> findByCursoNome(String nomeCurso);
	
	
/*	 Neste caso tem que ensinar o spring o que quero dizer e eu mesmo escrever uma query 
	@Query("SELEC t FROM Topico T WHERE t.curso.nome = :nomeCurso")
	List<Topico> carregarPorNomeDoCurso(String nome);
*/
}
