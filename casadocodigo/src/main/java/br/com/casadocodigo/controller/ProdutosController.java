package br.com.casadocodigo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.casadocodigo.model.Produto;
import br.com.casadocodigo.model.TipoPreco;
import br.com.casadocodigo.repository.Produtos;

@Controller
@RequestMapping("/produtos")
public class ProdutosController {

	@Autowired
	private Produtos produtos;

	// @RequestMapping("/form")
	// public String form() {
	// return "produtos/form";
	// }

	@RequestMapping("form")
	public ModelAndView form() {
		ModelAndView modelAndView = new ModelAndView("produtos/form");
		modelAndView.addObject("tipos", TipoPreco.values());
		return modelAndView;
	}

	

	@RequestMapping(method = RequestMethod.POST)
	public String grava(Produto produto) {

		produtos.save(produto);
		return "/produtos/ok";
	}

}

//
// public ModelAndView form() {
// ModelAndView modelAndView = new ModelAndView("produtos/form");
// modelAndView.addObject("tipos", TipoPreco.values());
// return modelAndView;
// }
