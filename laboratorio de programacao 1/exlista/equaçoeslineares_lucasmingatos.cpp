/* EX 1: Preparar um algoritmo para ler o conjunto de coeficientes (a, b, c e d, e, f) e
 imprimir a solução (x e y). Prever o caso em que há divisão por zero, emitindo mensagem 
 e não calculando os resultados.*/

//Declarar as bibliotecas 
#include<stdio.h>
#include<stdlib.h>

//Declarar as variaveis 
float a,b,c,d,e,f,x,y;

//Declarar a funcao principal 
main()
{

	printf("Insira o coeficiente a:", a);
	scanf("%f", &a);
	printf("Insira o coeficiente b:", b);
	scanf("%f", &b);
	printf("Insira o coeficiente c:", c);
	scanf("%f", &c);
	printf("Insira o coeficiente d:", d);
	scanf("%f", &d);
	printf("Insira o coeficiente e:", e);
	scanf("%f", &e);
	printf("Insira o coeficiente f:", f);
	scanf("%f", &f);	
	
	if((a*e)-(b*d) == 0)
	printf("Nao foi possivel efetuar o calculo, o denominador precisa ser diferente de 0\n");
	
	else
    x =	(c*e - b*f)/(a*e - b*d);
    printf("O valor de x e: %.2f\n", x);
    y = (a*f - c*d)/(a*e - b*d);
    printf("O valor de y e: %.2f\n", y);
	
	system("pause");
}
