package br.com.nidonoga.designpattern.abstractfactory.watervehicles;

public class JetSki implements IWaterVehicle {
    @Override
    public void startRoute() {
        getWaterTemperature();
        getCargo();
        System.out.println("Iniciando navegação");
    }

    @Override
    public void getCargo() {
        System.out.println("Entrega coletada.");
    }

    @Override
    public void getWaterTemperature() {
        System.out.println("Ventos a 25km, OK.");
    }
}
