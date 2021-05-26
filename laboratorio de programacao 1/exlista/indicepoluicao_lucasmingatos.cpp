//EX 4: Algoritmo para ler os indices de poluicao e indicar as notacoes apropriadas

//Declarar as bibliotecas
#include<stdio.h>
#include<stdlib.h>

//Declarar as variaveis 
float ip;

//Declarar a funcao principal 
main()
{
	printf("Indique o indice de poluicao:");
	scanf("%f", &ip);
	
	if(ip<=0.25)
	printf("O indice de poluicao esta aceitavel, todas as industrias continuam funcionando\n");
	
	else if(ip<=0.30)   
	printf("O indice de poluicao esta ruim, industrias da lista A devem suspender suas operacoes\n");
	
	else if(ip<=0.40)   
	printf("O indice de poluicao esta pessimo, industrias da lista A e B devem suspender suas operacoes\n");
	
	else 
	printf("O indice de poluicao esta critico, industrias da lista A, B e C devem suspender suas operacoes\n");
	
	system("pause");
}

