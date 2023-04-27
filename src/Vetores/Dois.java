package Vetores;

import java.util.Scanner;

public class Dois {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);

        String aluno[] = new String [10];

        for (int i = 0; i < aluno.length ; i++) {
            System.out.println("Digite o nome do aluno:");
            aluno[i] = digite.next();
        }
        System.out.println("--------------------");

        System.out.println("A lista de chamada é:");
        for (int i = 0; i < aluno.length; i++) {
            System.out.println(aluno[i]);
        }
    }
}
