package ex7;

/**
 *
 * @author ADM
 */
public abstract class Pagamento {
    public abstract void processarPagamento(double valor);
}

class PagamentoCartao extends Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via Cartão de Crédito.");
    }
}

class PagamentoBoleto extends Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " gerado via Boleto Bancário.");
    }
}

class PagamentoPix extends Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via PIX.");
    }
}

