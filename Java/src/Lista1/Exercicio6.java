package Lista1;

import java.util.Scanner;
import java.lang.Math;



public class Exercicio6 {

//Construa um programa em c que, tendo como dados de entrada dois pontos
//quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
//que efetua tal cálculo é: d = sqrt((((x2-x1)^2)+(y2-y1)^2))

	public static void main(String[] args) {
		
		
	 Scanner leia = new Scanner(System.in);
	 
	 double x1, x2, y1, y2, d;
	 
	 
	 System.out.println("Escreva o valor de X1: ");
	 x1 = leia.nextDouble();
	 
	 System.out.println("Escreva o valor de X2: ");
	 x2 = leia.nextDouble();
	 
	 System.out.println("Escreva o valor de Y1: ");
	 y1 = leia.nextDouble();
	 
	 System.out.println("Escreva o valor de Y2: ");
	 y2 = leia.nextDouble();
	 
	 d = Math.sqrt(((x2-x1)^2) + ((y2-y1)^2));
	 	
	 
	 System.out.println("A distância entre os pontos é de : " + d);
	 
	 

	}

}
