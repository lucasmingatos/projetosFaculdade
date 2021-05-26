/*Implementar um programa para receber dados de clientes que podem ser pessoa fisica ou juridica.
Quando for pessoa física deve-se armazenar o CPF, o nome, o RG e a data de nascimento , se pessoa jurídica,
deve-se registrar o CNPJ, o nome, a IE e o e-mail.
O CPF tem 11 caracteres e o CNPJ tem 14 caracteres. O programa deverá ter telas para entrada de dados considerando o tipo de cliente. */

#include <stdlib.h>
#include <stdio.h>
#include <conio.h>
#include <string.h>

char documento[14], email[40], ie[15], data[10], nome[100], rg[12];

main()
{
	printf("\nCPF/CNPJ: ");
	fflush(stdin);
	gets(documento);
	
	if(strlen(documento)==11)
	{
		printf("\nCadastro de pessoa fisica!! ");
		printf("\nInforme seu nome: ");
		fflush(stdin);
		gets(nome);
		printf("\nInforme a data de nascimento:");
		fflush(stdin);
		gets(data);
		printf("\nInforme seu RG: ");
		fflush(stdin);
		gets(rg);
		printf("\n%s", nome);
		printf("\n%s", data);
		printf("\n%s", rg);
		printf("\nCadastro concluido ");
		
	}
	else if(strlen(documento)==14)
	{
		printf("\nCadastro de pessoa jurica !!");
		printf("\nInforme seu nome: ");
		fflush(stdin);
		gets(nome);
		printf("\nInforme seu IE: ");
		fflush(stdin);
		gets(ie);
		printf("\nInforme seu e-mail: ");
		fflush(stdin);
		gets(email);
		printf("\n%s", nome);
		printf("\n%s", ie);
		printf("\n%s", email);
		printf("\nCadastro concluido");
	}
	else
	{
	printf("Informacoes incorretas !");
	}
}
