package Lista1;

import java.util.Scanner;

public class Exercício2 {
//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
//expressa em anos, meses e dias.

		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			
			
			int diasvividos, anos,  meses, dias;
					
			System.out.println("\nEscreva a quantidades de dias que viveu: ");
			diasvividos = leia.nextInt();
			
			anos = (diasvividos / 365);
			meses = (diasvividos % 365) / 30;
			dias = (diasvividos % 365) % 30;
			
			System.out.println("\nO meu tempo vivido é de " + anos + " anos, " + meses + " meses e " + dias + " dias");
		
		}

	}

