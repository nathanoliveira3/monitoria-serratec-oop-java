package br.com.serratec.products;

public class Produto {
	private String nome;
	private Double preco;
	private Integer quantidade;
	private Boolean usado;
	
	public Produto(String nome, Double preco, Integer quantidade) {		
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;		
	}
	
	public Produto() {}
	

	public Boolean getUsado() {
		return usado;
	}

	public void setUsado(Boolean usado) {
		this.usado = usado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double calcularValorTotal() {
		return quantidade * preco;
	}
	
	public void retirarProduto(int quantRetirar) {
		if(quantRetirar > quantidade) {
			System.out.println("Não temos essa quantidade em estoque!");
		}else {
			quantidade -= quantRetirar;
		}
	}
	
	public void  adicionarProduto(int quantAdicionar) {
		if(quantAdicionar < 0) {
			System.out.println("Quantidade inválida!");
		}else {
			quantidade += quantAdicionar;
		}
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
		
}
