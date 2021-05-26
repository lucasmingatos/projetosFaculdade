/*Crie um programa em C, declarando um vetor de 5 posições para números inteiros. E
inicializando esse vetor com os seguintes valores: 7, 3, 8, 1, 6. Imprimir cada um desses
valores na ordem em que são declarados, e também na ordem contrária, ou seja:
7 3 8 1 6
6 1 8 3 7*/ 

#include <stdio.h>
#include <stdlib.h>

int i=0, vetor[5]={7, 3, 8, 1, 6};

main()
{
	printf("A ordem dos numeros informados e: ");
	while(i<=4)
	{
	printf("%i ", vetor[i]);
	i++;
	}
	
	i=4;
	printf("\nA ordem inversa dos numeros informados e: ");
	while(i>=0)
	{
	printf("%i ", vetor[i]);
	i--;
	}
	system("pause");
}

