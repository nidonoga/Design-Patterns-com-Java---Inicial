package br.com.nidonoga.designpattern.abstractfactory.factories;

import br.com.nidonoga.designpattern.abstractfactory.aircrafts.IAircraft;
import br.com.nidonoga.designpattern.abstractfactory.landvehicles.ILandVehicle;
import br.com.nidonoga.designpattern.abstractfactory.watervehicles.IWaterVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();

    IWaterVehicle createTransportWaterVehicle();
}
