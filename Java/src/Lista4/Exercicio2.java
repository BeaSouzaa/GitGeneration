package Lista4;

import java.util.Scanner;


public class Exercicio2 {
//Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
//que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
//imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
//quantas foram as ocorr�ncias da maior pontua��o.
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		

			int[] dado = new int [10];
			int i, soma = 0;
			int maior = 0;
			
			
			
			for (i = 0; i < 10 ; i++) {
				System.out.println("\nQual foi o valor obtido no dado: ");
				dado [i] = leia.nextInt();
				soma += dado[i];
		
				if(maior > dado[i]) {
					maior = dado[i];
					}
				
				}	
			
			
	}

}
