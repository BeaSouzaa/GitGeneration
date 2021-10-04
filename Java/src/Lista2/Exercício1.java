package Lista2;

import java.util.Scanner;

public class Exercício1 {
// Faça um programa que receba três inteiros e escreva qual é o maior 

	public static void main(String[] args) {

	Scanner leia = new Scanner(System.in);
	
	int num1, num2, num3;
	
	System.out.println("Escreva o 1º número inteiro: ");
	num1 = leia.nextInt();
	
	System.out.println("Escreva o 2º número inteiro: ");
	num2 = leia.nextInt();
	
	System.out.println("Escreva o 3º número inteiro: ");
	num3 = leia.nextInt();
	
	if (num1 > num2 &&  num1 > num3) {
		System.out.println("\nO primeiro número inteiro é o maior!");}
		
		 else if(num2 > num1 && num2 > num3) {
			System.out.println("\nO segundo número inteiro é o maior!"); }
		 else {
			 System.out.println("\n O terceiro número inteiro é o maior!");}
	
			 }
		
	}


