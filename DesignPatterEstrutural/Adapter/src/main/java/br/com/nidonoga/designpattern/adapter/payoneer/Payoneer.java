package br.com.nidonoga.designpattern.adapter.payoneer;

import br.com.nidonoga.designpattern.adapter.utils.Token;

public class Payoneer implements IPayoneerPayments {

    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        this.token = authToken();
        System.out.println("Enviando pagamento via Payoneer.");
    }

    @Override
    public void receivePayment() {
        System.out.println("Recebendo pagamento via Payoneer.");
    }
}
