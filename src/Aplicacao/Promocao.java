package Aplicacao;

public class Promocao {
	
	int id;
	int id_Produto;
	String nome_Produto;
	double preco_Anterior;
	double preco_atual;
	
	
	
	public String getNome_Produto() {
		return nome_Produto;
	}
	public void setNome_Produto(String nome_Produto) {
		this.nome_Produto = nome_Produto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_Produto() {
		return id_Produto;
	}
	public void setId_Produto(int id_Produto) {
		this.id_Produto = id_Produto;
	}
	public double getPreco_Anterior() {
		return preco_Anterior;
	}
	public void setPreco_Anterior(double preco_Anterior) {
		this.preco_Anterior = preco_Anterior;
	}
	public double getPreco_atual() {
		return preco_atual;
	}
	public void setPreco_atual(double preco_atual) {
		this.preco_atual = preco_atual;
	}
	
	

}
