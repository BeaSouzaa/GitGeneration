package Lista8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Scanner;


public class Ex3_TestaCollection {

	
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
				estoque p1 = new estoque ("Produto x " , 3);
				estoque p2 = new estoque ("Produto y " , 5);
				estoque p3 = new estoque("Produto z", 6 );
							
									
				ArrayList <estoque> estoque = new ArrayList<estoque>();
									
				
				System.out.println("|*|*|*|*|*| CONTROLE DE ESTOQUE |*|*|*|*|*|");
				
				estoque.add(p1);
				estoque.add(p2);
				estoque.add(p3);
				
				
				
				
				System.out.println(estoque);
				
				System.out.println("Para inserir item  no estoque digite 1");
				
				
		}

	}

