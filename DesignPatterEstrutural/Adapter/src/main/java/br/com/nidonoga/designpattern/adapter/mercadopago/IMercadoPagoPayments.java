package br.com.nidonoga.designpattern.adapter.mercadopago;

import br.com.nidonoga.designpattern.adapter.utils.Token;

public interface IMercadoPagoPayments {
    Token authToken();

    void mercadoPagoSendPayment();

    void mercadoPagoReceivePayment();
}
