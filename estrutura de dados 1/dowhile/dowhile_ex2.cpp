/*Crie um programa em C, declarando um vetor de 5 posi��es para n�meros inteiros. E
inicializando esse vetor com os seguintes valores: 7, 3, 8, 1, 6. Imprimir cada um desses
valores na ordem em que s�o declarados, e tamb�m na ordem contr�ria, ou seja:
7 3 8 1 6
6 1 8 3 7*/ 

#include <stdio.h>
#include <stdlib.h>

int i=0, vetor[5]={7, 3, 8, 1, 6};

main()
{
	printf("A ordem dos numeros informados e: ");
	i=0;
	do
	{
	printf("%i ", vetor[i]);
	i++;
	} while(i<5);
	printf("\nA ordem inversa dos numeros informados e: ");
	i=4;
	do
	{
	printf("%i ", vetor[i]);
	i--;
	} while(i>=0); 
	system("pause");
}
