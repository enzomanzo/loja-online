package br.com.fiap.appprodutoteste.produto.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //Indica que é um arquivo de configuração
public class SpringConfig {

    @Bean // Mapeamento de objetos
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
