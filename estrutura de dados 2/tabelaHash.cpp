#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
 
int max = 10;          
int tamanho = 0;          
 

struct no 
{
	int dado;
	int valor;
	struct no *esquerda;
	struct no *direita;
};
 

struct arvoreb 
{
	struct no *inicio;
	
};
 

struct arvoreb *v;

void inserir(struct no *arvore, struct no *item);

struct no* encontrar(struct no *arvore, int dado);

void exibirarvore(struct no *arvore);


void definir()
{
    	int i = 0;
    	for(i = 0; i < max; i++)
        {
        	v[i].inicio = NULL;
    	}
 
}


void inserir(struct no *arvore, struct no *item)
{
	if (item->dado < arvore->dado){
		if (arvore->esquerda == NULL){
			arvore->esquerda = item;
			return;
		}
		else{
			
			inserir(arvore->esquerda, item);
			return;
		}
	}
	else if (item->dado > arvore->dado){
		if (arvore->direita == NULL){
			arvore->direita = item;
			return;
		}
		else{
			inserir(arvore->direita, item);
			return;
		}
	}
}


int codigo_hash(int dado)
{
	return (dado % max);
}
 
 
void adicionar(int dado, int valor)
{
	int indice = codigo_hash(dado);
	struct no *arvore = (struct no*) v[indice].inicio;

	struct no *novoitem = (struct no*) malloc(sizeof(struct no));
	novoitem->dado = dado;
	novoitem->valor = valor;
	novoitem->esquerda = NULL;
	novoitem->direita = NULL;
 
	if (arvore == NULL){ 
		printf("NUMERO %d INSERIDO\n", dado);
		v[indice].inicio = novoitem;
	}
	else{
		 
		struct no *temp = encontrar(arvore, dado);
		if (temp == NULL){
			printf("NUMERO %d INSERIDO", dado, valor);
			inserir(arvore, novoitem);
		} 	
		else{
			temp->valor = valor;
		}      
	}
 
}
 
 

struct no* encontrar(struct no *arvore, int dado){
	if (arvore == NULL){
		return NULL;
	} 
        
	if (arvore->dado == dado){
		return arvore;
	}
	
	else if (dado < arvore->dado){
		return encontrar(arvore->esquerda, dado);
	}
	
	else {
		return encontrar(arvore->direita, dado);
	}
}


void exibir(){
	int i = 0;
	for(i = 0; i < max; i++){
		
		struct no *arvore = v[i].inicio;
		
		if (arvore == NULL){
			printf("\n a posicao %d da tabela esta vazia", i);
		}
		else{
			printf("\n a posicao %d tem o valor:  ", i);
			exibirarvore(arvore);
		}
	}
}
 
void exibirarvore(struct no *arvore){
	
    if (arvore == NULL){
        return;
    }
    
    printf("%d  \t", arvore->dado);
 
    if (arvore->esquerda != NULL){
    	exibirarvore(arvore->esquerda);
	}
	
	if (arvore->direita != NULL){
		exibirarvore(arvore->direita);
	}
}
 

main()
{
    int opcao, n;
    int x;
	int dado;
	int valor;
 
	v = (struct arvoreb*)malloc(max * sizeof(struct arvoreb*));
	definir();
 
	do {
		
		
		printf("##### MENU #####\n"
		       "\n1 - Realizar insercao" 
               "\n2 - Exibir dados da tabela" 
               "\n\n"
		       "SELECIONE UMA OPCAO: ");
 
 		scanf("%d", &opcao);
 		
 		system("cls");
 		
		switch(opcao) 
                {
 
		case 1:
 
		    printf("digite o dado a ser inserido\n");
		    printf("dado: ");
		    scanf("%d", &dado);
		    system("cls"); 
		    valor = dado;
		    adicionar(dado, valor);
 			
 			
 			
		    break;
		      
		case 2:
			
 
		    exibir();
		    break;
 
 
		default:
 
		    printf("##### OPCAO INVALIDA #####");
 
		}
 
		printf("\npressione qualquer numero + ENTER para continuar ");
		scanf("%d", &x);
		system("cls");
 
	}while(opcao);
 
	getch();
 
 
}
