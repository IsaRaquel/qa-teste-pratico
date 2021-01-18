package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import Aplicacao.Cliente;
import Aplicacao.GerenciadorPromocao;
import Aplicacao.Promocao;

public class TestVerificarComprasUltimosCincoDias {

	@Test
	public void testVerfcicarClienteComCompraNos5Dias() {
		
		Cliente clienteComComprasNos5dias=new Cliente();
		GerenciadorPromocao gerenciador= new GerenciadorPromocao();		
		List<Promocao> promocoes = new ArrayList<Promocao>();	
		
		assertTrue(gerenciador.verificarComprasUltimosCincoDias(clienteComComprasNos5dias,promocoes));	
		
	}
	
	@Test
	public void testVerfcicarClienteSemCompraNos5Dias() {
		
		Cliente clienteSemComprasNos5dias=new Cliente();
		GerenciadorPromocao gerenciador= new GerenciadorPromocao();		
		List<Promocao> promocoes = new ArrayList<Promocao>();	
		
		assertFalse(gerenciador.verificarComprasUltimosCincoDias(clienteSemComprasNos5dias,promocoes));	
		
	}
}
