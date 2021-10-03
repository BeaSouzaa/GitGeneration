programa{
/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.*/


//laço de repetição tem como se fosse uma estrutura "SE" para repetir o que é desejado
	funcao inicio(){
		inteiro ctdr, qtdF , mF = 0, atecem = 0, totalFilhos = 0
		real salario, totalSalario = 0.0, mS = 0.0, maiorsalario = 0.0 

		para(ctdr = 1; ctdr < 20; ctdr ++){  

			escreva(ctdr + "ª pessoa\n\n")
			
			escreva("\nDigite seu salário: ")
			leia (salario)

			escreva("\nQuantos filhos: ")
			leia(qtdF)


			se (salario > maiorsalario){
				maiorsalario = salario}
				
			se(salario <= 100) {
				atecem += 1   }
				
			totalFilhos += qtdF
			totalSalario += salario
	}
	
	mS = totalSalario / 20
	
	mF = totalFilhos / 20 
	


	escreva("\n********** RELATÓRIO **********")
	escreva("\nMédia de Salário........................R$ " + mS)
	escreva("\nMédia de filhos............................" + mF)
	escreva("\nMaior Salário...........................R$ " + maiorsalario)
	escreva("\nPercentual com salário até R$100,00: " + atecem*100 +"%")
                   }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 943; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */