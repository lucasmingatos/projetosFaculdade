/* Crie um programa em C, com base no exercício anterior e, ao invés de inicializar o vetor,
solicitar ao usuário para informar os 5 números desejados. Imprimir cada um desses valores
na ordem em que são declarados, e também na ordem contrária.
7 3 8 1 6
6 1 8 3 7 */


#include <stdlib.h>
#include <stdio.h>

int i=0, numero[5];

main()
{
	for(i=0; i<=4; i++)
	{
	printf("informe o numero %i: ", i+1);
	scanf("%i", &numero[i]);
	}
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

