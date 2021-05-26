/* exemplo de utilização da estrutura condicional switch case. Algoritmo para registrar os pedidos de uma pizzaria*/

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

int opcao, opcaob, contador=0, qtd;
char resposta;
float total=0;

main()
{
	do
	{
	system ("cls");
	//pizzas disponiveis
	printf("*** CARDAPIO ***             *** VALOR ***");
	printf("\n1 - Mucarela                  R$25,00");
	printf("\n2 - Frango Catupiry           R$35,00");
	printf("\n3 - Portuguesa                R$40,00");
	printf("\n4 - Marguerita                R$30,00");
	printf("\n5 - Brigadeiro com morango    R$35,00");
	printf("\n Opcao: ");
	scanf("%i", &opcao);
	printf("\n Informe a quantidade da pizza escolhida: ");
	scanf("%i", &qtd);
	
	switch(opcao)
	{
	case 1 : total+=25 * qtd;
	contador+=qtd;
	break;
	case 2 : total +=35 * qtd;
	contador+=qtd;
	break;
	case 3 : total +=40 * qtd;
	contador+=qtd;
	break;
	case 4 : total+=30 * qtd;
	contador+=qtd;
	break;
	case 5 : total+=35 * qtd;
	contador+=qtd;
	break;
	default: printf("\n A pizza escolhida é inexistente ");
	system("pause"); 
	}
	printf("\n Deseja escolher outra pizza <S/N>?: ");
	resposta = getche();
	}while (resposta == 'S'|| resposta == 's');
	
	printf("\n *Escolha a regiao para entrega* ");
	printf("\n 0 para retirar no local ");
	printf("\n 1 para regiao SUL    - R$ 3,00 ");
	printf("\n 2 para regiao CENTRAL - R$ 5,00 ");
	printf("\n 3 para regiao LESTE  - R$ 7,00 ");
	printf("\nOpcao?: ");
	scanf("%i", &opcaob);
	
	switch(opcaob)
	{	
	case 1 : total += 3;
	break;
	case 2 :total += 5;
	break;
	case 3 :total += 7;
	break;
	case 4 :total +=0;
	default: printf(" \n Opcao invalida, retire sua pizza no endereco: Bairro jequit, rua jhonsons baby, 340\n ");
	system("pause");
	}

	printf("\n\n O total de pizzas solicitadas e = %i\n", contador);
	printf("\n O total do pedido e = R$ %.2f\n", total);
	system("pause");
}
