package tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import Aplicacao.Cliente;
import Aplicacao.GerenciadorPromocao;
import Aplicacao.Promocao;

public class TestSalvarMensagem {
	
	
	@Test
	public void testSalvarMensagem() {
		
		Cliente cliente=new Cliente();
		GerenciadorPromocao gerenciador= new GerenciadorPromocao();
		String mensagem="Olá Jorge, os seguintes produtos que você costuma consumir estão em promoção! Vem conferir:\n"
				+ "- Sofá: De 1200.0 por 1000.0";
				
		assertTrue(gerenciador.salvarMensagem(mensagem,cliente));	
		
	}

}
