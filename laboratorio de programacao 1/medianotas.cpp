/*Escreva um programa que leia 3 notas de um aluno e a			
média das notas dos exercícios realizados por ele. Calcular a média de aproveitamento,
usando a fórmula: MA = (N1 + N2*2 + N3*3 + ME)/7. A partir da média, informar o 
conceito de acordo com a tabela: */

#include <stdio.h>
#include <stdlib.h>

float mediafinal, nota1, nota2, nota3, medex;

main()
{
	printf("insira a nota 1: ");
	scanf("%f", &nota1);
	
	printf("insira a nota 2: ");
	scanf("%f", &nota2);
	
	printf("insira a nota 3: ");
	scanf("%f", &nota3);
	
	printf("insira a media dos exercicios: ");
	scanf("%f", &medex);
		{ 
			mediafinal = (nota1 + nota2*2 + nota3*3 + medex)/7;
			
			if (mediafinal < 4)
			printf("\nSua media final e E xD\n");
			
			else if (mediafinal>=4 && mediafinal < 6)
			printf("\nSua media final e D xD\n");
			
			else if (mediafinal >= 6 && mediafinal < 7.5)
			printf ("\nSua media final e C xD\n");
			
			else if (mediafinal >= 7.5 && mediafinal < 9)
			printf("\nSua media final e B xD\n");	
			
			else
			printf("\nSua media final e A xD\n");	
		}
		system("pause");
}
