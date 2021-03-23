package src;

import java.util.Scanner;

public class Ex1 {
    
    public static double soma_vetor(int [] vet, int size) {
        double soma = 0;
        for(int i=0;i<size;i++) {
            soma+= vet[i];
        };
        
        return soma;
    };
    
    public static int localiza_menor(int [] vet, int size) {
        int indexMenor = 0;
        for(int i=1;i<size;i++) {
            if(vet[i] < vet[indexMenor]) {
                indexMenor = i;
            }
        };
        
        return indexMenor;
    };
    
    public static int localiza_maior(int [] vet, int size) {
        int indexMaior = 0;
        for(int i=1;i<size;i++) {
            if(vet[i] > vet[indexMaior] ) {
                indexMaior = i;
            }
        };
        
        return indexMaior;
    };
    
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        int[] vetor = new int[6];
        
        System.out.println("Preencha o vetor a seguir com 6 números inteiros.\n");
        
        for(int i=0;i<6;i++) {
            System.out.printf("Vetor[%d]: ", i);
            vetor[i] = readInput.nextInt();
        }
        
        double total = soma_vetor(vetor, 6);
        double media = total / 6;
        int indexMenor = localiza_menor(vetor, 6);
        int indexMaior = localiza_maior(vetor, 6);
        
        System.out.printf("\n\nRelatório:\n");
        System.out.printf("Maior elemento: %d.\n", vetor[indexMaior]);
        System.out.printf("Menor elemento: %d.\n", vetor[indexMenor]);
        System.out.printf("Total: %f.\n", total);
        System.out.printf("Média: %f.\n", media);
        
        System.out.printf("\nVetor informado:\n");
        for(int i=0;i<6;i++) {
            System.out.printf("Vetor[%d]: %d.\n", i, vetor[i]);
        }
    }
    
}

