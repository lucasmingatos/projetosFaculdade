#include <stdio.h>
#include <stdlib.h>

int i=0, vetor[5];

main()
{
	while(i<=4)
	{
	printf("informe o numero %i: ", i+1);
	scanf("%i", &vetor[i]);
	i++;
	}
	
	i=0;
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

