#include <stdio.h>
#include <conio.h>
#include <stdlib.h>

main(){
	int chuva[86], grupo[86], i;
	
	for (i = 0; i < 86; i++){
		printf ("Informe o volume de chuva na estacao %d: ", i+1);
		scanf ("%d", &chuva[i]);
		grupo[i] = chuva[i]/10+1;
	}
	system ("cls");
	for (i = 0; i < 86; i++){
		printf ("Estacao %d\n\n\t", i+1);
		printf ("Intervalo de chuva: %d\n\t", chuva[i]);
		printf ("Grupo qualificado: %d\n\n", grupo[i]);
		getch();
		system ("cls");
	}
}
