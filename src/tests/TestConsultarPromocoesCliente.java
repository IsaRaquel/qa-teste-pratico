package tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Aplicacao.Cliente;
import Aplicacao.GerenciadorPromocao;

class TestConsultarPromocoesCliente {

	@Test
	void testVerificarPromocaoDoClienteComPromocao() {
		
		Cliente clienteComPromocao=new Cliente();
		GerenciadorPromocao gerenciador= new GerenciadorPromocao();		
		assertTrue(gerenciador.consultarPromocoesCliente(clienteComPromocao).size()>0);	
		
	}
	
	@Test
	void testVerificarPromocaoDoClienteSemPromocao() {
		
		Cliente clienteSemPromocao=new Cliente();
		GerenciadorPromocao gerenciador= new GerenciadorPromocao();		
		assertFalse(gerenciador.consultarPromocoesCliente(clienteSemPromocao).size()>0);	
		
	}

}
