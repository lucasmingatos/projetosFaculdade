#include <stdio.h>
#include <stdlib.h>

int i=0, num[5], soma, sub=0;

main()
{
	do
	{
	printf("\nInforme o %io numero : ", i+1);
	scanf("%i", &num[i]);
	i++;
	}while(i<5);
	
	i=4;
	do
	{
	soma = soma + num[i];
	printf("a soma dos numeros e : %i");
	i++;
	}while(i<0);


	printf("\nA subtracao, em ordem inversa, dos numeros informados e : %i", sub);
	
	i=4;	
	do
	{
	sub = num[4] - num[3] - num[2] - num[1] - num[0];
	i--;
	}while(i>=0);
	
	
}
