package Vetores;

import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);

        int vetor[] = new int[10];

        for (int i=0; i < vetor.length; i++){
            System.out.println("Informe um número para a posição "+i +":");
            vetor[i] = digite.nextInt();
        }
        System.out.println("------------------------");
        System.out.println("Os valores digitados foram: ");
        for (int i=0; i<vetor.length; i++){
            System.out.println(vetor[i]);
        }
        System.out.println("------------------------");
        System.out.println("Os números pares dessa lista são:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0){
                System.out.println(vetor[i]);
            }
        }
    }
}
