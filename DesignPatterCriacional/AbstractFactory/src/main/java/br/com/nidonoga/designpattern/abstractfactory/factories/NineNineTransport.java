package br.com.nidonoga.designpattern.abstractfactory.factories;

import br.com.nidonoga.designpattern.abstractfactory.aircrafts.Helicopter;
import br.com.nidonoga.designpattern.abstractfactory.aircrafts.IAircraft;
import br.com.nidonoga.designpattern.abstractfactory.landvehicles.ILandVehicle;
import br.com.nidonoga.designpattern.abstractfactory.landvehicles.Motorcycle;
import br.com.nidonoga.designpattern.abstractfactory.watervehicles.IWaterVehicle;
import br.com.nidonoga.designpattern.abstractfactory.watervehicles.JetSki;

public class NineNineTransport implements ITransportFactory {

    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }

    @Override
    public IWaterVehicle createTransportWaterVehicle() {
        return new JetSki();
    }
}
