public class PagamentoPix {
    public class PagamentoPix implements IMetodoPagamento {
        @Override
        public boolean pagar (double valor) {
            try {
                System.out.println("Processando Pagamneto via Pix...");
                Thread.sleep(2000); // simula tempo de processamento
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            return true;
        }
    }
}
