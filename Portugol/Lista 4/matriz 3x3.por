
programa{
/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/
	
	funcao inicio(){
		inteiro matriz[3][3]
		inteiro coluna, linha, somadetudo = 0, somadiagonal = 0

		para (linha = 0; linha < 3; linha++){
			para (coluna = 0; coluna < 3; coluna++){

				escreva("Posição: [ ", linha+1, " ][ ", coluna+1, " ]: ")
				leia(matriz[linha][coluna])
						}
		}
		limpa()

		para(linha = 0; linha< 3; linha++){
			para (coluna = 0; coluna < 3; coluna++){
				escreva("[ " , matriz[linha][coluna], " ]")
			                                     }
			           			             escreva("\n")
		}
		para(linha = 0; linha < 3; linha++){
			para (coluna = 0; coluna< 3; coluna++){
				somadetudo += matriz[linha][coluna]
				                                 }
			                            }
			          escreva("\nO somatório de todos os números da matriz é de: ", somadetudo)

	    para(linha = 0; linha < 3; linha++){
			para (coluna = 0; coluna< 3; coluna++){
				se ( linha == coluna){
					somadiagonal += matriz[linha][coluna]
				                     }
				}
			     			                           }
	 escreva("\nA soma dos valores da diagonal principal é de : " , somadiagonal)             
	
}        
}



/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1210; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */