/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex7_formadepagamento;

/**
 *
 * @author nicka
 */
public class CartaoCredito implements FormaPagamento {
    private String titular;
    private String numeroCartao;

    public CartaoCredito(String titular, String numeroCartao) {
        this.titular = titular;
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void efetuarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " efetuado com cartão de crédito de " + titular);
    }   
}
