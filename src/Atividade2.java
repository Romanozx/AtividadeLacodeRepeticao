import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira im numero:");
        int valor = sc.nextInt();

        while (valor > 0) {
            System.out.println("Valor: " + valor);
            valor--;
        }

    }
}