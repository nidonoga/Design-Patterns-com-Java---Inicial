package br.com.nidonoga.designpattern.adapter.adapters;

import br.com.nidonoga.designpattern.adapter.payoneer.Payoneer;
import br.com.nidonoga.designpattern.adapter.paypal.IPayPalPayments;
import br.com.nidonoga.designpattern.adapter.utils.Token;

public class PayoneerAdapter implements IPayPalPayments {
    private Token token;
    private Payoneer payoneer;

    public PayoneerAdapter(Payoneer payoneer) {
        this.payoneer = payoneer;
        System.out.println("Adaptando o Payoneer utlizando metodos padrão do Paypal.");
    }
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.token = authToken();
        this.payoneer.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.payoneer.receivePayment();
    }
}
