package ex7;

/**
 *
 * @author ADM
 */
public class TestePagamentos {
public void executarTestes() {
        Pagamento cartao = new PagamentoCartao();
        Pagamento boleto = new PagamentoBoleto();
        Pagamento pix = new PagamentoPix();

        cartao.processarPagamento(250.00);
        boleto.processarPagamento(150.00);
        pix.processarPagamento(80.00);
    }
}

