package Lista3;

public class Exercicio1 {
//Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
//obtemos resto = 5. (FOR)
	public static void main(String[] args) {

	
		for(int num = 1000; num <=1999 ; num++) {  //o la�o For ser� respons�vel por limitar os valores de 1000 at� 1999
			if(num % 11 == 5) { //o if ser� respons�vel pela condi��o que no caso � encontrar os valores do intervalo entre 1000 - 1999 que ao serem divididos por 11, possuem 5 de resto
				System.out.println(num + " � um n�mero que dividido por 11 o resto � 5." ); }
		
		}
		}
	}


	
	
	
