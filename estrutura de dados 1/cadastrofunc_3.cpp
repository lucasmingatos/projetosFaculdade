#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

struct funcionario{
		int codigo, idade;
		float salario;
		char nome[40], cidade[20], departamento[20], escolaridade[20];
} cadastro[10]; 
int i=0, m, menu, menu2, menu3, menu4, remover, t, z, consultar, p;
char resposta;

main()
{
	do
	{

		printf("\n\t*** MENU ***\n");
		printf("\n1) CADASTRAR FUNCIONARIO\n");
		printf("2) REMOVER FUNCIONARIO\n");
		printf("3) CONSULTAR TODOS\n");
		printf("4) CONSULTAR FUNCIONARIO POR CODIGO\n");
		printf("\n0) SAIR\n");
		
		printf("\nSELECIONE UMA OPCAO : ");
		scanf("%i", &menu);

		system("cls");
	
		switch(menu)
		{

			case 1:
				printf("\nInforme o nome do funcionario : ");
				fflush(stdin);
				gets(cadastro[i].nome);
					
				printf("\nInforme a idade do funcionario : ");
				scanf("%i", &cadastro[i].idade);
				
				printf("\nInforme a cidade do funcionario : ");
				fflush(stdin);
				gets(cadastro[i].cidade);
			
				printf("\nInforme a escolaridade do funcionario : ");
				fflush(stdin);
				gets(cadastro[i].escolaridade);
				
				printf("\nInforme o departamento do funcionario : ");
				fflush(stdin);
				gets(cadastro[i].departamento);
			
				printf("\nInforme o codigo do funcionario : ");
				scanf("%i", &cadastro[i].codigo);
		
				printf("\nInforme o salario do funcionario : ");
				scanf("%f", &cadastro[i].salario);
				i++;
				system("cls");
				
	}while(resposta=='S'||'s');
			
	//_________________________________________________________________________________________________
	do
	{	
		switch(menu2)
		{	
			case 1: 
				printf("Digite o codigo do funcionario a ser removido : ");
				scanf("%d", &remover);
				for(t=0; t<i; t++)
				if(remover == cadastro[t].codigo)
				{
					cadastro[t].codigo = NULL;
				
					for(z=t; z<i; z++)
					{
						cadastro[z]=cadastro[z+1];
						break;
					}
				}
		}
	}while(resposta=='S'||'s');
	//_________________________________________________________________________________________________
	do
	{
		switch(menu3)
		{
			case 3:
				printf("\nConsultar todos os cadastros \n");
				for(m=0; m<i; m++)
				{
					printf("nome: %s\n", cadastro[m].nome);
					printf("idade: %i\n", cadastro[m].idade);
					printf("cidade: %s\n", cadastro[m].cidade);
					printf("departamento: %s\n", cadastro[m].departamento);
					printf("codigo: %i\n", cadastro[m].codigo);
					printf("salario: %.2f\n", cadastro[m].salario);
					printf("\n");
					
				}
				break;
		}
	}while(resposta=='S'||'s');
	//_________________________________________________________________________________________________
	do
	{
		switch(menu4)
		{
			case 4:
				printf("Informe o codigo para consultar o cadastro do funcionario : ");
				scanf("%d", &consultar);
				for(p=0; p<i; p++)
				{
					if(consultar == cadastro[p].codigo)
					{
						printf("nome: %s\n", cadastro[m].nome);
						printf("idade: %i\n", cadastro[m].idade);
						printf("cidade: %s\n", cadastro[m].cidade);
						printf("departamento: %s\n", cadastro[m].departamento);
						printf("salario: %.2f\n", cadastro[m].salario);
						printf("\n");
						break;
					}
				}
			default: printf("\n opcao invalida ");		
		}
	}while(resposta=='S'||'s');
	}while(resposta=='S'||'s');

}
