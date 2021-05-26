#include <stdio.h>
#include<stdlib.h>
#include <conio.h>

float altura,n=0,soma=0,media;
char continua='s';

main()

{
	while(continua=='s'|| continua=='S')
{
	n++; 
	printf("informe a altura do aluno %.0f:",n);
	scanf("%f",&altura);
	soma=soma+altura;
	printf("deseja informar mais alguma? (s/n)");
	continua = getche();
	system("cls");
	
	
}

media = soma/n;
printf("a media de altura e: %.2f", media);

system("pause");
}
