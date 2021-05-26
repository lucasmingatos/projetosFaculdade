/*Elaborar um algoritmo que leia o limite dirio (em kg)e,
entao leia os valores de entrada por um (os pesos dos peixes 
à medida que sao apanhados), e imprima uma mensagem no ponto
quando esse limite é excedido. Um peso de zero indica o fim 
de entrada. Após o registro de cada peixe, o algoritmo deve 
imprimir o peso total de peixes obtido ate aquele ponto, a
quantidade e a media do peso dos peixes pescados.*/

//Declarar as biblitecas 
#include<stdio.h>
#include<stdlib.h>

//Declarar as variaveis 
float limite, peso=1, media, somapeso=0;
int peixe;

//Declarar a funcao principal 
main()
{
	printf("Indique o limite diario, em kg:");
	scanf("%f", &limite);
	
	while(somapeso<limite && peso>0)
	{
		printf("\nIndique o peso, em kg, do peixe:");
		scanf("%f", &peso);
		
		if(peso == 0){
		peixe=peixe;
		printf("\nTotal de peixes: %.2i", peixe);
		printf("\nPeso total: %.2f", somapeso);
		printf("\nMedia do peso: %.2f\n\n", media);
		}
		
		else{
		somapeso+=peso;
		peixe++;
		media=somapeso/peixe;
		printf("\nTotal de peixes: %.2i", peixe);
		printf("\nPeso total: %.2f", somapeso);
		printf("\nMedia do peso: %.2f\n", media);
		}
	}
	 
	 if(somapeso>=limite)
	 printf("\nLimite diario atingido\n");
	 
	 else
	 printf("\tValor invalido para o peso do peixe\n\n");
	 system("pause");
		
}
