package Lista5;

import java.util.Scanner;

public class Exercicio1parteB {
//************TESTE CLIENTE***************
	
	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		//Instância de Objeto
		Exercicio1 cliente = new Exercicio1();
		
	
		
		System.out.println("Digite o seu nome: ");
		
		cliente.setNome(leia.nextLine());
		
		System.out.println("Digite a sua idade: ");
		cliente.setIdade(leia.nextLine());
		
		System.out.println("Qual é a sua naturalidade: ");
		cliente.setNaturalidade(leia.nextLine());
		
		System.out.println("Digite o seu email: ");
		cliente.setEmail (leia.nextLine());
		
		cliente.setSaldo(978221);
		
		
		System.out.println("*************VALOR DO SALDO**************");
			
		
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Idade: " + cliente.getIdade());
		System.out.println("Naturalidade: " + cliente.getNaturalidade());
		System.out.println("Email: " + cliente.getEmail());
		
		
		System.out.println("O valor do seu saldo é R$: " + cliente.getSaldo());
		System.out.println("\n|*|*|*|*|Obrigada pela preferência|*|*|*|*|");
		
		leia.close();
	}	

}
