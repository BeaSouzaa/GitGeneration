package Lista1;

import java.util.Scanner;

public class Exerc�cio4 {
//Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
//calcule a seguinte express�o: D = ( R+S )/2
// R = (A + B) ^2               S = (B + C)^2

		public static void main(String[] args) {
			
			 Scanner leia = new Scanner (System.in);
			 
			 int a, b, c, d, r, s; 
			 
			 
			 System.out.println("Escreva o valor de A: ");
			 a = leia.nextInt();
			 
			 System.out.println("Escreva o valor de B: ");
			 b = leia.nextInt();
			 
			 System.out.println("Escreva o valor de C: ");
			 c = leia.nextInt();
			 
			 r = ((a + b)^2);
					 
			 s = ((b + c)^2);
			 
			 d = ((r + s)^2);
			 
			 System.out.println("O valor de D � :" + d);
			 leia.close();
			
		}

	}

