/* Crie um programa em C que leia 5 números informados pelo usuário, armazene-os em um
vetor e apresente ao final a soma dos valores informados (da esquerda para a direita) e
também a subtração (da direita para a esquerda). Exemplo:

2 9 8 3 7 (valores informados)

Soma: 29    2 + 9 + 8 + 3 + 7
Subtração: -15     7 – 3 – 8 – 9 - 2  */

#include <stdio.h>
#include <stdlib.h>

int i=0, num[5], soma=0, sub=0;

main()
{
	for(i=0; i<=4; i++)
	{
		printf("\nInforme o %io numero : ", i+1);
		scanf("%i", &num[i]);
		
		soma = soma + num[i];		
	}
	
	for(i=4; i>=0; i--)
	{
		sub = num[4] - num[3] - num[2] - num[1] - num[0];
	}
	printf("\nA soma dos numeros informados e : %i ", soma);
	printf("\nA subtracao, em ordem inversa, dos numeros informados e : %i", sub);
}
