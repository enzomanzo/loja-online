package br.com.fiap.appprodutoteste.produto.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDto {
    @NotNull
    @NotBlank //Não aceita valores vazios
    private String nome;
    @NotNull
    @DecimalMin(value = "0.00")
    private BigDecimal valor;
    @NotNull
    @NotBlank
    private Integer quantidade;



}
