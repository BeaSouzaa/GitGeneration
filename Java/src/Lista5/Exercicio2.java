package Lista5;

public class Exercicio2 {
//Crie uma classe avião e apresente os atributos e métodos referentes
//esta classe, em seguida crie um objeto avião, defina as instancias deste
//objeto e apresente as informações deste objeto no console.

	
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
		
		//método
		public void setAcao(String acao) {
			if(mascara == colete) {
			this.acao = acao;}
			else {
				System.out.println("O avião não pode decolar!");
			}
				 

	}
}


