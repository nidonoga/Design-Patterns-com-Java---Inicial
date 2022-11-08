package br.com.nidonoga.designpattern.factory;

import br.com.nidonoga.designpattern.factory.vehicles.Car;
import br.com.nidonoga.designpattern.factory.vehicles.IVehicle;

public class CarTransport extends  Transport {

    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
