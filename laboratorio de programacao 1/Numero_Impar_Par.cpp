/*Numeros inteiros positivos,
impar ou par*/

//Declarar as bibliotecas 
#include<stdio.h>
#include<stdlib.h>

//Declarar as variaveis 
int numero, par, impar, i;
float somapar, somaimpar, qtdpr, qtdi, mi, mp;

//Declarar a funcao principal
main()
{
	for(i=1; i<=10; i++)
	{
		printf("Indique o numero %i:", i);
		scanf("%i", &numero);
		
		if(numero==0 || numero<0)
		printf("Voce nao digitou um numero par/impar\n");
		
		else{
			(numero%2==0)
			par++;
			somapar+=numero;
			qtdpr++;
		
		else 
			impar++;
			somaimpar+=numero;
			qtdi++;
	}
	{
	
		printf("Sao pares: %i\n", par);
		printf("Sao impares: %i\n", impar);
		
		mp = somapar/qtdpr;
		printf("A media dos numeros pares e: %.2f", mp);
		
		mi = somaimpar/qtdi;
		printf("A media dos numeros impares e: %.2f", mi);
		
		system("pause");
}
	
}
