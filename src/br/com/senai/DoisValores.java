package br.com.senai;

import java.util.Scanner;

public class DoisValores {

	public static void main(String[] args) {
		/*
		 * Crie uma nova classe que solicite ao usuário informar dois valores e em seguida imprima na tela a sequência do primeiro valor até o segundo valor. Caso o primeiro valor seja maior
		 * que o segundo, apresentar o incremento da sequência até o segundo valor. Caso o primeiro valor seja menor que o segundo, apresentar o decremento da sequência até o segundo valor;
		 * Em seguida apresente quantos números pares possui na sequência e quantos número ímpares possuem na sequência.//
		 */
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		int primeiroValor = tec.nextInt();
		System.out.println("Informe outro valor: ");
		int segundoValor = tec.nextInt();
		
		
		if(primeiroValor == segundoValor) {
			System.out.println("Valor igual ao primeiro, impossível imprimir a sequência ");
		}
		if(primeiroValor > segundoValor) {
			while(segundoValor <= primeiroValor) {
				System.out.println(primeiroValor);
				primeiroValor -= 1;
			}
		}
		else if(segundoValor > primeiroValor) {
			while(primeiroValor <= segundoValor) {
				System.out.println(primeiroValor);
				primeiroValor += 1;
			}
		}
		

	}

}
