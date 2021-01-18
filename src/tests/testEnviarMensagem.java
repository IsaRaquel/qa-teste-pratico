package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import Aplicacao.GerenciadorPromocao;


public class testEnviarMensagem {
	
	
	@Test
	public void testEnviarMensagemNull() {
		
		
		GerenciadorPromocao gerenciador= new GerenciadorPromocao();		
		String mensagem=null;
		assertFalse(gerenciador.enviarMensagem(mensagem));	
		
	}
	
	@Test
	public void testEnviarMensagem() {
		
		
		GerenciadorPromocao gerenciador= new GerenciadorPromocao();		
		String mensagem="Olá Jorge, os seguintes produtos que você costuma consumir estão em promoção! Vem conferir:\n"
				+ "- Sofá: De 1200.0 por 1000.0";
		assertTrue(gerenciador.enviarMensagem(mensagem));	
		
	}
}
