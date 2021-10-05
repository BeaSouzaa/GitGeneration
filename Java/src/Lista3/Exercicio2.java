package Lista3;

import java.util.Scanner;

public class Exercicio2 {
//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int p = 0;
		int i = 0;
		
		
		
					
		for(int numero = 1; numero <= 10; numero++) {
			System.out.println("Digite o " + numero + "º número: ");
			numero = leia.nextInt();
			
			if (numero % 2 == 0) {
				p++; } //++ irá contar a quantidade de número que atende a condição dada dentro do if
		
		else if (numero % 2 != 0) {
			     i++; }	
			
		}
		
		System.out.println("Há " + p + " número(s) par(es) e " + i + " número(s) ímpar(es).");
		
		}
	 
		
	}
				

	

