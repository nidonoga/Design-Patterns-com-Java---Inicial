package br.com.nidonoga.designpattern.factory.vehicles;

public class Bike implements IVehicle {
    @Override
    public void startRoute() {

        getCargo();

        System.out.println("Iniciando entrega.");
    }

    @Override
    public void getCargo() {

        System.out.println("Refeição coletada, tudo pronto.");

    }
}
