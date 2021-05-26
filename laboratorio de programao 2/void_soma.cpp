#include <stdio.h>
#include <stdlib.h>

int mult (int y, int x)
{
	int k;

	printf("Insira x ");
	scanf("%i", &x);
	
	printf("Insira y ");
	scanf("%i", &y);

	k = y * x;
	
	printf("a multiplicacao dos numeros e : %i ", k);
	
}

int main ()
{
	soma (x, y);
	system("pause");
}
