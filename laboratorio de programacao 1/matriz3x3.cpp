//operação com 2 matrizes 3x3

#include <stdio.h>
#include <stdlib.h>

int a[3][3], b[3][3], soma[3][3], l, c;

main() 

{
	for(l=0; l<3; l++)
	{
		for(c=0; c<3; c++)
		{
			printf("Informe o valor A(%i, %i): ",l+1, c+1);
			scanf("%i", &a[l][c]);
		}
	}
	printf("\n");
	for(l=0; l<3; l++)
	{
		for(c=0; c<3; c++)
		{
			printf("Informe o valor B(%i, %i): ",l+1, c+1);
			scanf("%i", &b[l][c]);
		}
	
	}
	for(l=0; l<3; l++)
	{
		for(c=0; c<3; c++)
			soma[l][c] = a [l][c]+b[l][c];
	}
	for(l=0; l<3; l++)
	{
		for(c=0; c<3; c++)
			printf("%2.i ", soma[l][c]);
			
			printf("\n\n");
	}
	system("pause");
}
