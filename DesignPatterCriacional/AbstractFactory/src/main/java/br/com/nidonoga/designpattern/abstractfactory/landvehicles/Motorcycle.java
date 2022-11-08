package br.com.nidonoga.designpattern.abstractfactory.landvehicles;

public class Motorcycle implements ILandVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando entrega.");
    }

    @Override
    public void getCargo() {

        System.out.println("Encomenda coletada.");

    }
}
