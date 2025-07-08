public class PagamentoCartaoCredito {
    public class PagamentoCartaoCredito implements IMetodoPagamento {
        @Override
        public boolean pagar(double valor) {
            return valor < 1000;
        }
    }
}
