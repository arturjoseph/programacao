package br.com.alura.banheiro;

public class Principal {

	public static void main(String[] args) {
		
		Banheiro banheiro = new Banheiro();

		Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "Jo�o");
		Thread convidado2 = new Thread(new TarefaNumero2(banheiro), "Pedro");
		Thread limpeza = new Thread(new TarefaLimpeza(banheiro), "Faxineira");
		limpeza.setDaemon(true);
		
		convidado1.start();
		convidado2.start();
		limpeza.start();
		
	}

}
