#include<stdlib.h>
#include<stdio.h>
#include<ctype.h>
#include<conio.h>
struct timesf{
	char nometime[20], arti[20];
	int vit,der,emp,gp, gc, golsarti;
}timef[6];

struct timesb{
	char nomeequipe[20],arremessador[20];
	int vit,der,rebote,pbola,cestas3;
}timeb[4];   

char resp='s',voltar;
int i=0,opcao=0,z=0,x=0,w=0;

main()
{
	do
	{
		printf("\t----MENU----");
		printf("\n1 - Registrar Equipe Futebol");
		printf("\n2 - Registrar Equipe Basquete");
		printf("\n3 - Mostrar Equipes Futebol");
		printf("\n4 - Mostrar Equipes Basquete");
		printf("\nSelecione um numero(1 a 4): ");
		scanf("%i", &opcao);
		system("cls");
		
	if(opcao==1)
	{
		printf("\nInforme nome da equipe: ");
		fflush(stdin);
		gets(timef[i].nometime);
		printf("\nInforme numero de vitorias: ");
		scanf("%i",&timef[i].vit);
		printf("\nInforme numero de derrotas: ");
		scanf("%i", &timef[i].der);
		printf("\nInforme numero de empates: ");
		scanf("%i", &timef[i].emp);
		printf("\nInforme numero de gols a favor: ");
		scanf("%i", &timef[i].gp);
		printf("\nInforme numero de gols sofridos: ");
		scanf("%i", &timef[i].gc);
		printf("\nInforme nome do Artilheiro: ");
		fflush(stdin);
		gets(timef[i].arti);
		printf("\nInforme numero de gols do artilheiro: ");
		scanf("%i", &timef[i].golsarti);
		printf("TIME REGISTRADO COM SUCESSO,APERTE QUALQUER BOTAO PARA VOLTAR AO MENU INICIAL\n");
		fflush(stdin);
		voltar = getche();
		system("cls");
		i++;
	}
	else if(opcao==2)
	{
		printf("\nInforme nome da equipe: ");
		fflush(stdin);
		gets(timeb[i].nomeequipe);
		printf("\nInforme numero de vitorias: ");
		scanf("%i",&timeb[i].vit);
		printf("\nInforme numero de derrotas: ");
		scanf("%i", &timeb[i].der);
		printf("\nInforme numero de perdas de bola: ");
		scanf("%i", &timeb[i].pbola);
		printf("\nInforme numero de rebotes: ");
		scanf("%i", &timeb[i].rebote);
		printf("\nInforme nome do maior pontuador de cestas de 3: ");
		fflush(stdin);
		gets(timeb[i].arremessador);
		printf("\nInforme numero de arremessos acertados pelo maior pontuador de 3:  ");
		scanf("%i", &timeb[i].cestas3);
		w++;	
		printf("TIME REGISTRADO COM SUCESSO,APERTE QUALQUER BOTAO PARA VOLTAR AO MENU INICIAL\n");
		fflush(stdin);
		voltar = getche();
		system("cls");
		
	}
	else if(opcao==3)
	{
		for(z=0;z<i;z++)
		{
		
			printf("nome da equipe: %s\n",timef[z].nometime);
			printf("Artilheiro: %s\n", timef[z].arti);
			printf("Gols marcados pelo artilheiro: %i\n", timef[z].golsarti);
			printf("\n");
		}
			printf("APERTE QUALQUER BOTAO PARA VOLTAR AO MENU INICIAL\n");
		    fflush(stdin);
		    voltar = getche();
		    system("cls");
	}
	else if(opcao==4)
	{
		for(x=0;x<w;x++)
		{
			printf("nome da equipe: %s\n",timeb[x].nomeequipe);
			printf("Maior pontuador de 3: %s\n", timeb[x].arremessador);
			printf("Cestas marcadas por ele: %i\n", timeb[x].cestas3);
			printf("\n");
		}	
		printf("APERTE QUALQUER BOTAO PARA VOLTAR AO MENU INICIAL\n");
		    fflush(stdin);
		    voltar = getche();
		    system("cls");
	}
	}while(resp == 's');
}
