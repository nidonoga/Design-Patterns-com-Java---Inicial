package br.com.nidonoga.designpattern.factory;

import br.com.nidonoga.designpattern.factory.vehicles.Bike;
import br.com.nidonoga.designpattern.factory.vehicles.IVehicle;

public class BikeTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
