/* Implementar um programa para receber o salário e o nome do colaborador (5 colaboradores) e mostrar o nome do
colaborador que possui o maior salário */

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

char nome[30], nomemaior[30];
int i, salario=0, maior=0;

main()
{
	for(i=0; i<5; i++)
	{
		printf("Informe o nome do colaborador %i: ", i+1);
		fflush(stdin);
		gets(nome);
		printf("Infome o salario do colaborador %i: ", i+1);
		scanf("%i", & salario);
		if(salario>=maior)
		{
			maior=salario;
			strcpy(nomemaior, nome);	
		}
	}
	printf("\nNome do colaborador com maior salario e%s: ", nomemaior);
	printf("\nO Maior salario e: %.2i", maior);
	
}
