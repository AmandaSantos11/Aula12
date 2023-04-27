package EstruturaRepeticao;

public class Quatro {
    public static void main(String[] args){
        int n=1;

        System.out.println("Os números pares de 1 a 30 são:");
        while (n <= 30){
            if (n % 2 == 0){
                System.out.println(n);
            }
            n++;
        }
    }
}