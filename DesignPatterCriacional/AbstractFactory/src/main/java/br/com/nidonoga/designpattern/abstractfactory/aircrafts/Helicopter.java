package br.com.nidonoga.designpattern.abstractfactory.aircrafts;

public class Helicopter implements IAircraft {

    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando decolagem.");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros embarcados.");
    }

    @Override
    public void wind() {
        System.out.println("Ventos a 10km, OK.");
    }
}
