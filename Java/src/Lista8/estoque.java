package Lista8;

public class estoque {
		
	private String produto;
	
	private int quantidade;
	
	public estoque (String produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
		
	}


	public String getProduto() {
		return produto;
	}


	public void setProduto(String produto) {
		this.produto = produto;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String toString() {
		return "Nome: " + this.produto + "\nQuantidade: " + this.quantidade;
		
		
	}

}


