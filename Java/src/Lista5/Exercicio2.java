package Lista5;

public class Exercicio2 {
//Crie uma classe avi�o e apresente os atributos e m�todos referentes
//esta classe, em seguida crie um objeto avi�o, defina as instancias deste
//objeto e apresente as informa��es deste objeto no console.

	
		 String Fabricante;
		 String cor;
		 String mascara;
		 String colete;
		 String acao;
		 
		 
		//atributo
		public String getFabricante() {
			return Fabricante;
		}
		public String getCor() {
			return cor;
		}
		public String getMascara() {
			return mascara;
		}
		public String getColete() {
			return colete;
		}
		
		//m�todo
		public void setAcao(String acao) {
			if(mascara == colete) {
			this.acao = acao;}
			else {
				System.out.println("O avi�o n�o pode decolar!");
			}
				 

	}
}


