programa
{
	funcao inicio()
	{
		inteiro numeros[4] = {1, 2, 3, 4}
		inteiro tamanho = 4

		escreva("Entrada: [1, 2, 3, 4]\n")
		escreva("Soma dos quadrados: ", soma_quadrados(numeros, tamanho, 0), "\n")
	}

	funcao inteiro soma_quadrados(inteiro lista[], inteiro tamanho, inteiro indice)
	{
		se (indice >= tamanho)
		{
			retorne 0
		}

		retorne quadrado(lista[indice]) + soma_quadrados(lista, tamanho, indice + 1)
	}

	funcao inteiro quadrado(inteiro n)
	{
		retorne n * n
	}
}
