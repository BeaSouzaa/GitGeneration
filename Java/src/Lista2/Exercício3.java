package Lista2;

import java.util.Scanner;

public class Exercício3 {
////Elabore um sistema que que recba a idade e informe 
// 10 - 14 infantil;
// 15 - 17 juvenil;
// 18 - 25 adulto

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
	
		
		System.out.println("\nPor favor, informe a sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 10  && idade <= 14) {
			System.out.println("\nInfantil ");
		}
		
		else if (idade >= 8 && idade <= 11) {
			System.out.println("\nJuvenil ");
		}
		
		else if (idade >= 18 && idade <= 25) {
			System.out.println("\nAdulto ");
		}
		
		else {
			System.out.println("\nNão trabalhamos com a idade informada. ");
		}
		leia.close();
		
		
		
	

	}

}
