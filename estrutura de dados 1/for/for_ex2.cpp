/*Crie um programa em C, declarando um vetor de 5 posições para números inteiros. E
inicializando esse vetor com os seguintes valores: 7, 3, 8, 1, 6. Imprimir cada um desses
valores na ordem em que são declarados, e também na ordem contrária, ou seja:
7 3 8 1 6
6 1 8 3 7*/ 

#include <stdio.h>
#include <stdlib.h>

int i=0, numero[5]={7, 3, 8, 1, 6};

main()
{
	printf("a ordem dos numeros informados e: ");
	for(i=0; i<=4; i++)
	{
	printf("%i ", numero[i]);
	}
	printf("\na ordem contraria dos numeros informados e: ");
	for(i=4; i>=0; i--)
	{
	printf("%i ", numero[i]);
	}
	system("pause");

}
