package br.com.fiap.appprodutoteste.produto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    private int id;
    private String nome;
    private String documento;
    private String endereco;
}
