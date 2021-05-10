package br.com.senai;

import java.util.Scanner;

public class ParEImpar {

	public static void main(String[] args) {
		/*
		 * Crie uma nova classe que solicite ao usuário informar dois valores e em seguida imprima na tela a sequência do primeiro valor até o segundo valor. Caso o primeiro valor seja menor
		 * que o segundo, apresentar o incremento da sequência até o segundo valor. Caso o primeiro valor seja maior que o segundo, apresentar o decremento da sequência até o segundo valor;/
		 */
		Scanner tec = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		int primeiroValor = tec.nextInt();
		System.out.println("Informe outro valor: ");
		int segundoValor = tec.nextInt();
		int par = 0;
		int impar = 0;
		
		if(primeiroValor == segundoValor) {
			System.out.println("Valor igual ao primeiro, impossível imprimir a sequência ");
		}
		if(primeiroValor > segundoValor) {
			while(segundoValor <= primeiroValor) {
				if(primeiroValor % 2 ==0) {
					par += 1;
				} else {
					impar += 1;
				}
				System.out.println(primeiroValor);
				primeiroValor = 1;
			}
		}
		else if(segundoValor > primeiroValor) {
			while(primeiroValor <= segundoValor) {
				if(primeiroValor % 2 ==0) {
					par += 1;
				} else {
					impar += 1;
				}
				System.out.println(primeiroValor);
				primeiroValor += 1;
			}
		}
		System.out.println("Pares: " + par);
		System.out.println("Impares: " + impar);

	}

}
