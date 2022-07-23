package br.com.senai.projetouc8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping({"/","/"})
	public String barra(Model modelo ) {
		modelo.addAttribute("index");
		return "index";
	}
	
	@GetMapping({"/grupo","/"})
	public String listarGrupo(Model modelo) {
		modelo.addAttribute("grupo");
		return "grupo";
	}
}
