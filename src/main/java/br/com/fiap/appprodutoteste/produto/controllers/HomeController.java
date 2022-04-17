package br.com.fiap.appprodutoteste.produto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(HttpServletRequest request) {
		request.setAttribute("nomeUsuario", "Enzo");
		return "home";
	}

}
