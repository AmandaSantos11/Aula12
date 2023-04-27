package EstruturaRepeticao;

public class Um {
    public static void main(String[] args){
        int n=1;

        System.out.println("Os números pares de 1 a 100 são:");
        do {
            if (n % 2 == 0){
                System.out.println(n);
            }
            n++;
        }while (n<=100);
    }
}