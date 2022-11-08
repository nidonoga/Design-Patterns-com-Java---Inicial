package br.com.nidonoga.designpattern.adapter;

import br.com.nidonoga.designpattern.adapter.adapters.MercadoPagoAdapter;
import br.com.nidonoga.designpattern.adapter.adapters.PayoneerAdapter;
import br.com.nidonoga.designpattern.adapter.mercadopago.MercadoPago;
import br.com.nidonoga.designpattern.adapter.payoneer.Payoneer;
import br.com.nidonoga.designpattern.adapter.paypal.IPayPalPayments;
import br.com.nidonoga.designpattern.adapter.paypal.PayPal;

public class Main {
    public static void main(String[] args) {

        // IPayPalPayments payments = new PayPal();
        // IPayPalPayments payments = new PayoneerAdapter(new Payoneer());
        IPayPalPayments payments = new MercadoPagoAdapter(new MercadoPago());

        payments.paypalPayment();
        payments.paypalReceive();


    }
}