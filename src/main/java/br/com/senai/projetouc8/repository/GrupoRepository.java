package br.com.senai.projetouc8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.projetouc8.orm.Grupos;

@Repository
public interface GrupoRepository extends JpaRepository<Grupos, Integer> {

}
