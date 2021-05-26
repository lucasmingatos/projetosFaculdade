/* entregar ate dia 28/09/17 - 12:00. valendo 0.5 pontos
elaborar um algoritmo para receber ''até'' 10 numeros inteiros 
e mostrar o valor mediano 

Lucas sant'ana mingatos - 826274 */ 

#include <stdio.h>
#include <stdlib.h>

int main(){

   float mediana, aux, vetor[10];
   int l, m, inteiros;

   printf("-- Calculo da Mediana --\n");
   do{
        printf("Informe a mediana de quantos numeros inteiros deseja verificar (max 10) : ");
        scanf("%i",&inteiros);
    } while(inteiros > 10);
    
    for(l=0; l<inteiros ;l++){
        printf("\nInforme o valor %d: ", l+1);
        scanf("%f", &vetor[l]);
    }

    for(l=0 ; l<inteiros; l++)
	{
        for(m=0; m<inteiros; m++)
		{
            if(vetor[l] < vetor[m])
			{
                aux = vetor[l];
                vetor[l] = vetor[m];
                vetor[m] = aux;
            }
        }
    }
    
    if(inteiros%2)
	{
        mediana = vetor[inteiros/2];
    } else
	{
        mediana = (vetor[inteiros/2-1]+vetor[inteiros/2])/2;
    }

    printf("\nO valor da mediana e: %2.2f\n", mediana);
    system("pause");
    return(0);
}
