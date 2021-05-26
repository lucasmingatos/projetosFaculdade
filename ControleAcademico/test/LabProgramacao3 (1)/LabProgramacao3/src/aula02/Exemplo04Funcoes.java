package aula02;

public class Exemplo04Funcoes {

    public static void main(String[] args) {

        int vet[] = {1, 2, 3, 4, 5};
        exibir(vet);
        System.out.println("Soma = " + somar(vet));
        quadrado(vet);
        exibir(vet);
    }

    //função para exibir o vetor
    public static void exibir(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }

    public static int somar(int vet[]) {
        int soma = 0;
        for (int i = 0; i < vet.length; i++) {
            soma += vet[i];
        }
        return soma;
    }
    
    public static void quadrado(int vet[]){
        for (int i = 0; i < vet.length; i++) {
            vet[i] = (int)Math.pow(vet[i],2);
        }
    }

}
