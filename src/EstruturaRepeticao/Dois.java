package EstruturaRepeticao;

public class Dois {
    public static void main(String[] args){
        int tabuada=5;
        int resultado;

        System.out.println("A tabuada do 5 é:");

        for (int i=0; i<=10; i++ ){

            resultado=tabuada*i;

            System.out.println("5x" +i + "=" + resultado);
        }
    }
}
