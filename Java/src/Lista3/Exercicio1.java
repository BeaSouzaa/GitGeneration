package Lista3;

public class Exercicio1 {
//Informar todos os números de 1000 a 1999 que quando divididos por 11
//obtemos resto = 5. (FOR)
	public static void main(String[] args) {

	
		for(int num = 1000; num <=1999 ; num++) {  //o laço For será responsável por limitar os valores de 1000 até 1999
			if(num % 11 == 5) { //o if será responsável pela condição que no caso é encontrar os valores do intervalo entre 1000 - 1999 que ao serem divididos por 11, possuem 5 de resto
				System.out.println(num + " é um número que dividido por 11 o resto é 5." ); }
		
		}
		}
	}


	
	
	
