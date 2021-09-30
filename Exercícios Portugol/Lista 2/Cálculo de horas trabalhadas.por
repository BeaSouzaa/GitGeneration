programa{
//Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
//horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
//por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
//armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
//trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
//excedente.


	funcao inicio(){
	inteiro  C
	real N, E, S, V   //N é o número de horas trabalhadas, S é o valor a mais que o funcionário irá receber, E é o número de horas após as 50h e V é o valor do pagamento

	escreva ("Qual é o código do colaborador: ")
	leia (C)

	escreva("Qual é a quamtidade de horas trabalhadas: ")
	leia(N)
	se (N > 50){
		E =(N-50)

	escreva("A quantidade em horas excedente é de " + E)
	S = (E*20)
	
	escreva("\nO salário extra é de: "+ "R$"+ S)}
	
	senao {
		E = 0
	escreva("Não excedeu as 50h trabalhadas, logo, E: " + E)
		
	}


	V = ((10*N)+(E*20))

	escreva("\nO valor total do salário é de: " + "R$" + V) 
			}
	}
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 667; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */