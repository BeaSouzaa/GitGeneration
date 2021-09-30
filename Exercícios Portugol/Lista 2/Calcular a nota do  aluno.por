programa{
//Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
//aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
//respectivamente.
	
	funcao inicio(){
		real N1, N2, N3, M

		escreva("Qual é a sua primeira nota? : ")
		leia(N1)

		escreva("Qual é a sua segunda nota? :")
		leia(N2)

		escreva("Qual é a sua terceira nota? ")
		leia(N3)

		M = (((2*N1)+(3*N2)+(5*N3))/10)

		escreva("A média final é de: " + M)} 
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 234; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */