package Lista5;

import java.util.Scanner;

public class Exercicio2parteB {
	
	
	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Inst�ncia de Objetos
		
		Exercicio2 aviao = new Exercicio2();
		
		aviao.Fabricante = "Boeing";
		aviao.cor = "Branco com listras azuis";
		aviao.mascara = "N�o";
		aviao.colete = "Sim";
		aviao.acao = "Est� tudo certo, pode decolar!";
		
		System.out.println("Fabricante do avi�o: "+ aviao.Fabricante);
		System.out.println("A cor do avi�o �: " + aviao.cor);
		System.out.println("As m�scaras foram testadas e aprovados: " + aviao.mascara);
		System.out.println("Os coletes foram testados e aprovados: " + aviao.colete );
		System.out.println("O avi�o poder� decolar ou ter� que ficar parado? " + aviao.acao);
		
		
		System.out.println("\n|||Boa Viagem|||");
		
		leia.close();
		
		
		
		
		

}
}
