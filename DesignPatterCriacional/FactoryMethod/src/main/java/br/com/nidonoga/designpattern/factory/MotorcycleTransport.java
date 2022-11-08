package br.com.nidonoga.designpattern.factory;

import br.com.nidonoga.designpattern.factory.vehicles.IVehicle;
import br.com.nidonoga.designpattern.factory.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
