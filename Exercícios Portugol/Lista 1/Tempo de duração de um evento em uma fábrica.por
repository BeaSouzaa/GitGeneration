programa{
//tempo de duração de um evento de uma fábrica
	
	funcao inicio(){
	
	inteiro tempo , horas, minutos, segundos
	
	escreva("Tempo de duração (s):")
	leia(tempo)

	horas = tempo / 3600
	minutos = (tempo % 3600) / 60
	segundos = (tempo % 3600) % 60

	escreva("\nO tempo de duração do evento foi de " + horas + " hora(s) " + minutos + " minuto(s) " + segundos + " segundo(s).")
	


	 

	 
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 396; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */