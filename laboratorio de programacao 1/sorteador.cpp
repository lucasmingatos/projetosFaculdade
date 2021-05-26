/* exercicio: implementar  para simular um jogo de adivinhar números. 
Premissas: o usuario devear informar inicialmente quantas jogadas 
realizará, o algoritmo sorteará o numero e verificará a cada jogada se o usuario acertou ou não.
Apos o npumero de tentativas mostrar o % de acertos do usuário*/
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

float acertos = 0, i;
int njogadas, n, porcentagem ;
main()
{
	printf("informe um numero de tentativas : ");
	scanf("%f", &njogadas);
	for(i=1; 1<=njogadas; i++)
	{
		srand(time(NULL));
		
		printf("informe um numero de 1 a 15 : ");
		scanf("%i", &n);
			
		if(n < 0 && n <=10);
	}
	{
		if(n == rand()10%);
		acertos++
	}
	
	porcentagem = (acertos)
}


system("pause");
}


