package br.com.nidonoga.designpattern.factory.vehicles;

public class Car implements IVehicle {

    @Override
    public void startRoute() {

        getCargo();

        System.out.println("Iniciando trageto.");


    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos os passageiros, tudo pronto.");
    }
}
