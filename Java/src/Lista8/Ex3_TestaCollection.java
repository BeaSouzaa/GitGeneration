package Lista8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Scanner;


public class Ex3_TestaCollection {

	
		public static void main(String[] args) throws InterruptedException {
			Scanner leia = new Scanner(System.in);
				int opcao ;
				
			
			
				estoque p1 = new estoque ("Produto x " , 3);
				estoque p2 = new estoque ("Produto y " , 5);
				estoque p3 = new estoque("Produto z", 6 );
							
									
				ArrayList <estoque> estoque = new ArrayList<estoque>();

				System.out.println("|*|*|*|*|*| CONTROLE DE ESTOQUE |*|*|*|*|*|");
				
				estoque.add(p1);
				estoque.add(p2);
				estoque.add(p3);
				
				
				
				do {
				
					System.out.println(estoque);
					
					Thread.sleep(1000);
					System.out.println("\nPara inserir item  no estoque digite 1" );
					Thread.sleep(1000);
					System.out.println("\nPara remover item do estoque digite 2");
					Thread.sleep(1000);
					System.out.println("\nPara sair do programa digite 0");
					opcao = leia.nextInt();
					
					
					switch (opcao) {
					
						case 1: 
				            System.out.println("Escreva o  nome do produto: ");
							String nomedoproduto = leia.next();
							
							
							
							
							System.out.println("Escreva a quantidade do produto: ");
							int quantdoproduto = leia.nextInt();
							
							
							estoque p4 = new estoque(nomedoproduto, quantdoproduto);
							
							estoque.add(p4);
							
							break;
						
						case 2:
							System.out.println("Escreva o nome do produto que quer remover: ");
							String remover = leia.next();
							
							
							
								
							estoque.remove(remover);
							
							break;
							
						case 0:
							Thread.sleep(1000);
							System.out.println("O programa está sendo fechado!");
							break;
							
							
						default:
							System.out.println("Escolha uma opção válida!");
						
					
						}
				
				}while(opcao != 0); 
				
	
		
		
		
		
		}
			
		
				
				 
				
				
				
				
	}

	

