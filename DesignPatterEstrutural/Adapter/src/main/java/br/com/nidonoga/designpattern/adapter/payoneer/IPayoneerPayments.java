package br.com.nidonoga.designpattern.adapter.payoneer;

import br.com.nidonoga.designpattern.adapter.utils.Token;

public interface IPayoneerPayments {

    Token authToken();

    void sendPayment();

    void receivePayment();

}
