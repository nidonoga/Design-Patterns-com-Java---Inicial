package br.com.nidonoga.designpattern.adapter.mercadopago;

import br.com.nidonoga.designpattern.adapter.utils.Token;

public class MercadoPago implements IMercadoPagoPayments {

    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void mercadoPagoSendPayment() {
        this.token = authToken();
        System.out.println("Enviando pagamento via Mercado Pago.");
    }

    @Override
    public void mercadoPagoReceivePayment() {
        System.out.println("Recebendo pagamento via Mercado Pago.");
    }
}
