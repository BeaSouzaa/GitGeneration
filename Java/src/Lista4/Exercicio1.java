package Lista4;

import java.util.Scanner;

public class Exercicio1 {
//Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
//atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
				
			int [] pontuacao = new int [5];
			int contagem = 0; 
			int maior = 0;	
			
			
			for ( contagem = 0; contagem <5; contagem++) {
			System.out.println("Escreva a sua pontua��o: ");
			pontuacao [contagem] = leia.nextInt();
				if(pontuacao[contagem] > maior) {
					maior = pontuacao[contagem];
				}
			}
			
			System.out.println("A maior pontua��o �: " + maior);
			
			
			}
	}


	


