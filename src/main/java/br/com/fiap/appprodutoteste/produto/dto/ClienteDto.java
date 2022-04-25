package br.com.fiap.appprodutoteste.produto.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDto {
    @NotBlank
    @NotNull
    private String nome;
    @NotNull
    @NotBlank
    private String documento;
    private String endereco;
}
