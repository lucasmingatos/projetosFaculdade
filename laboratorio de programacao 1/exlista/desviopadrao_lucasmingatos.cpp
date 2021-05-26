//Exercicio 1: Algoritmo para calcular o desvio padrão de cinco números (amostral).

//Declarar as bibliotecas 
#include <math.h>
#include <stdio.h>
#include <stdlib.h> 

//Declarar as variaveis 
float numero1, numero2, numero3, numero4, numero5, media, desviopadrao, variancia; 

//Declarar a funcao principal
main()
 {
	printf("Digite o primeiro numero\n");
    scanf("%f", &numero1);
	printf("Digite o segundo numero\n");
    scanf("%f", &numero2);
	printf("Digite o terceiro numero\n");
  	scanf("%f", &numero3);
  	printf("Digite o quarto numero\n");
  	scanf("%f", &numero4);
  	printf("Digite o quinto numero\n");
  	scanf("%f", &numero5);

    media = (numero1 + numero2 + numero3 + numero4 + numero5)/5;

  	variancia =  pow((numero1 - media), 2);
  	variancia +=  pow((numero2 - media), 2);
  	variancia +=  pow((numero3 - media), 2);
  	variancia +=  pow((numero4 - media), 2);
  	variancia +=  pow((numero5 - media), 2);
  	variancia /= 4;

  	desviopadrao = sqrt(variancia);

  printf("\nDesvio padrao:%.2f\n", desviopadrao);
  system("pause");
 }


