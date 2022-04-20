package br.com.fiap.appprodutoteste.produto.repositories;

import br.com.fiap.appprodutoteste.produto.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
