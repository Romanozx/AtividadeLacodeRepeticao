import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros: ");
        int numeros = sc.nextInt();

        double soma =0;

        for (int i = 1; i <= numeros; i++) {
            System.out.println("Digite o numero " + i + ": ");
            double valor = sc.nextDouble();
            soma += valor;
        }

        double media = soma/numeros;

        System.out.println("A medias de numeros é: " + media);

    }
}