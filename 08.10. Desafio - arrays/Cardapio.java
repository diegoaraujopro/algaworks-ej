import java.util.Arrays;

public class Cardapio {
    ItemCardapio[] itens;

    void adicionarItem(ItemCardapio item) {
        // implementar inclusão de item do cardápio
        if (itens == null) {
            itens = new ItemCardapio[0];
        }
        itens = Arrays.copyOf(itens, itens.length + 1);
        itens[itens.length - 1] = item;
    }

    void removerItem(int indice) {
        // implementar exclusão de item do cardápio da posição informada
        ItemCardapio[] itensNovos = new ItemCardapio[itens.length -1];
        System.arraycopy(itens, 0, itensNovos, 0, indice);
        System.arraycopy(itens, indice + 1, itensNovos, indice, itensNovos.length - indice);
        itens = itensNovos;
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        // implementar código para imprimir na console os itens
        //  do cardápio que estiverem entre o preço mínimo e máximo
        for (ItemCardapio item : itens) {
            if (item.preco >= precoMinimo && item.preco <= precoMaximo) {
                System.out.println(item.descricao + ": R$" + item.preco);
            }
        }
    }
}
