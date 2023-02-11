package br.com.banco.debug;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteBibliotecaDebug {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(111, 555);
		
		c.deposita(100.50);
		
		System.out.println(c.getSaldo());

	}

}
