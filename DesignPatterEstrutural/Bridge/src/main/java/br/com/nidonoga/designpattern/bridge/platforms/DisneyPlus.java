package br.com.nidonoga.designpattern.bridge.platforms;

public class DisneyPlus implements  IPlatform {

    public DisneyPlus(){
        configureRMTP();
        System.out.println("DisneyPlus: conectado.");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("DisneyPlus: configurando broadcasting.");
    }

    @Override
    public void authToken() {
        System.out.println("DisneyPlus: autorizando.");
    }
}
