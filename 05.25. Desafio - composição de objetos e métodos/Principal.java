public class Principal {

    public static void main(String[] args) {
        Funcionario diego = new Funcionario();
        diego.nome = "Diego";
        diego.filhos = 1;

        ContratoTrabalho contratoDiego = new ContratoTrabalho();
        contratoDiego.funcionario = diego;
        contratoDiego.valorNormal = 80;
        contratoDiego.valorExtra = 100;

        FolhaPagamento pagamento = new FolhaPagamento();
        Holerite salario = pagamento.calcularSalario(contratoDiego, 20, 10);
        salario.imprimir();
    }
}
