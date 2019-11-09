package br.com.unipac.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.unipac.domain.Produto;
import br.com.unipac.domain.repository.ProdutoRepository;
import br.com.unipac.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	private ProdutoRepository clienteRepository;

	@Override
	public Produto save(Produto produto) {
		return clienteRepository.save(produto);
	}

	@Override
	public List<Produto> listAll() {
		return clienteRepository.findAll();
	}

	@Override
	public Produto Update(Long id, Produto produto) {
		produto.setId(id);
		return clienteRepository.save(produto);
	}

	@Override
	public Optional<Produto> findById(Long id) {
		return clienteRepository.findById(id);
	}

	@Override
	public void remove(Long id) {
		clienteRepository.deleteById(id);

	}

	@Override
	public List<Produto> findByNome(String name) {
		return clienteRepository.findByName(name);
	}

	@Override
	public Page<Produto> findAllPageable(Pageable pageable) {
		return clienteRepository.findAll(pageable);
	}

}
