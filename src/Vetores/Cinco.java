package Vetores;

import java.util.Scanner;

public class Cinco {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);

        String banda;
        String musica[] = new String[3];

        System.out.println("Digite o nome da banda:");
        banda = digite.nextLine();

        for (int i = 0; i < musica.length; i++) {
            System.out.println("Digite o nome de uma música:");
            musica[i] = digite.nextLine();
        }
        System.out.println("--------------------");

        System.out.println("Nome da banda:"+banda);
        for (int i = 0; i < musica.length; i++) {
            System.out.println(musica[i]);
        }
    }
}
