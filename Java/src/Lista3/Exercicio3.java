package Lista3;

import java.util.Scanner;


public class Exercicio3 {
//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
//idade for =-99.

	public static void main(String[] args) {
	 
		Scanner leia = new Scanner(System.in);
				

		int idade, menos = 0, mais = 0;
		
	System.out.println("Escreva a sua idade: ");
		idade = leia.nextInt();
		
		while(idade != -99) {
			
			if (idade <= 21) { //Verificação de lógica e coloca o valor no ++ para contagem 
			menos++; 
			}
											// if ---> else if ( trabalham na mesma proposta, com variáveis iguais) --->else (3 lógicas)
		
			if (idade >= 50) {  
			 mais++;
			 }	
	   
	System.out.println("\nEscreva a sua idade (Para encerrar digite -99): ");
		idade = leia.nextInt();
			}
		
	System.out.println("A quantidade de pessoas com menos de 21 anos é de: " + menos +"." + "\nE a quantidade acima dos 50 anos é de: " + mais);
	}
}





