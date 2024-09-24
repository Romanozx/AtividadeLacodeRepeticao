import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor:");

        int numero  = sc.nextInt();
        int fatorial =1;
        int i = numero;

        do{
            fatorial *= i;
            i--;
        }while(i > 0);

        System.out.println("O fatorial de "+ numero + " é "+ fatorial );

    }
}