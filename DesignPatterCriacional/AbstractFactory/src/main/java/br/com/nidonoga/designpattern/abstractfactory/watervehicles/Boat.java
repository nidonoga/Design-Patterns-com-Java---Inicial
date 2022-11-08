package br.com.nidonoga.designpattern.abstractfactory.watervehicles;

public class Boat implements IWaterVehicle {
    @Override
    public void startRoute() {
        getWaterTemperature();
        getCargo();
        System.out.println("Iniciando navegação");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros a bordo.");
    }

    @Override
    public void getWaterTemperature() {
        System.out.println("Temperatura da água 13º, OK.");
    }
}
