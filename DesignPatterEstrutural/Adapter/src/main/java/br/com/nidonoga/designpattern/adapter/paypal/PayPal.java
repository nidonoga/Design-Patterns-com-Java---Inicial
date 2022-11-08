package br.com.nidonoga.designpattern.adapter.paypal;

import br.com.nidonoga.designpattern.adapter.utils.Token;

public class PayPal implements IPayPalPayments {

    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.token = authToken();
        System.out.println("Enviado pagamento via Paypal.");
    }

    @Override
    public void paypalReceive() {
        System.out.println("Recebendo pagamento via Paypal.");
    }
}
