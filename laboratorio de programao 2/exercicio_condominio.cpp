/*

Exercicio - Entregar até 22/11/2017 - até 1 ponto
Elaborar um programa utilizando a linguagem C para gerenciar o pagamento das taxas de condominio de um condominio residencial.
Os dados  armazenados de cada pagamento são: numero do apartamento, competencia (mês/ano), data de pagamento (99/99/9999) e o valor do pagamento.
O programa deverá possuir:
1- Menu para gerenciar as funçoes do programa
2- Função para cadastrar os pagamentos
3- Função para listar todos os pagamentos
4- Função para listar os pagamentos por competencia(o usuario informa qual competencia especifica deseja consultar), totalizando o valor recebido
5- sair */

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <ctype.h>
#include <string.h>

struct
{
	int apt;
	char data[10];
	char competencia[10]; 
	float valor;
}cadastro;

FILE *ponteiroarq;

void menu(void);
void cadastrar(void);
void listar1(void);
void listar2(void);


main()
{
	menu();
	
}
void menu()
{
	int opcao;
	printf("----MENU----\n1- Cadastrar pagamento \n2- Listar todos \n3- Listar por competencia \n4- Sair \n Escolha uma das opcoes: ");
	scanf("%i", &opcao);

switch(opcao)
	{
		case 1 : cadastrar();
		menu();
		case 2 : listar1();
		menu();
		case 3 : listar2();
		menu();
		case 4 : exit(0);
		default :
			{
				printf("\nopcao invalida...");
				system("pause");
			}
	}
	menu();
}

void cadastrar(void)
{
	char controle;
	ponteiroarq = fopen("condominio.txt","a");
	do
	{
		system("cls");
		printf("Informe o numero do apartamento: ");
		scanf("%i",&cadastro.apt);
		fflush(stdin);
		printf("\nInforme a competencia (MM/AA): ");
		fflush(stdin);
		gets(cadastro.competencia);
		printf("\nIforme a data do pagamento (DD/MM/AA): ");
		fflush(stdin);
		gets(cadastro.data);
		printf("\nInforme o valor do pagamento: ");
		scanf("%f", &cadastro.valor);
		
		fwrite(&cadastro, sizeof(cadastro), 1, ponteiroarq);
		
		printf("\ntecle enter para retornar ao menu principal\n");
		system("pause");
		system("cls");
		
	}while(toupper(controle)=='S');
	
	fclose(ponteiroarq);
}

void listar1(void)
{
	if((ponteiroarq=fopen("condominio.txt", "r"))==NULL)
	{
		printf("\nErro na abertura do arquivo...");
		system("pause");
		menu();
	}
	while(fread(&cadastro, sizeof(cadastro),1,ponteiroarq)==1)
	{
		printf("\nNumero do apartamento: %i ",cadastro.apt);
	    printf("\nData: %s", cadastro.data);
	    printf("\nCompetencia: %s", cadastro.competencia);
		printf("\nvalor: %.2f", cadastro.valor);	
		printf("\n ");
	}
	system("pause");
	system("cls");
}
void listar2(void)
{
	float total;
	char consultar[10];
	if((ponteiroarq=fopen("condominio.txt", "r"))==NULL)
	{
		printf("\nErro na abertura do arquivo...");
		system("pause");
		menu();
	}
	printf("\nInsira a competencia que deseja verificar : ");
		fflush(stdin);
		gets(consultar);
	while(fread(&cadastro, sizeof(cadastro),1,ponteiroarq)==1)
	{
		if(strcmp(consultar,cadastro.competencia)==0)
		{
		printf("\nNumero do apartamento: %i ",cadastro.apt);
	    printf("\nData: %s", cadastro.data);
	    printf("\nCompetencia: %s", cadastro.competencia);
		printf("\nvalor: %.2f", cadastro.valor);	
		printf("\n ");
		total+=cadastro.valor;
		
		}else
		{
			printf("Competencia nao encontrada no arquivo.\n");
			system("pause");
			system("cls");
			menu();
		}
	}
	printf("Valor total: %2.f\n",total);
	system("pause");
	system("cls");
}

