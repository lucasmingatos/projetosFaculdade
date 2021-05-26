/*IMPLEMENTAR UM ALGORITMO PARA RECEBER UMA LISTA DE COMPRAS COM 5 PRODUTOS, 
NESTA LISTA HÁ O VALOR DO PRODUTO E A QUANTIDADE. CALCULAR O VALOR TOTAL E RECEBER
O VALOR QUE O CLIENTE PAGOU. MOSTRAR O VALOR TOTAL, O VALOR QUE O CLIENTE 
PAGOU E VALOR DO TROCO */

#include <stdio.h>
#include <stdlib.h>

float valor, total=0, pago, troco;
int qntd, i;

main()

{
	for(i=1; i<=5; i++)
	{
		printf("\ninforme o valor do produto %i: ", i);
		scanf("%f", &valor);
		printf("informe a quantidade %i: ", i);
		scanf("%i", &qntd);
			total = total + qntd + valor;
	}
	printf("\nO valor da compra e %.2f ", total);
	
	printf("o valor pago foi :");
	scanf("%f", pago);
	
	troco = pago - total;
	printf("\nO troco e %.2f");	
	
	system("pause");
}
