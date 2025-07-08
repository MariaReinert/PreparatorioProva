public class Loja {
    public class Loja {
        private IMetodoPagamento metodoPagamento;

        public Loja(IMetodoPagamento metodoPagamento) {
            this.metodoPagamento = metodoPagamento;
        }

        public void realizarCompra(Carrinho c) {
            double total = c.calcularTotal();
            System.out.println("Total da compra: R$" + total);
            if (metodoPagamento.pagar(total)) {
                System.out.println("Compra Aprovada");
            } else {
                System.out.println("Compra Recusada seu Pobre rsrs");
            }
        }
    }
}



