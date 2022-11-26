import java.util.Scanner;

public class CalculaPagamento {

    public static void main(String[] args) {

        // Programa para calcular a folha de pagamento

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o valor da hora trabalhada: ");
        double valorHora = entrada.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = entrada.nextInt();

        System.out.print("Digite o valor dos descontos: ");
        double valorDesconto = entrada.nextDouble();

        System.out.println("-------------------------");
        System.out.printf("Folha de pagamento de %s%n", nome);
        System.out.printf("%dh X R$%7.2f = R$%8.2f%n", horasTrabalhadas, valorHora, horasTrabalhadas * valorHora);
        System.out.printf("Descontos: R$%7.2f%n", valorDesconto);
        System.out.printf("Total líquido: R$%8.2f%n", (horasTrabalhadas * valorHora) - valorDesconto);


    }
}
