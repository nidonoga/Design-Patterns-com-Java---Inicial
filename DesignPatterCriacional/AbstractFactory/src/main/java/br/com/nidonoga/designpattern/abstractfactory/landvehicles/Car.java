package br.com.nidonoga.designpattern.abstractfactory.landvehicles;

public class Car implements ILandVehicle {
    @Override
    public void startRoute() {

        getCargo();

        System.out.println("Iniciando trageto.");

    }

    @Override
    public void getCargo() {

        System.out.println("Passageiros embarcados.");

    }
}
