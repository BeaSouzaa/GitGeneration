package Lista5;

import java.util.Scanner;

public class Exercicio1parteB {
//************TESTE CLIENTE***************
	
	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		//Instância de Objeto
		Exercicio1 cliente = new Exercicio1();
		
	
		
		
		cliente.Nome = "Beatriz";
		cliente.Idade = "25 anos";
		cliente.Naturalidade = "Capivari";
		cliente.Email = "beatrizgsouza.bgs@gmail.com";
		cliente.setSaldo(978221);
		
		
		
		
		System.out.println("**************PREÇO PARA ALUGUEL DE CARRO*************");
			
		
		System.out.println("Nome: " + cliente.Nome);
		System.out.println("Idade: " + cliente.Idade);
		System.out.println("Naturalidade: " + cliente.Naturalidade);
		System.out.println("Email: " + cliente.Email);
		
		
		System.out.println("O valor do seu saldo é R$: " + cliente.Saldo);
		System.out.println("\n|*|*|*|*|Obrigada pela preferência|*|*|*|*|");
		
		leia.close();
	}	

}
