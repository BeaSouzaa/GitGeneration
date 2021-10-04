package Lista2;

import java.util.Scanner;

public class Exercício3 {
////Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
	//categorias:
	//Infantil A = 5 a 7 anos
	//Infantil B = 8 a 11 anos
	//Juvenil A = 12 a 13 anos
	//Juvenil B = 14 a 17 anos
	//Adultos = Maiores de 18 an

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
	
		
		System.out.println("\nPor favor, informe a sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 5 && idade <= 7) {
			System.out.println("\nInfantil A");
		}
		
		else if (idade >= 8 && idade <= 11) {
			System.out.println("\nInfantil B");
		}
		
		else if (idade >= 12 && idade <= 13) {
			System.out.println("\nJuvenil A");
		}
		
		else if(idade >= 14 && idade <= 17) {
			System.out.println("\nJuvenil B");	
		}
		
		else if(idade >= 18 && idade <= 90) {
			System.out.println("\nAdulto");
		}
		
		else {
			System.out.println("\nNão trabalhamos com a idade informada. ");
		}
		leia.close();
		
		
		
	

	}

}
