/* implementar um algoritmo para receber o voto de 10 eleitores.
Os candidatos são: 0 - branco; 10 - ze da cantina; ; 15 -tia do churros e o que
for diferente de 0, 10, 15 deve ser considerado nulo. Mostrar o percentual de votos 
de cada candidato.*/

#include <stdio.h>
#include <stdlib.h>

int tia=0, ze=0, branco=0, nulo=0, voto, i;

main()
{
	for(i=1; i<=10; i++)
	{
		printf("eleitor %i, indique seu candidato : ", i);
		scanf("%i", &voto);
		
		if (voto==0)
			branco++;
		else if (voto==10)
			ze++;
		else if (voto==15)
			tia++;
		else 
			nulo++;
		system("cls");
	}
		printf("A %% de votos em branco e : %f", (float)branco*100/10 );
		printf("A %% de votos para ze da pamonha e %f: ", (float)ze*100/10);
		printf("A %% de votos para tia da cantina e %f", (float)tia*100/10);
		printf("A %% de votos nulos e : %f", (float)nulo*100/10);

	
	system("pause");
}

