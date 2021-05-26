/*Determinar e imprimir o valor, em gramas, da massa do material 
apos 3 minutos do inicio do experimento*/

//Declarar as bibliotecas 
#include<stdio.h>
#include<stdlib.h>

//Declarar as variaveis 
float mi=1000, mf;
int i;

//Declarar a funcao principal 
main()
{
	for(i=1; i<=180; i++)
	{
		mf = mi - mi*0,1;
	}
	
	printf("A massa final do material, apos 3 minutos e: %.2f ", mf);
	system("pause");
}
