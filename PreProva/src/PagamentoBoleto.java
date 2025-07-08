public class PagamentoBoleto {
    public class PagamentoBoleto implements IMetodoPagamento {
        @Override
        public boolean pagar (double valor) {
            System.out.println("Pagamento via boleto gerado. Aguardando pagamento..");
            return true;
//            return  false; // nunca confirma pagamento
        }
    }
}
