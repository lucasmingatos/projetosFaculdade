/* Implementar um algoritmo para receber usuário e senha e retornar que eles foram informados corretamente ou não */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <conio.h>

char usuario[10], senha[10], tentativa;

main()
{	
	do
	{
		printf("\n\nInforme o nome do usuario: ");
		fflush(stdin); // Limpar o buffer de entrada de dados
		gets(usuario); // entrada de dados de string
		printf("\nInforme a senha do usuario: ");
		fflush(stdin);
		gets(senha);
	
	//validar o usuário e a senha
		if(strcmp(usuario, "827213")==0 && strcmp(senha, "12345678")==0)
		{
			printf("\n\tUsuario e senha informados com sucesso...\n");
			tentativa = 'N';
		}
		else
		{
			printf("\n\tUsuario e senha incorretos !\n");
			printf("\n\tTentar novamente <S/N> ");
			tentativa = getche();
		}
	} while(tentativa == 's' || tentativa == 'S');		
	system("pause");
}
