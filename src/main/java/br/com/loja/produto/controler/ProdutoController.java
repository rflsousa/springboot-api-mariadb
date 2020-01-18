package br.com.loja.produto.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.loja.produto.entity.Produto;
import br.com.loja.produto.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	public ResponseEntity<Produto> adicionarProduto(@RequestBody Produto produto){
		produtoRepository.save(produto);
		return ResponseEntity.ok().body(produto);
	}
}
