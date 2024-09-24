import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero:");
        int num = sc.nextInt();

        for (int i = 0; i < 11; i++) {
            int multiplicacao = num * i;
            System.out.println(num + " * " + i +" = " + multiplicacao);
        }

    }
}