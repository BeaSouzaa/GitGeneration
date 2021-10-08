package Lista5;

import java.util.Scanner;

public class Exercicio2parteB {
	
	
	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Instância de Objetos
		
		Exercicio2 aviao = new Exercicio2();
		
		aviao.Fabricante = "Boeing";
		aviao.cor = "Branco com listras azuis";
		aviao.mascara = "Não";
		aviao.colete = "Sim";
		aviao.acao = "Está tudo certo, pode decolar!";
		
		System.out.println("Fabricante do avião: "+ aviao.Fabricante);
		System.out.println("A cor do avião é: " + aviao.cor);
		System.out.println("As máscaras foram testadas e aprovados: " + aviao.mascara);
		System.out.println("Os coletes foram testados e aprovados: " + aviao.colete );
		System.out.println("O avião poderá decolar ou terá que ficar parado? " + aviao.acao);
		
		
		System.out.println("\n|||Boa Viagem|||");
		
		leia.close();
		
		
		
		
		

}
}
