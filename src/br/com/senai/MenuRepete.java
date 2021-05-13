package br.com.senai;

import java.util.Scanner;

public class MenuRepete {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String opcao = "s";
		int opcaoDoMenu = 0;
		
		do {
			System.out.println("--- MENU ---");
			System.out.println("1) Tabuada com Do While");
			System.out.println("2) Tabuada com For");
			System.out.println("3) Editar");
			System.out.println("4) Excluir");
			System.out.println("9) Sair");
			System.out.println("------------");
			System.out.println("Informe a opção desejada: ");
			opcaoDoMenu = tec.nextInt();
			
			switch(opcaoDoMenu) {
			case 1:
				System.out.println("--- TABUADA Do While ---");
				int valor;
				int multiplicador = 0;
				
				System.out.println("Informe um valor inteiro: ");
				valor = tec.nextInt();
				
				do {
					System.out.println(valor + " x " + multiplicador + " = " + (valor * multiplicador));
					multiplicador ++;
					
				} while(multiplicador <= 10);
				
				break;
			case 2:
				System.out.println("--- TABUADA For ---");
				
				int numero;
				System.out.println("Informe um valor inteiro: ");
				numero = tec.nextInt();
				
				for(int i = 0; i <= 10; i++) {
					System.out.println(numero + " x " + i + " = " + (numero * i));
				
				}
				break;
			case 3:
				System.out.println("--- EDITAR ---");
				break;
			case 4:
				System.out.println("--- EXCLUIR ---");
			case 9:
				opcao = "n";
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
			
			
		} while(opcao.equalsIgnoreCase("s"));
		
		System.out.println("Sistema finalizado.");
	}
}
