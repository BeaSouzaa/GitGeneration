package Lista1;

import java.util.Scanner;
import java.lang.Math;


public class Exercício7 {
//Um sistema de equações lineares do tipo: ax + by = c, dx + ey = f, pode ser resolvido segundo: 
// x = ((ce-bf)/(ae-bd)); y = ((af-cd)/(ae-bd))
//Escreva o sistema que lê os coeficientes a, b, c, d, e, f e calcule x, y.

	
	
	public static void main(String[] args) {
		
	Scanner leia = new Scanner (System.in);
	
	double a, b, c, d, e, f, x, y;
	
	
	System.out.println("Escreva o valor do coeficinte a: ");
	a = leia.nextDouble();
	
	System.out.println("\nEscreva o valor do coeficiente b: ");
	b = leia.nextDouble();
	
	
	System.out.println("\nEscreva o valor do coeficiente c: ");
	c = leia.nextDouble();
	
	System.out.println("\nEscreva o valor do coeficiente d: ");
	d = leia.nextDouble();
	
	System.out.println("\nEscreva o valor do coeficinte e: ");
	e = leia.nextDouble();
	
	System.out.println("\nEscreva o valor do coeficiente f: ");
	f = leia.nextDouble();
	
	
	x = ((c*e-b*f)/(a*e-b*d));
	
    y = ((a*f-c*d)/(a*e-b*d));
	 
	System.out.println("\nO valor de X é : " + x);
	
	System.out.println("\nO valor de Y é: " + y);
	
	
	

	}

}
