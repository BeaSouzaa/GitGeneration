programa{
	//Tempo vivido
	funcao inicio(){
	inteiro dias_vividos, anos, meses, dias
	
	escreva("Olá, me informe sua idade em dias:")
	leia(dias_vividos)

	anos = dias_vividos/365
	meses = (dias_vividos % 365)/30
	dias = (dias_vividos % 365)%30

	escreva("O meu tempo vivido é de " + anos +" anos, " + meses + " meses, e " + dias + " dias ")


	

	


	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 28; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */