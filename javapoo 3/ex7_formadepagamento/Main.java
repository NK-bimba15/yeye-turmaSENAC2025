/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex7_formadepagamento;

/**
 *
 * @author nicka
 */
public class Main {
    public static void main(String[] args) {
        FormaPagamento pagamento1 = new CartaoCredito("João", "1234-5678-9876-5432");
        FormaPagamento pagamento2 = new Boleto("856900000005368900000049");
        FormaPagamento pagamento3 = new Dinheiro();

        System.out.println("--- Realizando pagamentos ---");
        pagamento1.efetuarPagamento(250.00);
        pagamento2.efetuarPagamento(99.90);
        pagamento3.efetuarPagamento(45.00);
    }
}
