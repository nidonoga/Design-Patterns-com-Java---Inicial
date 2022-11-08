package br.com.nidonoga.designpattern.adapter.adapters;

import br.com.nidonoga.designpattern.adapter.mercadopago.MercadoPago;
import br.com.nidonoga.designpattern.adapter.paypal.IPayPalPayments;
import br.com.nidonoga.designpattern.adapter.utils.Token;

public class MercadoPagoAdapter implements IPayPalPayments {

    private Token token;
    private MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago){
        this.mercadoPago = mercadoPago;
        System.out.println("Adaptando o Payoneer utlizando metodos padrão do Mercado Pago.");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.token = authToken();
        this.mercadoPago.mercadoPagoSendPayment();
    }

    @Override
    public void paypalReceive() {
        this.mercadoPago.mercadoPagoReceivePayment();
    }
}
