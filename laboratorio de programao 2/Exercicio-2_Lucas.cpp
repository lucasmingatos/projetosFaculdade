#include <stdio.h>
#include <stdlib.h>
#include <math.h>

main(){
	int i;
	float valor[5], soma=0, media=0, variancia;
	
	printf ("Informe 5 valores para o somatorio:\n");
	
	for (i = 0; i <= 4; i++){
		printf ("\nInforme o valor %d: ", i+1);
		scanf ("%f", &valor[i]);
		media+=valor[i];
	}
	system ("cls");
	
	media = media / i;
	
	for (i = 0; i <= 4; i++)
		soma+=valor[i]*valor[i];
	
	variancia = soma - media*media*i;
	
	variancia = variancia / (i - 1);
	
	variancia = sqrt(variancia);
	
	printf ("A variancia dos 5 valores e: %f\n\n", variancia);
	
	system ("pause");
}
