package br.com.nidonoga.designpattern.builder.builders;

import br.com.nidonoga.designpattern.builder.cars.SportCar;
import br.com.nidonoga.designpattern.builder.components.CarType;
import br.com.nidonoga.designpattern.builder.components.Color;
import br.com.nidonoga.designpattern.builder.components.Engine;
import br.com.nidonoga.designpattern.builder.components.Transmission;

public class SportCarBuilder implements IBuilder {

    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private Color color;


    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    public SportCar getResult(){
        return new SportCar(carType, seats, engine, transmission, color);
    }

}
