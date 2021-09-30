programa{
		inclua biblioteca Matematica --> mat
	
	funcao inicio(){
	real num1, num2, num3, num4, qdr1, qdr2, qdr3,qdr4

	escreva("Digite o primeiro número: ")
	leia(num1)

	escreva("Digite o segundo número: ")
	leia(num2)

	escreva("Digite o terceiro número: ")
	leia(num3)

	escreva("Digite o quarto número: ")
	leia(num4)

	limpa()

	qdr1 = mat.potencia(num1, 2.0)
	escreva ("\nO quadrado do primeiro número: " + qdr1)

	qdr2 = mat.potencia(num2, 2.0)
	escreva ("\nO quadrado do segundo número: " + qdr2)

	qdr3 = mat.potencia(num3, 2.0)
	escreva("\nO quadrado do terceiro número: " + qdr3)

	qdr4 = mat.potencia(num4, 2.0)
	escreva("\nO quadrado do quarto número: " + qdr4)
	
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 683; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */