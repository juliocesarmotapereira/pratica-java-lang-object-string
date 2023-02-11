package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {

		String vazio = " ";
		String tirarVazio = vazio.trim();
		String vazioDoEspaço = "  Espaço  ";

		// System.out.println(vazio);
		System.out.println(tirarVazio.isEmpty());
		System.out.println(vazioDoEspaço);
		System.out.println(vazioDoEspaço.contains("Pa"));

		String nome = "TesteNome"; // objeto literal

		// para criar um objeto:
		// String outro = new String("TesteNome");

		// char c = 'T';
		// char d = 'Z';
		// String outra = nome.replace(c, d);

		// String outra = nome.toLowerCase();
		// String outra = nome.toUpperCase();

		// System.out.println(nome);
		// System.out.println(outra);

		// char letra = nome.charAt(5);
		// System.out.println(letra);

		// int posicao = nome.indexOf("No");
		// System.out.println(posicao);

		// String sub = nome.substring(2);
		// System.out.println(sub);

		System.out.println(nome.length());

		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
	}
}
