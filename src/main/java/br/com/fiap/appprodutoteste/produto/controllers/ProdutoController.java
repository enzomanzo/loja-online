package br.com.fiap.appprodutoteste.produto.controllers;


import br.com.fiap.appprodutoteste.produto.dto.ProdutoDto;
import br.com.fiap.appprodutoteste.produto.model.Produto;
import br.com.fiap.appprodutoteste.produto.repositories.ProdutoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ModelMapper modelMapper;


    @GetMapping("/produtos")
    public ModelAndView index() {
        ModelAndView modelView = new ModelAndView("produtos/index");


        List<Produto> produtoDaRepository = produtoRepository.findAll();
        modelView.addObject("listarProdutos", produtoDaRepository);

        return modelView;
    }

    @GetMapping("/produtos/criar")
    public ModelAndView criar(ProdutoDto produto) {
        ModelAndView modelView = new ModelAndView("produtos/criar");
        return modelView;
    }

    @PostMapping("produtos")
    public ModelAndView salvar(@Valid ProdutoDto produto, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return new ModelAndView("produtos/criar");
        }

        Produto produtoEntity = modelMapper.map(produto, Produto.class);
        produtoRepository.save(produtoEntity);
        return new ModelAndView("redirect:/produtos");
    }


}

