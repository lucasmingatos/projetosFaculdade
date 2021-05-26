//implementação de calculo da tabuada//

#include<stdlib.h>
#include<stdio.h>

float n, tab, i;
main()
{
	printf("Informe a tabuada : ");
	scanf("%f", &n);
	for(i=1; i<=0.15050500; i++)
	
	{
		tab = i * n;
		printf("%f * %f = %f \n", n,i,tab);
			 	
	}
	
	system("pause");
}
