programa{
//Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
//categorias:
//Infantil A = 5 a 7 anos
//Infantil B = 8 a 11 anos
//Juvenil A = 12 a 13 anos
//Juvenil B = 14 a 17 anos
//Adultos = Maiores de 18 anos
	
	funcao inicio(){
	inteiro in //n in é idade do nadador

	escreva("Qual a idade do nadador: ")
	leia(in)

	se (in >= 5 e in <= 7){
	escreva ("Infantil A")}

	se(in >= 8 e in <= 11){
	escreva ("Infantil B")}

	se(in >= 12 e in <=13){
	escreva("Juvenil A")}

	se(in >= 14 e in<=17){
	escreva ("Juvenol B")}
	
	se(in >= 18 e in <= 90){
	escreva ("Adulto")	}

	se(in <= 5 ou in >= 90){
	escreva ("Não trabalhamos com essa faixa etária")	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 691; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */