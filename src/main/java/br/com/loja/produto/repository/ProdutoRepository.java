package br.com.loja.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.loja.produto.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
