package br.com.nidonoga.designpattern.abstractfactory.factories;

import br.com.nidonoga.designpattern.abstractfactory.aircrafts.Airplane;
import br.com.nidonoga.designpattern.abstractfactory.aircrafts.IAircraft;
import br.com.nidonoga.designpattern.abstractfactory.landvehicles.Car;
import br.com.nidonoga.designpattern.abstractfactory.landvehicles.ILandVehicle;
import br.com.nidonoga.designpattern.abstractfactory.watervehicles.Boat;
import br.com.nidonoga.designpattern.abstractfactory.watervehicles.IWaterVehicle;

public class BoatTransport implements ITransportFactory {
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }

    @Override
    public IWaterVehicle createTransportWaterVehicle() {
        return new Boat();
    }
}
