package br.com.senai;

import java.util.Scanner;

public class AtividadeLogica {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String continuar = "s";
		int opcaoDoMenu;
		
		do {
			System.out.println("--- MENU ---");
			System.out.println("1 - Verificar sexo e idade");
			System.out.println("2 - Contagem de valores");
			System.out.println("3 - Tabuada");
			System.out.println("4 - Cadastrar cursos");
			System.out.println("Informe a opção desejada: ");
			opcaoDoMenu = tec.nextInt();
			
			switch(opcaoDoMenu) {
			case 1:
				System.out.println("--- Verificar sexo e idade ---");
				System.out.println("Informe o seu nome: ");
				String nome = tec.next();
				System.out.println("Informe o ano de nascimento: ");
				int anoDeNascimento = tec.nextInt();
				System.out.println("Informe o seu sexo: [m/f]");
				String sexo = tec.next();
				int idade = 2021 - anoDeNascimento;
				
				System.out.println(nome + ", você nasceu em " + anoDeNascimento);
				System.out.println("Sua idade é: " + idade);
				
				
				if(!sexo.equals("m") && !sexo.equals("f")) {
				System.out.println("Opção inválida!");
				
				}else if(sexo.equals("m")){
	                System.out.println("Você é do sexo masculino");;
				}else if(sexo.equals("f")){
	                System.out.println("Você é do sexo feminino");
				
				}else if(idade < 12) {
					System.out.println("Criança");
				}else if(idade >= 12 && idade < 18) {
					System.out.println("Jovem");
				}else if(idade >= 18 && idade < 65) {
					System.out.println("Adulto");
				}else {
					System.out.println("Idoso");
				}
				
				if(idade < 16) {
					System.out.println("Não pode votar");
				}else if(idade == 16 && idade == 17 && idade > 70) {
					System.out.println("Voto opcional");
				}else if(idade >= 18 && idade < 70) {
					System.out.println("Voto obrigatório");
				}
				
				if(idade < 18) {
					System.out.println("Não pode tirar habilitação");
				}else if(idade >= 18) {
					System.out.println("Pode tirar habilitação");
				}
				
				break;
			
			case 2:
				System.out.println("--- Contagem de valores ---");
				System.out.println("Informe o primeiro valor: ");
				int primeiroValor = tec.nextInt();
				System.out.println("Informe o segundo valor: ");
				int segundoValor = tec.nextInt();
				
				if(primeiroValor == segundoValor) {
		            System.out.println("Valor igual ao primeiro, impossível imprimir a sequência");
		        
				}else if(primeiroValor > segundoValor) {
				while(segundoValor <= primeiroValor) 
		          System.out.println(segundoValor);
		          segundoValor += 1;
				
				}else if(segundoValor > primeiroValor) {
		            while(primeiroValor <= segundoValor)
		                System.out.println(primeiroValor);
		                primeiroValor += 1;
				}
				
				break;
				
			case 3: 
				System.out.println("--- Tabuada ---");
				System.out.println("Informe um valor: ");
				int valor = tec.nextInt();
				int multiplicador = 0;
				
				while(multiplicador <= 10) {
		            System.out.println(valor + "x" + multiplicador + "=" + (valor * multiplicador));
		            multiplicador += 1;
		        }
				
				break;
				
			case 4:
				System.out.println("---- Cadastrar Cursos ----");
				String[] cursos = new String[5];
				String inserirCursos = "s";
				int aux = 0;
				
				while(inserirCursos.equalsIgnoreCase("s") && aux < cursos.length) {
					System.out.print("Informe o Curso que Deseja Cadastrar: ");
					cursos[aux] = tec.next();
					aux++;
					System.out.println("\n");
					System.out.print("Deseja Cadastrar um novo Curso? [S/N] -> ");
					inserirCursos = tec.next();
					System.out.println("\n");
				}
				
				for (int i = 0; i < cursos.length; i ++) {
					System.out.println(cursos [i]);	
		}
				break;
			
				
			default:
				System.out.println("Opção inválida.");
				break;
				
		}
			
		System.out.print("Deseja fazer outra operação? [s/n]");
		continuar = tec.next();
		}while(continuar.equalsIgnoreCase("s"));
		
		System.out.println("Sistema encerrado.");
	}
}
