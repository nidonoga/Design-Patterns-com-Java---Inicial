package br.com.nidonoga.designpattern.builder.builders;

import br.com.nidonoga.designpattern.builder.components.CarType;
import br.com.nidonoga.designpattern.builder.components.Color;
import br.com.nidonoga.designpattern.builder.components.Engine;
import br.com.nidonoga.designpattern.builder.components.Transmission;

public interface IBuilder {

    void setCarType(CarType type);

    void setSeats(int seats);

    void setTransmission(Transmission transmission);

    void setEngine(Engine engine);

    void setColor(Color color);


}
