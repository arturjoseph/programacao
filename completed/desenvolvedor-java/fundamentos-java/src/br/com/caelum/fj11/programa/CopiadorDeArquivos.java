package br.com.caelum.fj11.programa;

public class CopiadorDeArquivos implements Runnable{
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("copiador");
		}
		
	}

}
