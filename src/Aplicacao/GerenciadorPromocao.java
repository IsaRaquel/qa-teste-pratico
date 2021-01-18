package Aplicacao;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorPromocao {
	
	

	public boolean salvarMensagem(String mensagem, Cliente cliente) {

		return false;
	}
	
	public boolean enviarMensagem(String mensagem) {

		return false;
	}
	
	public String gerarMensagem(Cliente cliente, List<Promocao> promocoes) {
		String mensagem = null;
		return mensagem;
		
	}
	
	public boolean verificarComprasUltimosCincoDias(Cliente cliente, List<Promocao> promocao) {
	
		return false;
	}
	
	public List<Promocao> consultarTresMaisRelevantes(Cliente cliente, List<Promocao> promocao) {
		return new ArrayList<Promocao>();			
	
	}
	
	public List<Promocao> consultarPromocoesCliente(Cliente cliente) {
		return new ArrayList<Promocao>();			
	
	}	
	
	
}
