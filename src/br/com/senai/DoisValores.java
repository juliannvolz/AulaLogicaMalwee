package br.com.senai;

import java.util.Scanner;

public class DoisValores {

	public static void main(String[] args) {
		/*
		 * Crie uma nova classe que solicite ao usu�rio informar dois valores e em seguida imprima na tela a sequ�ncia do primeiro valor at� o segundo valor. Caso o primeiro valor seja maior
		 * que o segundo, apresentar o incremento da sequ�ncia at� o segundo valor. Caso o primeiro valor seja menor que o segundo, apresentar o decremento da sequ�ncia at� o segundo valor;
		 * Em seguida apresente quantos n�meros pares possui na sequ�ncia e quantos n�mero �mpares possuem na sequ�ncia.//
		 */
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		int primeiroValor = tec.nextInt();
		System.out.println("Informe outro valor: ");
		int segundoValor = tec.nextInt();
		
		
		if(primeiroValor == segundoValor) {
			System.out.println("Valor igual ao primeiro, imposs�vel imprimir a sequ�ncia ");
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
