package Lista1;

import java.util.Scanner;


public class Exercício5 {
//Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
//aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
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
				
		
		System.out.println("Sua média final é de: " + mf);
		leia.close();

	}

}
