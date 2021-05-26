#include <stdio.h>
#include <stdlib.h>

int i=0, vetor[5];

main()

{
	do
	{
	printf("informe o numero %i ", i+1);
	scanf("%i", &vetor[i]);
	i++;
	}while(i<5);
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

