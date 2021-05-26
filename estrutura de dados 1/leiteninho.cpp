/* exercicio com struct 
modulo empresarial voltado a area de RH

- cadastrar funcionarios com as seguintes informações

codigo, nome, cidade, idade, escolaridade, salario, departamento

- criar um menu com as seguintes opçes 
1 cadastrar funcionario
2 remover funcionario
3 consultar funcionario
4 consultar salario total por:
departamento, idade, escolaridade, cidade
5 sair */


#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <locale.h>




struct funcionario{
		int codigo, idade;
		float salario;
		char nome[40], cidade[20], depart[20], escol[20];
} cadastro[3];



void mostrar();
void cadastrar();
int menu();
void consultar();
void remover();
void calcular();


int menu(){
	setlocale(LC_ALL, "portuguese");
	int opcao;
		system("cls");
		printf("\n*** MENU ***\n");
		printf("\n\t1) CADASTRAR FUNCIONARIO\n");
		printf("\t2) REMOVER FUNCIONARIO\n");
		printf("\t3) CONSULTAR FUNCIONÁRIO POR CÓDIGO\n");
	//	printf("\t4) LISTAR TODOS FUNCIONÁRIOS\n");
		printf("\t4) CONSULTAR SALARIO POR CIDADE\n");
		printf("\n\t0) SAIR\n");
		
		
		printf("\nSELECIONE UMA OPCAO : ");
		fflush(stdin);
		scanf("%i", &opcao);
		
		switch(opcao){
			case 1:{
				cadastrar();
				break;
			}
			case 2:{
				remover();
				break;
			}
			case 3:{
				consultar();
				break;
			}
			case 4:{
				calcular();
			}
			case 0:{
				exit(0);
				break;
			}
			default: {
				printf("A opção escolhida não existe!");
				system("pause");
				menu();
			}
		
		}
	}


void cadastrar(){
	setlocale(LC_ALL, "portuguese");
	int i;
		
	for(i==0; i<3; i++){
				
				printf("\nInforme o nome do funcionario : ");
				fflush(stdin);
				gets(cadastro[i].nome);
					
				printf("\nInforme a idade do funcionario : ");
				scanf("%i", &cadastro[i].idade);
				
				printf("\nInforme a cidade do funcionario : ");
				fflush(stdin);
				gets(cadastro[i].cidade);
			
				printf("\nInforme a escolaridade do funcionario : ");
				fflush(stdin);
				gets(cadastro[i].escol);
				
				printf("\nInforme o departamento do funcionario : ");
				fflush(stdin);
				gets(cadastro[i].depart);
			
				printf("\nInforme o codigo do funcionario : ");
				scanf("%i", &cadastro[i].codigo);
		
				printf("\nInforme o salario do funcionario : ");
				scanf("%f", &cadastro[i].salario);
				
				system("cls");
			}
	printf("Cadastro realizado com sucesso!!!\n");
	printf("Aperte enter para voltar para o menu.\n\n");
	system("pause");
	system("cls");
	menu();
	
}

void consultar(){
	setlocale(LC_ALL, "portuguese");
	int i, cco, a=0;
		printf("Informe o código que quer consultar: ");
		scanf("%i", &cco);
		for(i==0; i <3; i++){
		if(cadastro[i].codigo == cco){
			printf("Código: %i", cadastro[i].codigo);
			printf("Nome: %s", cadastro[i].nome);
			printf("\nCidade: %s", cadastro[i].cidade);
			printf("\nIdade: %i", cadastro[i].idade);
			printf("\nEscolaridade: %s", cadastro[i].escol);
			printf("\nDepartamento: %s", cadastro[i].depart);
			printf("Salário: %f", cadastro[i].salario);
		
			
			
			
			
			printf("\n\nVocê retornará ao menu assim que apertar Enter!");
			
			system("pause");
			menu();
			
	}else{
		a ++;
	}
			
	
		
		}
		if(a>=3){
			printf("\nFuncionário inexistente!\n\n");
			system("pause");
			menu();
		}
		
	
	
}

void remover(){
	setlocale(LC_ALL, "portuguese");
	int cro, i,ult=3;
	printf("Digite o código do funcionário que quer remover: ");
	scanf("%i", &cro);
	
	for(i==0; i<ult-1; i++){
		if(cadastro[i].codigo == cro){
			
			cadastro[i].codigo = cadastro[i+1].codigo;
			strcpy(cadastro[i].nome, cadastro[i+1].nome);
			strcpy(cadastro[i].cidade, cadastro[i+1].cidade);
			cadastro[i].idade = cadastro[i+1].idade;
			strcpy(cadastro[i].escol, cadastro[i+1].escol);
			strcpy(cadastro[i].depart, cadastro[i+1].depart);
			cadastro[i].salario = cadastro[i+1].salario;
			
			ult--;
			
			
			
		printf("Após a remoção, a lista de funcionários ficou assim: ");
		mostrar();	
		
			
		system("pause");
		menu();
		}
	}
	
	
	}
	
	
void mostrar(){
	setlocale(LC_ALL, "portuguese");
		int i, ult=3;
		for(i=0; i<ult-1; i++)
				{
					printf("nome: %s\n", cadastro[i].nome);
					printf("idade: %i\n", cadastro[i].idade);
					printf("cidade: %s\n", cadastro[i].cidade);
					printf("departamento: %s\n", cadastro[i].depart);
					printf("codigo: %i\n", cadastro[i].codigo);
					printf("salario: %.2f\n", cadastro[i].salario);
					printf("Escolaridade: %s\n", cadastro[i].escol);
					printf("\n");
					
				}	
				system("pause");
				menu();

}

void calcular(){
	setlocale(LC_ALL, "portuguese");
	char cidp[20];
	printf("Digite a cidade que deseja pesquisar: ");
	fflush(stdin);
	gets(cidp);
	int i, a =0;
	float soma;
	for(i==0; i<3; i++){
		if(strcmp(cadastro[i].cidade, cidp))
		{
			soma += cadastro[i].salario;
			printf("A soma dos salários dos funcionários desta cidade é de: %.2f", soma);
			printf("Os salários somados foram: %.2f de: %s", cadastro[i].salario, cadastro[i].nome);
			system("pause");
			menu();
		}else{
			a ++;
		}
	}if(a>=3){
		printf("\nNão há funcionario desta cidade, você retornará ao menu!\n");
		system("pause");
		menu();
	}
	
}


int main(){
	menu();
	}



