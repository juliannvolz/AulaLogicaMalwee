package br.com.senai;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		/*
		 * Crie uma nova classe chamada Tabuada e desenvolva um algoritmo que receba uma entrada de dados, Scanner(), pedindo que o usuário informe um número inteiro, em seguida apresente
		 * a tabuada do valor informado pelo usuário;
		 */
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		int valor = tec.nextInt();
		int multiplicador = 0;
				
		while(multiplicador <= 10) {
			System.out.println(valor + " x "+ multiplicador + " = " + (valor * multiplicador));
			multiplicador += 1;
	}

	}
}
