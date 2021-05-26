/* Deseja-se informatizar os resultados obtidos pelas equipes de futebol e de basquete de Ribeirão Preto. 
Para cada equipe armazena-se o: 
- Nome da equipe; 
- Número de vitórias; 
- Número de derrotas. 
 
Para as equipes de futebol (6 equipes), acrescente as informações: 
- Número de empates; 
- Número de gols a favor; 
- Número de gols contra; 
- Nome do goleador da equipe; 
- Número de gols do goleador. 
 
Para as equipes de basquete (4 equipes), acrescente as informações: 
- Número de perdas de bola; 
- Número de rebotes pegos; 
- Nome do melhor realizador de arremessos de três pontos; 
- Número de arremessos de três pontos do melhor jogador. */

#include<stdio.h>
#include<stdlib.h>
#include<conio.h>

//structs
struct equipe
{
	char nome[30];
	int vitorias, derrotas;
};

struct
{
	struct equipe equipefut;
	int gfeitos, gsofridos, empates, gartilheiro;
	char artilheiro[40];
} futebol[6];

struct
{
	struct equipe equipebasq;
	int perdas, rebotes, de_tres;
	int vitorias, derrotas;
	char lancador[20], nome[40];
} basquete [4];

//variaveis globais
int x=0, y=0, menu; 
char resp;

//funçao principal
main()
{
		do
		{
				printf("\n\t*** CADASTRO DE EQUIPES ***\n");
				printf("\n\n\t1) Equipe de futebol\n");
				printf("\n\t2) Equipe de basquete\n");
				printf("\n\t3) Consultar equipes de futebol\n");
				printf("\n\t4) Consultar equipes de basquete\n");
		
				printf("\n\tSELECIONE UMA OPCAO : ");
				scanf("%i", &menu);
		
				system("cls");
			
		switch(menu)			
		{
		case 1:
				printf("\nInforme o nome da equipe de futebol: ");
				fflush(stdin);
				gets(futebol[x].equipefut.nome);
					
				printf("\nInforme o numero de vitorias : ");
				scanf("%i", &futebol[x].equipefut.vitorias);
				
				printf("\nInforme o numero de empates : ");
				scanf("%i", &futebol[x].empates);
				
				printf("\nInforme o numero de derrotas : ");
				scanf("%i", &futebol[x].equipefut.derrotas);
				
				printf("\nInforme o numero de gols feitos : ");
				scanf("%i", &futebol[x].gfeitos);
			
				printf("\nInforme o numero de gols sofridos : ");
				scanf("%i", &futebol[x].gsofridos);
		
				printf("\nInforme o nome do artilheiro : ");
				fflush(stdin);
				gets(futebol[x].artilheiro);
				
				printf("\nInforme o numero de gols do artilheiro : ");
				scanf("%i", &futebol[x].gartilheiro);
				
				x++;
				
				system("cls");
				break;
			
		case 2:
				/* desta maneira estava dando um erro dentro da execução do programa,
				entao precisei mudar, e criar uma nova variavel na struct basquete.
			
				printf("\nInforme o nome da equipe de basquete : ");
				fflush(stdin);
				gets(basquete[y].equipebasq.nome); */
				
				printf("\nInforme o nome da equipe de basquete : ");
				fflush(stdin);
				gets(basquete[y].nome); 
	
				printf("\nInforme o numero de vitorias : ");
				printf("%i", &basquete[y].equipebasq.vitorias);
				
				printf("\nInforme o numero de derrotas : ");
				printf("%i", &basquete[y].equipebasq.derrotas);
				
				printf("\nInforme o numero de perdas de bola : ");
				scanf("%i", &basquete[y].perdas);
				
				printf("\nInforme o numero de rebotes pegos : ");
				scanf("%i", &basquete[y].rebotes);
				
				printf("\nInforme o nome do melhor arremessador (3 pontos) : ");
				fflush(stdin);
				gets(basquete[y].lancador);
				
				printf("\nInforme o numero de cestas de 3 : ");
				scanf("%i", &basquete[y].de_tres);
				
				y++;
				break;
		}	
		
		}while(1);
}



