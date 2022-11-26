import java.util.Scanner;

public class CalculadoraComplexaIMC {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        float peso = entrada.nextFloat();

        System.out.print("Digite a altura: ");
        float altura = entrada.nextFloat();

        float imc = peso / (altura * altura);

        String resposta = "";
        if (imc < 19.1) {
            resposta = "Abaixo do peso";
        } else if (imc >= 19.1 && imc <= 25.8) {
            resposta = "No peso ideal";
        } else if (imc > 25.8 && imc <= 27.3) {
            resposta = "Um pouco acima do peso";
        } else if (imc > 27.3 && imc <= 32.3) {
            resposta = "Acima do peso ideal";
        } else {
            resposta = "Obeso";
        }

        System.out.println(resposta + " (imc:" + imc + ")");
    }
}