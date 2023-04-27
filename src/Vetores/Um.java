package Vetores;

import java.util.Scanner;

public class Um {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);

        int vetor[] = new int[5];

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

        int resultado;
        resultado = vetor[0] + vetor[1] + vetor[2] + vetor[3] + vetor[4];
        System.out.printf("A soma dos vetores é:"+resultado);
    }
}
