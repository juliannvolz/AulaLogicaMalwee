package br.com.senai;

import java.util.Scanner;

public class VetorDeDados {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		int idade[] = {5, 18, 16, 21, 20, 4, 28, 32};

		for(int i = 0; i < idade.length; i++) {
			System.out.println(idade[i]);

		}
		
		String addNovo = "s";
		do {
			System.out.print("Informe o index do vetor: ");
			for(int i = 0; i < idade.length; i++) {
				System.out.print(i + " | ");
			}
			System.out.println("-> ");
			int index = tec.nextInt();
			
			System.out.print("Informe a idade: ");
			idade[index] = tec.nextInt();
			
			System.out.print("Deseja informar uma nova idade? [s/n]");
			addNovo = tec.next();
		}while(addNovo.equals("s")); //usa equals quando é String
		
		for(int i = 0; i < idade.length; i++) {
			System.out.println(idade[i]);

		}
		System.out.println("Vetor ordenado:");
		int aux;
		for(int i = 0; i < idade.length - 1; i++) {
			for(int j = i + 1; j < idade.length; j++) {
				if(idade[i] > idade[j]) {
					aux = idade[i];
					idade[i] = idade[j];
					idade[j] = aux;
					
				}
			}
		}
		for(int i = 0; i < idade.length; i++) {
			System.out.println(idade[i]);
		}
		
	}
}
