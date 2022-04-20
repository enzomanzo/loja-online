package br.com.fiap.appprodutoteste.produto.controllers;

import br.com.fiap.appprodutoteste.produto.dto.ClienteDto;
import br.com.fiap.appprodutoteste.produto.model.Cliente;
import br.com.fiap.appprodutoteste.produto.repositories.ClienteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller // Indica que a classe é um controller
public class ClienteController {

    @Autowired //faz a injecao de dependencia
    private ClienteRepository clienteRepository;

    @Autowired //faz a injecao de dependencia
    private ModelMapper modelMapper;

    @GetMapping("/clientes") //mapeia a url
    public ModelAndView cliente() {
        ModelAndView mv = new ModelAndView("clientes/index");

        List<Cliente> listarClientes = clienteRepository.findAll(); //lista todos os clientes
        mv.addObject("listarClientes", listarClientes); //adiciona a lista de clientes na view
        return mv;
    }

    @GetMapping("/clientes/criar")
    public ModelAndView criar() {

        return new ModelAndView("clientes/criar");
    }

    @PostMapping("clientes")
    public String salvar(ClienteDto model) {
        Cliente clienteEntity = modelMapper.map(model, Cliente.class); //mapeia o model para o cliente

        clienteRepository.save(clienteEntity); //salva o cliente

        return "redirect:/clientes";
    }
}
