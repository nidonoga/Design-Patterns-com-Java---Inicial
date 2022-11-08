package br.com.nidonoga.designpattern.adapter.paypal;

import br.com.nidonoga.designpattern.adapter.utils.Token;

public interface IPayPalPayments {

    Token authToken();

    void paypalPayment();

    void paypalReceive();

}
