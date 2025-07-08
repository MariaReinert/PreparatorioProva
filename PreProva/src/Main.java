public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(new Produto("Vestido", 150.0));
        carrinho.adicionarProduto(new Produto("Sapato", 250.0));

        Loja lojaMaah = new Loja(new PagamentoCartaoCredito());
        lojaMaah.realizarCompra(carrinho);

        Loja lojaLya = new Loja (new PagamentoPix());
        lojaLya.realizarCompra(carrinho);

        Loja lojaHeroll = new Loja(new PagamentoBoleto());
        lojaHeroll.realizarCompra(carrinho);


    }
}