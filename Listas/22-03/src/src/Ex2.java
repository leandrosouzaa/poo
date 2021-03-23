package src;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        
        System.out.println("Preencha o Vetor A com 5 números inteiros.");
        
        for(int i=0;i<5;i++) {
            System.out.printf("Vetor A[%d]: ", i);
            vetorA[i] = readInput.nextInt();
        }

        System.out.println("\nPreencha o Vetor A com 5 números inteiros.");
        
        for(int i=0;i<5;i++) {
            System.out.printf("Vetor B[%d]: ", i);
            vetorB[i] = readInput.nextInt();
        }
        
        System.out.printf("\nMultiplicação dos Vetores:\n");
        for(int i=0;i<5;i++) {
            System.out.printf("%d x %d = %d.\n", vetorA[i], vetorB[i], vetorA[i]*vetorB[i]);
        }
    }
}
