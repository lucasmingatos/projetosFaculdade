//Lucas Sant'Ana Mingatos - código 826274
//Segmento de mercado - esportes coletivos

/*
    *gravação de um vídeo apresentando o software funcionando corretamente
    *comentários objetivos para ajudar no entendimento do código
    *manter prints de teste dentro do código para provar o funcionamento correto

    1 - inserção arvore não balanceada, não permitir elementos duplicados
    2 - inserção arvore AVL balanceada, não permitir elementos duplicados
    3 - impressão específica, ordem crescente e decrescente, avisar caso a arvore esteja vazia
    4 - ajuda, explicando as funções disponíveis
*/


#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <windows.h>


typedef struct Arvore{
	int numero;
	char nome_esporte[20];
	struct arvore *esquerda, *direita;
}arvore ;


int op;
int numero;
int pesquisado;


//criando o no e definindo esquerda e direita como null
struct Arvore *criarNo(int num){


	struct Arvore *novo = (arvore *)malloc(sizeof(arvore));

	// if, caso o malloc não seja feito
	if(!novo){
		printf("memória cheia");
	} else{
	    //preenchendo o campo nome_esporte na struct
        printf(" INSIRA O NOME DO ESPORTE COLETIVO PRÁTICADO PELO ATLETA DE CÓDIGO %i: ", num);
        scanf(" %s", novo->nome_esporte);
	    printf("\n definindo as propriedades do novo nó e inserindo na árvore...\n");
        //Sleep(1000);
        //definindo esquerda e direita como NULL
        novo->numero = num;
        novo->esquerda = NULL;
        novo->direita = NULL;

        printf("\n check para saber quando a definição de esquerda e direita NULL foi finalizada, tecle ok para limpar a tela\n\n\n\n ");
        system("pause");
        //system("cls");
        //retorna novo para o programa continuar sua execução
        return novo;
	}
}

//inserir numero na arvore
struct Arvore* inserir(struct Arvore* no, int num){

	if(no == NULL){
		return criarNo(num);
	}

	if(num <= no->numero){
		no->esquerda = inserir(no->esquerda,num);
	}

	if(num >= no->numero){
		no->direita = inserir(no->direita,num);
	}

	return no;

	printf("\n check para saber se a função de INSERIR NÓ foi acessada \n\n ");
}

//imprimindo em ordem crescente
void emOrdem(struct Arvore* raiz){
	if(raiz != NULL){
		emOrdem(raiz->esquerda);
		printf("\n %i\n", raiz->numero);
		printf("\n %s\n", raiz->nome_esporte);
		emOrdem(raiz->direita);
	}
}

//imprimindo em ordem decrescente
void emDecres(struct Arvore* raiz){
	if(raiz != NULL){
		emDecres(raiz->direita);
		printf("\n %i\n", raiz->numero);
		emDecres(raiz->esquerda);
	}
}

//pesquisar nó na árvore
struct Arvore* pesquisarNo(struct Arvore *raiz, int num)
{
    //if que checa se o número é existente na árvore
    if(raiz == NULL || raiz->numero == num) {
		printf("\n O ESPORTISTA DE CÓDIGO %i PRATICA %s\n", raiz->numero, raiz->nome_esporte);
		return raiz;
		system("pause");
	}

    //if para percorrer as sub-arvores da direita e esquerda de cada um dos nós
    if(raiz->numero < num){
        pesquisarNo(raiz->direita, num);
    	pesquisarNo(raiz->esquerda, num);
    }

    //if para informar que o número não foi encontrado na árvore
    if(raiz->numero != num){
        printf("CÓDIGO DO ESPORTISTA INSERIDO É INEXISTENTE");
    }

}

struct Arvore* checarDuplicidade(struct Arvore *raiz, int num){

};


// MENU
int main (void){
	struct Arvore *raiz = NULL; //definindo a raíz como nula
	setlocale(LC_ALL, "Portuguese"); //utilizando a biblioteca locale.h para utilizar acentos nos menus do programa
	do{

		printf(
           "\n ALGORITMO DE ÁRVORE BINÁRIA E ÁRVORE AVL BALANCEADA - LUCAS SANT'ANA MINGATOS CÓDIGO: 826274 \n"
           "\n 1 - CADASTRAR NOVO ESPORTISTA EM ÁRVORE BINÁRIA NÃO-BALANCEADA"
           "\n 2 - CADASTRAR NOVO ESPORTISTA EM ÁRVORE BINÁRIA BALANCEADA"
		   "\n 3 - IMPRIMIR ÁRVORE EM ORDEM CRESCENTE DOS ESPORTISTAS"
		   "\n 4 - IMPRIMIR ÁRVORE EM ORDEM DECRESCENTE DOS ESPORTISTAS"
		   "\n 5 - PESQUISAR CÓDIGO DO ESPORTISTA"
		   "\n 6 - AJUDA"
		   "\n\n DIGITE SUA OPÇÃO: ");
		scanf("%d", &op);

		switch(op){

			case 1:
				if(raiz !=  NULL){
					printf("\n INSIRA O NOVO NÓ: ");
					scanf(" %d", &numero);
					//checarDuplicidade(raiz, numero);
					inserir(raiz,numero);
					system("cls");
					break;
				}
				if(raiz == NULL){
					printf("\n INSIRA O NOVO NÓ RAÍZ: ");
					scanf(" %d", &numero);
					raiz = inserir(raiz,numero);
					system("cls");
					break;
				}

            case 2:
                /*if(raiz !=  NULL){
					printf("\n INSIRA O NOVO NÓ: ");
					scanf(" %d", &numero);
					//checarDuplicidade(raiz, numero);
					inserirAVL(raiz,numero);
					system("cls");
					break;
				}
				if(raiz == NULL){
					printf("\n INSIRA O NOVO NÓ RAÍZ: ");
					scanf(" %d", &numero);
					raiz = inserirAVL(raiz,numero);
					system("cls");
					break;
				}*/

			case 3:
			    system("cls");

			    if(raiz == NULL){
                    printf(" ÁRVORE VÁZIA\n\n");
                    printf(" \n");
                    system("\n\n\npause");
                    system("cls");
			    }

			    if(raiz != NULL){
                    printf(" IMPRESSÃO EM ORDEM CRESCENTE DOS ESPORTISTAS\n\n");
                    emOrdem(raiz);
                    printf(" \n");
                    system("\n\n\npause");
                    system("cls");
			    }

				break;

			case 4:
			    system("cls");

			    if(raiz == NULL){
                    printf(" ÁRVORE VÁZIA\n\n");
                    printf(" \n");
                    system("\n\n\npause");
                    system("cls");
			    }

			    if(raiz != NULL){
                    printf(" IMPRESSÃO EM ORDEM DECRESCENTE DOS ESPORTISTAS\n\n");
                    emDecres(raiz);
                    printf(" \n");
                    system("\n\n\npause");
                    system("cls");
			    }

            case 5:
			    system("cls");

			    if(raiz == NULL){
                    printf(" ÁRVORE VÁZIA\n\n");
                    printf(" \n");
                    system("\n\n\npause");
                    system("cls");
			    }

			    if(raiz != NULL){
                    printf(" PESQUISA DE CADASTRO DO ESPORTISTA DE CÓDIGO: ");
                    scanf(" %d", &numero);
                    pesquisarNo(raiz, numero);
                    printf(" \n");
                    system("\n\n\npause");
                    system("cls");
			    }
				break;

            case 6:
                system("cls");
                printf(" MENU DE AJUDA\n\n");
                printf("O software funciona de maneira simples, na opção 1 serão solicitados dadospara o armazenamento em uma árvore\nbinária não-balanceada.\n");
                printf("Na opção 2 os dados solicitados irão ser inseridos em uma árvore binária\nbalanceada.");
                printf("\nAs opções 3 e 4 imprimem os cadastros armazenados em ordem crescente e decrescente de acordo com o código");
                printf("\nPor fim, a ultima opção do menu o usuário localiza um esportista específico dentro da árvore.\n");
                printf(" \n");
                system("\n\n\npause");
                system("cls");

                break;
			default:
			    system("cls");
                printf(" OPÇÃO INVALIDA\n\n");
                printf(" \n");
                system("\n\n\npause");
                system("cls");
                break;
		}
	}while(op);
}






