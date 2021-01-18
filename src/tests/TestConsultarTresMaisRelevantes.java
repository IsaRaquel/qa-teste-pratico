package tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import Aplicacao.Cliente;
import Aplicacao.GerenciadorPromocao;
import Aplicacao.Promocao;

public class TestConsultarTresMaisRelevantes {

	
	@Test
	public void testverificarClienteComtresPromocoes() {
		
		Cliente clienteComTresPromocoes=new Cliente();
		GerenciadorPromocao gerenciador= new GerenciadorPromocao();		
		List<Promocao> promocoes = new ArrayList<Promocao>();	
		
		promocoes.add(new Promocao());
		promocoes.add(new Promocao());
		promocoes.add(new Promocao());
		
		assertTrue(gerenciador.consultarTresMaisRelevantes(clienteComTresPromocoes, promocoes).size()==3);	
		
	}
	
	@Test
	public void testverificarClienteComCincoPromocoes() {
		
		Cliente clienteComCincoPromocoes=new Cliente();
		GerenciadorPromocao gerenciador= new GerenciadorPromocao();		
		List<Promocao> promocoes = new ArrayList<Promocao>();	
		
		promocoes.add(new Promocao());
		promocoes.add(new Promocao());
		promocoes.add(new Promocao());
		promocoes.add(new Promocao());
		promocoes.add(new Promocao());
		
		assertTrue(gerenciador.consultarTresMaisRelevantes(clienteComCincoPromocoes, promocoes).size()==3);	
		
	}
	
	@Test
	public void testverificarClienteComDuasPromocoes() {
		
		Cliente clienteComDuasPromocoes=new Cliente();
		GerenciadorPromocao gerenciador= new GerenciadorPromocao();		
		List<Promocao> promocoes = new ArrayList<Promocao>();	
		
		promocoes.add(new Promocao());
		promocoes.add(new Promocao());
		
		assertTrue(gerenciador.consultarTresMaisRelevantes(clienteComDuasPromocoes, promocoes).size()==2);	
		
	}
	
	@Test
	public void testverificarClienteSemPromocoes() {
		
		Cliente clienteSemPromocoes=new Cliente();
		GerenciadorPromocao gerenciador= new GerenciadorPromocao();		
		List<Promocao> promocoes = new ArrayList<Promocao>();	
		
				
		assertTrue(gerenciador.consultarTresMaisRelevantes(clienteSemPromocoes, promocoes).size()==3);	
		
	}
}
