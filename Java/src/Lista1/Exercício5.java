package Lista1;

import java.util.Scanner;


public class Exerc�cio5 {
//Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
//aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
//respectivamente.
			

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		
		double n1, n2, n3, mf;
		
		
		
		System.out.println("Escreva a sua primeira nota: ");
		n1 = leia.nextDouble();
		
		System.out.println("Escreva a sua segunda nota: ");
		n2 = leia.nextDouble();
		
		System.out.println("Escreva a sua terceira nota: ");
		n3 = leia.nextDouble();
		
		mf = ((n1*0.2)+ (n2*0.3)+(n3*0.5));
				
		
		System.out.println("Sua m�dia final � de: " + mf);
		leia.close();

	}

}
