//ex 3: calcular a seq de 100 termos 

//Declarar as bibliotecas
#include<stdio.h>
#include<stdlib.h>
#include<math.h>

//Declarar as variaveis 
int i;
float termo = 1, den = 0, soma = 1;


//Declarar a funcao principal 
main()
{
	for (i=2; i<=100; i++)
	{
		den = den +2;
		termo = 1/den * pow (-1, i-1);
		soma = soma + termo;
	}
	
	printf("%f\n", soma);
	system("pause");
}

