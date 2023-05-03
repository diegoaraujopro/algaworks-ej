public class FolhaPagamento {

    Holerite calcularSalario(ContratoTrabalho contrato, int horasNormais, int horasExtras) {
        Holerite holerite = new Holerite();
        holerite.funcionario = contrato.funcionario;
        holerite.valorHorasTrabalhadas = horasNormais * contrato.valorNormal;
        holerite.valorHorasExtrasTrabalhadas = horasExtras * contrato.valorExtra;
        holerite.adicionalFilhos = percentualDicionalFilhos(contrato);
        return holerite;
    }

    double percentualDicionalFilhos(ContratoTrabalho contrato) {
        return contrato.funcionario.filhos > 0 ? 0.1 : 0;
    }
}
