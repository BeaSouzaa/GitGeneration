package Lista7;

import java.util.Scanner;

public class Exercicio2_TodososAnimais {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Exercicio2_Cachorro cachorro = new Exercicio2_Cachorro();
		
		
		System.out.println("\nQual é o nome do cachorro? ");
		cachorro.nome();
		System.out.println("\nQual é a idade do cachorro? ");
		cachorro.idade();
		System.out.println("\nQual é ação do cachorro? ");
		cachorro.acao();
		System.out.println("\nQual som o cachorro faz? ");
		cachorro.somAnimal();
			
		Exercicio2_Cavalo cavalo = new Exercicio2_Cavalo();
		
		
		System.out.println("\nQual é o nome do cavalo? ");
		cavalo.nome();
		System.out.println("\nQual é a idade do cavalo? ");
		cavalo.idade();
		System.out.println("\nQual é ação do cavalo? ");
		cavalo.acao();
		System.out.println("\nQual som o cavalo faz? ");
		cavalo.somAnimal();
		
		Exercicio2_Preguica preguica = new Exercicio2_Preguica();
		
		System.out.println("\nQual é o nome da preguiça?  ");
		preguica.nome();
		System.out.println("\nQual é a idade da preguiça? ");
		preguica.idade();
		System.out.println("\nQual é ação da preguiça? ");
		preguica.acao();
		System.out.println("\nQual som a preguiça faz? ");
		preguica.somAnimal();	
		
	}

}
