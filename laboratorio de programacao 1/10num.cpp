//Faca um programa que pec¸a ao usuario para digitar 10 valores e some-os.//

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int soma, n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;

main()
{
	
	printf("\ninforme o 1o numero ");
	scanf("%i", &n1);
	
	printf("\ninforme o 2o numero ");
	scanf("%i", &n2);
	
	printf("\ninforme o 3o numero ");
	scanf("%i", &n3);
	
	printf("\ninforme o 4o numero ");
	scanf("%i", &n4);
	
	printf("\ninforme o 5o numero ");
	scanf("%i", &n5);
	
	printf("\ninforme o 6o numero ");
	scanf("%i", &n6);
	
	printf("\ninforme o 7o numero ");
	scanf("%i", &n7);
	
	printf("\ninforme o 8o numero ");
	scanf("%i", &n8);
	
	printf("\ninforme o 9o numero ");
	scanf("%i", &n9);

	printf("\ninforme o 10o numero ");
	scanf("%i", &n10);
	
	soma=n1+n2+n3+n4+n5+n6+n7+n8+n9+n10;
	printf("A soma dos numeros e %i ", soma);
	
	
	system("pause");
}
