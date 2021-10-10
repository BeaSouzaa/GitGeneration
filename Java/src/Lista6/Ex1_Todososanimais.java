package Lista6;

import java.util.Scanner;


public class Ex1_Todososanimais {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		Ex1_Cachorro cachorro = new Ex1_Cachorro();
		Ex1_Cavalo cavalo = new Ex1_Cavalo();
		Ex1_Preguiça preguica = new Ex1_Preguiça();
		
		
			
		
		cachorro.setAnimal("Cachorro");
		cachorro.setIdade("7");
		cachorro.setIdade("AU-AU");
		cachorro.setAcao("O cachorro corre");
		
		System.out.println();
		
		
		cavalo.setAnimal("Cavalo");
		cavalo.setIdade("8");
		cavalo.setIdade("iiiiirrrriii");
		cavalo.setAcao("O cavalo corre");
		
		System.out.println();
		
		preguica.setAnimal("Preguiça");
		preguica.setIdade("5");
		preguica.setSom("Many, meu chapa");
		preguica.setAcao("A preguiça sobe em árvores.");
		
		System.out.println("Qual animal? " + cachorro.getAnimal());
		System.out.println("Qual é a idade do animal? " + cachorro.getIdade());
		System.out.println("Qual som ele emite?" + cachorro.getSom());
		System.out.println("O que esse animal faz? " + cachorro.getAcao());
		
		System.out.println();
		
		System.out.println("Qual animal? " + cavalo.getAnimal());
		System.out.println("Qual é a idade do animal? " + cavalo.getIdade());
		System.out.println("Qual som ele emite?" + cavalo.getSom());
		System.out.println("O que esse animal faz? " + cavalo.getAcao());
		
		System.out.println();
		System.out.println("Qual animal? " + preguica.getAnimal());
		System.out.println("Qual é a idade do animal? " + preguica.getIdade());
		System.out.println("Qual som ele emite?" + preguica.getSom());
		System.out.println("O que esse animal faz? " + preguica.getAcao());
		
		System.out.println();
		
		
		

	}

}
 