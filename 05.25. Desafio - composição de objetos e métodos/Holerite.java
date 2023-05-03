public class Holerite {
    Funcionario funcionario;
    double valorHorasTrabalhadas;
    double valorHorasExtrasTrabalhadas;
    double adicionalFilhos;

    double calcularTotal() {
        double total = valorHorasTrabalhadas + valorHorasExtrasTrabalhadas;
        total += total * adicionalFilhos;
        return total;
    }

    void imprimir() {
        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Salário: " + calcularTotal());
        System.out.println("% adicional filho: " + adicionalFilhos);
    }
}
