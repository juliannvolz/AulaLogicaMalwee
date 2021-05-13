package br.com.senai;

public class LacoDeRepeticaoDoWhile {

	public static void main(String[] args) {
		
		int valor = 0;
		
		System.out.println("Valor inicial: " + valor);
		
		do {
			System.out.println("-> " + valor);
			valor++;
		} while(valor <= 10);
		
		System.out.println("Valor final: " + valor);

	}
}
