#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <ctype.h>

main(){
	char resposta='S';
	float vendas_mes[12], vendas, soma_total;
	int i, mes;
	
	for (i = 0; i < 12; i++)
		vendas_mes[i]=0;
	
	while (resposta!='N'){
		mes=0;
		
		while (mes<1 || mes>12){
			printf ("Informe o numero do mes a adicionar o valor: ");
			scanf ("%d", &mes);
			system ("cls");
		}
		
		printf ("Informe o valor da venda do mes: ");
		scanf ("%f", &vendas);
		
		system("cls");
		
		vendas_mes[mes-1]+=vendas;
		soma_total+=vendas;
		
		resposta='s';
		
		while (resposta !='S' && resposta!='N'){
			printf ("Deseja continuar a adicionar as vendas? Digite s para sim e n para nao: ");
			resposta=toupper(getch());
		}
		system ("cls");
	}
	for (i = 0; i < 12; i++)
		if (vendas_mes[i]!=0){
			printf ("Mes %d:\n\nVendas: R$ %.2f", i+1, vendas_mes[i]);
			getche();
			system ("cls");
		}
	printf ("Total de vendas do ano: R$ %.2f", soma_total);
	getche();
}
