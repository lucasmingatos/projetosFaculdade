//manipulaçao de texto 

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

char nome[15], sobrenome[15];

main()
{
	printf("Informe o nome: ");
	gets(nome); //scanf("%s", &nome[0])
	printf("Informe o sobrenome: ");
	scanf("%s", &sobrenome[0]);
		
	printf("%s, %s\n\n", sobrenome, nome);
	system("pause");	

}
