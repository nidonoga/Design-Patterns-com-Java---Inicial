package br.com.nidonoga.designpattern.abstractfactory.app;

import br.com.nidonoga.designpattern.abstractfactory.aircrafts.IAircraft;
import br.com.nidonoga.designpattern.abstractfactory.factories.ITransportFactory;
import br.com.nidonoga.designpattern.abstractfactory.landvehicles.ILandVehicle;
import br.com.nidonoga.designpattern.abstractfactory.watervehicles.IWaterVehicle;

public class Application {

    private ILandVehicle vehicle;

    private IAircraft aircraft;

    private IWaterVehicle waterVehicle;

    public Application(ITransportFactory factory) {
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
        waterVehicle = factory.createTransportWaterVehicle();
    }

    public void startRout() {
        vehicle.startRoute();
        aircraft.startRoute();
        waterVehicle.startRoute();
    }

}
