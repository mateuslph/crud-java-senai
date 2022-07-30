package br.com.senai.projetouc8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.senai.projetouc8.orm.Grupos;
import br.com.senai.projetouc8.service.GrupoService;

@Controller
public class GrupoController {
	
	@Autowired
	private GrupoService servico;
	
	@GetMapping({"/grupos", "/"})
	public String listarGrupos(Model modelo) {
		modelo.addAttribute("grupos", servico.listarGrupos());
		return "grupos";
	}
	
	@GetMapping({"/grupos/{id}"})
	public String apagarGrupos(@PathVariable Integer id) {
		servico.apagarGrupos(id);
		return "redirect:/grupos";
	}
	
	@GetMapping("/grupos/adicionar")
	public String adicionarGrupos(Model modelo) {
		Grupos grupos = new Grupos();
		modelo.addAttribute("grupos", grupos);
		return "formGrupos";
	}
	
	@PostMapping("/grupos")
	public String salvarGrupos(@ModelAttribute("grupos") Grupos grupos) {
		servico.salvarGrupos(grupos);
		return "redirect:/grupos";
	}
}
