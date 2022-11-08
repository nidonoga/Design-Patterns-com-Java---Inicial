package br.com.nidonoga.designpattern.abstractfactory;

import br.com.nidonoga.designpattern.abstractfactory.app.Application;
import br.com.nidonoga.designpattern.abstractfactory.factories.BoatTransport;
import br.com.nidonoga.designpattern.abstractfactory.factories.ITransportFactory;
import br.com.nidonoga.designpattern.abstractfactory.factories.NineNineTransport;
import br.com.nidonoga.designpattern.abstractfactory.factories.UberTransport;

public class Main {

    public static void main(String[] args) {
        Application app = configureApplication();
        app.startRout();
    }

    public static Application configureApplication() {
        Application app;
        ITransportFactory factory;

        String company = "boat";

        if(company.equals("uber")) {
            factory = new UberTransport();
        } else if(company.equals("99")) {
            factory = new NineNineTransport();
        } else {
            factory = new BoatTransport();
        }

        app = new Application(factory);
        return app;
    }


}