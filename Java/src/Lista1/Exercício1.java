package Lista1;

import java.util.Scanner;

public class Exerc�cio1 {
// Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
//dias e mostre-a expressa apenas em dias.
		
		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			
			int anos, meses, dias, tempoemdias;
			
					
			System.out.println("Sua idade em anos �? ");
			anos = leia.nextInt(); //comando para melhorar a seguran�a

			
						
			System.out.println("Em meses? ");
			meses = leia.nextInt();
			
			System.out.println("E dias? ");
			dias = leia.nextInt();
			
			
			tempoemdias = ((anos*365) + (meses*30) + (dias));
			
			System.out.println("O seu tempo vivido em dias � de: " + tempoemdias);
			leia.close();
		}

	}

