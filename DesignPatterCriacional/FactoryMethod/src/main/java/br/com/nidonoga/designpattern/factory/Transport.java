package br.com.nidonoga.designpattern.factory;

import br.com.nidonoga.designpattern.factory.vehicles.IVehicle;

public abstract class Transport {

    void startTransport() {

        IVehicle vehicle = createTransport();
        vehicle.startRoute();

    }

    protected abstract IVehicle createTransport();

}
