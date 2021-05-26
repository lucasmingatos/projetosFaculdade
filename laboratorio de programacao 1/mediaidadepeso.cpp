#include<stdio.h>
#include<stdlib.h>

int idade, sexo;
float peso, mediaf, mediam, f=0, m=0, somaidadem=0, somaidadef=0, somapeso, mediapeso;

main()
{
	do
	{
		printf("informe o sexo (F=0 / M=1): ");
		scanf("%i", &sexo);
		printf("informe o peso            : ");
		scanf("%f", &peso);
		somapeso+=peso;
		printf("informe a idade           : ");
		scanf("%i", &idade);
		
		if(sexo==0 && idade!=0)
		{
			f++;
			somaidadef=idade+somaidadef;
		}
		if(sexo==1 && idade!=0)
		{
			m++;
			somaidadem=idade+somaidadem;
		}
		if(idade==0)
		
		printf("\nestatistica cancelada");
		
		printf("\n\n");
	
	}while(idade!=0);
	
	mediaf= somaidadef/f;
	printf("\n A media de idade feminina e :%2.0f ", mediaf);
	mediam= somaidadem/m;
	printf("\n A media de idade masculina e:%2.0f ", mediam);
	mediapeso =somapeso/(f+m);
	printf("\n A media de peso e           :%2.0f \n", mediapeso);
	
	system("pause");
}
