package Lista2;

import java.util.Scanner;

public class Exerc�cio1 {
// Fa�a um programa que receba tr�s inteiros e escreva qual � o maior 

	public static void main(String[] args) {

	Scanner leia = new Scanner(System.in);
	
	int num1, num2, num3;
	
	System.out.println("Escreva o 1� n�mero inteiro: ");
	num1 = leia.nextInt();
	
	System.out.println("Escreva o 2� n�mero inteiro: ");
	num2 = leia.nextInt();
	
	System.out.println("Escreva o 3� n�mero inteiro: ");
	num3 = leia.nextInt();
	
	if (num1 > num2 &&  num1 > num3) {
		System.out.println("\nO primeiro n�mero inteiro � o maior!");}
		
		 else if(num2 > num1 && num2 > num3) {
			System.out.println("\nO segundo n�mero inteiro � o maior!"); }
		 else {
			 System.out.println("\n O terceiro n�mero inteiro � o maior!");}
	
			 }
		
	}


