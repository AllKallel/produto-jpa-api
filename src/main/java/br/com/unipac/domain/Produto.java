package br.com.unipac.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Null;

@Entity
@Table(name = "produto")
public class Produto extends IDEntity implements Serializable {

	private static final long serialVersionUID = -5770418217559219573L;
	
	@Null
	@NotEmpty(message = "Campo Vazio")
	@Column(name = "Nome_produto")
	private String produto;
	
	@Null
	@NotEmpty(message = "Campo Vazio")
	@Column(name = "preco_produto")
	private double preco;
	
	@Null
	@NotEmpty(message = "Campo Vazio")
	@Column(name = "qtde_produto")
	private double quantidade;
	
	public Produto(@Null @NotEmpty(message = "Campo Vazio") String produto, double preco, double quantidade) {
		super();
		this.produto = produto;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	
}
