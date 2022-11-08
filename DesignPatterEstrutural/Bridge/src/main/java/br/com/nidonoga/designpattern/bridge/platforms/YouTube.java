package br.com.nidonoga.designpattern.bridge.platforms;

public class YouTube implements  IPlatform {

    public YouTube(){
        configureRMTP();
        System.out.println("YouTube: conectado.");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("YouTube: configurando broadcasting.");
    }

    @Override
    public void authToken() {
        System.out.println("YouTube: autorizando.");
    }
}
