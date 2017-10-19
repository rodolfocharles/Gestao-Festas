package com.gestao.festa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gestao.festa.model.Convidado;
import com.gestao.festa.service.ConvidadosService;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {
	@Autowired
	private ConvidadosService convidados;
	
	@GetMapping
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListaConvidados");
		modelAndView.addObject("convidados", convidados.findAllConvidados());
		modelAndView.addObject(new Convidado());
		return modelAndView;
	}
	
	@PostMapping
	public String salvar(Convidado convidado) {
		this.convidados.addConvidado(convidado);
		return "redirect:/convidados";
	}

}
