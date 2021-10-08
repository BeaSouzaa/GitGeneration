package Lista5;

import java.util.Scanner;


public class Exercicio1 {
	//*********************CLIENTES**********************
	
	//Crie uma classe cliente e apresente os atributos e métodos referentes
	//esta classe, em seguida crie um objeto cliente, defina as instancias deste
	//objeto e apresente as informações deste objeto no console.

	Scanner leia = new Scanner(System.in);
	//ATRIBUTOS
	String Nome;
	String Idade;
	String Naturalidade;
	String Email;
	double Saldo;

	
	

	public String getNome() {
		return Nome;
	}

	public String getIdade() {
		return Idade;
	}
	public String getNaturalidade() {
		return Naturalidade;
	}
	
	public String getEmail() {
		return Email;
	}
	public void setSaldo(double saldo) {
		Saldo += saldo;
	}

	
			
	}


