import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = s.nextInt();

        boolean multiplo400 = (ano % 400) == 0;
        // System.out.printf("Multiplo de 400? %b%n", multiplo400);

        boolean multiplo4AndNot100 = (ano % 4) == 0 && (ano % 100) != 0;
        // System.out.printf("Multiplo de 4 e não de 100? %b%n", multiplo4AndNot100);

        System.out.printf("O ano de %s é um ano bissexto? %b%n", ano, multiplo400 || multiplo4AndNot100);

    }

}
