package Lista5;

import java.util.Scanner;

public class Exercicio2parteB {
	
	
	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Inst�ncia de Objetos
		
		Exercicio2 aviao = new Exercicio2();
		
		System.out.println("Qual � a fabricante: ");	
		aviao.setFabricante(leia.nextLine());
		
		System.out.println("Qual � a cor do avi�o: ");
		aviao.setCor(leia.nextLine());   
		
		System.out.println("As m�scaras foram testadas e aprovadas? ");
		aviao.setMascara(leia.nextLine());
		
		System.out.println("Os coletes foram testados e aprovados? ");
		aviao.setColete(leia.nextLine());
		
		aviao.setAcao("Est� tudo certo, pode decolar!");
		
		System.out.println("\nFabricante do avi�o: "+ aviao.getFabricante());
		System.out.println("\nA cor do avi�o �: " + aviao.getCor());
		System.out.println("\nAs m�scaras foram testadas e aprovados: " + aviao.getMascara());
		System.out.println("\nOs coletes foram testados e aprovados: " + aviao.getColete());
		
		
		System.out.println("\nO avi�o poder� decolar ou ter� que ficar parado? " + aviao.getAcao());
		
		
		System.out.println("\n|||Boa Viagem|||");
		
		leia.close();
		
		
		
		
		

}
}
