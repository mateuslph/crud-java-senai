package br.com.senai.projetouc8.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.projetouc8.orm.Grupos;
import br.com.senai.projetouc8.repository.GrupoRepository;

@Service
public class GrupoServiceCRUD implements GrupoService{
	
	@Autowired
	private GrupoRepository repository;
	
	public List<Grupos> listarGrupos(){
		return (List<Grupos>) repository.findAll();
	}
	
	public void apagarGrupos(Integer id) {
		repository.deleteById(id);
	}

}
