package Lista1;

import java.util.Scanner;

public class Exercício3 {

//Faça um sistema que leia o tempo de duração de um evento em uma fábrica
//expressa em segundos e mostre-o expresso em horas, minutos e segundos.

		public static void main(String[] args) {
			
		 Scanner leia = new Scanner(System.in);
		 
		 int duracao, horas, minutos, segundos;
		 
		 System.out.println("Escreva o tempo de duração do evento (s): ");
		 duracao = leia.nextInt();
		 
		 horas = duracao / 3600;
		 minutos = (duracao / 3600) % 60;
		 segundos = (duracao % 3600) % 60;
		 
		 
		 System.out.println("A duração do evento foi de: " + horas + " hora(s), " + minutos + " minuto(s) e " + segundos + " segundo(s).");
		 

		}
	}

