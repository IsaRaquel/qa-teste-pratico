package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import Aplicacao.Cliente;
import Aplicacao.GerenciadorPromocao;
import Aplicacao.Promocao;

public class TestGerarMensagem {
	
	@Test
	public void testVerfcicarMensagemParaUmaPromocao() {
		
		Cliente cliente=new Cliente();
		Promocao promocao=new Promocao();
		cliente.setId(1234);
		cliente.setNome("Jorge");
		
		promocao.setId(4321);
		promocao.setNome_Produto("Sofá");
		promocao.setId_Produto(1);
		promocao.setPreco_Anterior(1200.00);
		promocao.setPreco_atual(1000.00);
		
		
		GerenciadorPromocao gerenciador= new GerenciadorPromocao();		
		List<Promocao> promocoes = new ArrayList<Promocao>();	
		promocoes.add(promocao);
		
		String mensagemGerada=gerenciador.gerarMensagem(cliente,promocoes);
		String mensagemExperada="Olá "+cliente.getNome()+", os seguintes\n"
				+ "produtos que você costuma consumir estão em promoção! Vem conferir:\n"
				+ "- "+promocao.getNome_Produto()+": De "+promocao.getPreco_Anterior()+" por "+ promocao.getPreco_atual();
		
		assertEquals(mensagemExperada, mensagemGerada);	
		
	}

	@Test
	public void testVerfcicarMensagemParaTresPromocoes() {
		
		Cliente cliente=new Cliente();
		Promocao promocao1=new Promocao();
		Promocao promocao2=new Promocao();
		Promocao promocao3=new Promocao();
		GerenciadorPromocao gerenciador= new GerenciadorPromocao();		
		List<Promocao> promocoes = new ArrayList<Promocao>();
		
		cliente.setId(1234);
		cliente.setNome("Jorge");
		
		promocao1.setId(1);
		promocao1.setNome_Produto("Sofá");
		promocao1.setId_Produto(1);
		promocao1.setPreco_Anterior(1200.00);
		promocao1.setPreco_atual(1000.00);
		
		promocao2.setId(2);
		promocao2.setNome_Produto("Televisão");
		promocao2.setId_Produto(2);
		promocao2.setPreco_Anterior(1300.00);
		promocao2.setPreco_atual(900.00);
		
		promocao3.setId(3);
		promocao3.setNome_Produto("Geladeira");
		promocao3.setId_Produto(3);
		promocao3.setPreco_Anterior(1500.00);
		promocao3.setPreco_atual(1200.00);
	
		promocoes.add(promocao1);
		promocoes.add(promocao2);
		promocoes.add(promocao3);
		
		String mensagemGerada=gerenciador.gerarMensagem(cliente,promocoes);
		String mensagemExperada="Olá "+cliente.getNome()+", os seguintes produtos que você costuma consumir estão em promoção! Vem conferir:\n"
				+ "- "+promocao1.getNome_Produto()+": De "+promocao1.getPreco_Anterior()+" por "+ promocao1.getPreco_atual()+"\n"
				+ "- "+promocao2.getNome_Produto()+": De "+promocao2.getPreco_Anterior()+" por "+ promocao2.getPreco_atual()+"\n"
						+ "- "+promocao3.getNome_Produto()+": De "+promocao3.getPreco_Anterior()+" por "+ promocao3.getPreco_atual()+"\n";
		
		assertEquals(mensagemExperada, mensagemGerada);	
		
		
	}
}
