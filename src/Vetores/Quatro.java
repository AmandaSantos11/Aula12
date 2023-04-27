package Vetores;

import java.util.Scanner;

public class Quatro {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);

        int item;

        System.out.println("Informe a quantidade de itens que quer adicionar na lista:");
        item = digite.nextInt();

        String produto[] = new String[item];

        for (int i = 0; i < produto.length; i++) {
            System.out.println("Informe o produto:");
            produto[i] = digite.next();
        }
        System.out.println("------------------------------------------");

        System.out.println("A lista de compra é:");
        for (int i = 0; i < produto.length; i++) {
            System.out.println(produto[i]);
        }
    }
}
