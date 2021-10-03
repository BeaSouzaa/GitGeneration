programa{
/* Desenvolver um sistema que efetue a soma de todos os números ímpares que são
múltiplos de três e que se encontram no conjunto dos números de 1 até 500.*/

	funcao inicio(){
		inteiro numero, contador, somatorio = 0  


		para(contador = 1 ;contador >= 1 e  contador <=500; contador ++){
			se (contador % 3 == 0 ){ 
				somatorio += contador 
			}
		}

		escreva("Valor da soma de todos os número ímpares e múltiplos de 3, do 1 ao 500: " + somatorio)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */