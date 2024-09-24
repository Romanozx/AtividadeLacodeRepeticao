import java.util.Random;
import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();

        int numAleatorio = aleatorio.nextInt(100) ;
        int palpite =0;

        while(palpite != numAleatorio){
            System.out.println("Digite seu palpite");
            palpite = sc.nextInt();

            if(palpite < numAleatorio){
                System.out.println("O numero é maior");
            } else if (palpite > numAleatorio) {
                System.out.println("O numero é menor");
            }else {
                System.out.println("Voce acertou");
            }
        }

    }
}