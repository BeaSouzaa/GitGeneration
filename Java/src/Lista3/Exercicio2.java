package Lista3;

import java.util.Scanner;

public class Exercicio2 {
//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int p = 0;
		int i = 0;
		
		
		
					
		for(int numero = 1; numero <= 10; numero++) {
			System.out.println("Digite o " + numero + "� n�mero: ");
			numero = leia.nextInt();
			
			if (numero % 2 == 0) {
				p++; } //++ ir� contar a quantidade de n�mero que atende a condi��o dada dentro do if
		
		else if (numero % 2 != 0) {
			     i++; }	
			
		}
		
		System.out.println("H� " + p + " n�mero(s) par(es) e " + i + " n�mero(s) �mpar(es).");
		
		}
	 
		
	}
				

	

