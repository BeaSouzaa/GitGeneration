package Lista5;

import java.util.Scanner;

public class Exercicio2parteB {
	
	
	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Instância de Objetos
		
		Exercicio2 aviao = new Exercicio2();
		
		System.out.println("Qual é a fabricante: ");	
		aviao.setFabricante(leia.nextLine());
		
		System.out.println("Qual é a cor do avião: ");
		aviao.setCor(leia.nextLine());   
		
		System.out.println("As máscaras foram testadas e aprovadas? ");
		aviao.setMascara(leia.nextLine());
		
		System.out.println("Os coletes foram testados e aprovados? ");
		aviao.setColete(leia.nextLine());
		
		aviao.setAcao("Está tudo certo, pode decolar!");
		
		System.out.println("\nFabricante do avião: "+ aviao.getFabricante());
		System.out.println("\nA cor do avião é: " + aviao.getCor());
		System.out.println("\nAs máscaras foram testadas e aprovados: " + aviao.getMascara());
		System.out.println("\nOs coletes foram testados e aprovados: " + aviao.getColete());
		
		
		System.out.println("\nO avião poderá decolar ou terá que ficar parado? " + aviao.getAcao());
		
		
		System.out.println("\n|||Boa Viagem|||");
		
		leia.close();
		
		
		
		
		

}
}
