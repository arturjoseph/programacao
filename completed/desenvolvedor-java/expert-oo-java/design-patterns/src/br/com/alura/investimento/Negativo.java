package br.com.alura.investimento;

public class Negativo implements EstadoDaConta {
	
      public void saca(Conta conta, double valor) {
        throw new RuntimeException("Sua conta est� no vermelho. N�o � poss�vel sacar!");
      }

      public void deposita(Conta conta, double valor) {
        conta.saldo += valor * 0.95;
		if (conta.saldo > 0)
			conta.estado = new Positivo();
      }

    }