
	programa{
//João, homem de bem, comprou um microcomputador para controlar o rendimento diário
//de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
//regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
//excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
//verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
//da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
//ZERO.
	
	funcao inicio(){
		real P, E, M //P --> peso do tomate, E--> Excesso de tomate e M --> Valor da multa 
		escreva("Quantidade de tomates em kg: ")
		leia(P)
	
		
		se (P > 50) {
			escreva ("\nQuantidade em kg ultrapassou o limite permitido pelo estado, terá multa!")
			
			E = (P- 50.00)
			escreva("\n\nA quantidade em excesso é de " + E + "kg")

			M = (E*4.00)
			escreva("\n\nO valor da multa é de " + M + "R$")}
			
		senao {
		  	escreva("\nNão ultrapasou o valor permitido,portanto não haverá multa\n\nE = 0\n\nM = 0")
		  }
	}
	
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1078; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */