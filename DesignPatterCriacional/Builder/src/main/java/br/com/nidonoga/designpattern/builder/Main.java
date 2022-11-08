package br.com.nidonoga.designpattern.builder;

import br.com.nidonoga.designpattern.builder.builders.CarBuilder;
import br.com.nidonoga.designpattern.builder.builders.SportCarBuilder;
import br.com.nidonoga.designpattern.builder.builders.TruckBuilder;
import br.com.nidonoga.designpattern.builder.cars.Car;
import br.com.nidonoga.designpattern.builder.cars.SportCar;
import br.com.nidonoga.designpattern.builder.cars.Truck;
import br.com.nidonoga.designpattern.builder.director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        // criando carro
        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);

        Car car = builder.getResult();
        System.out.println(car.getCarType() + " procuzido.");

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);

        Truck truck = truckBuilder.getResult();
        System.out.println("Caminhao: " + truck.result());


        SportCarBuilder sportCarBuilder = new SportCarBuilder();
        director.constructSportCar(sportCarBuilder);

        SportCar sportCar = sportCarBuilder.getResult();
        System.out.println(sportCar.getCarType() + " - " + sportCar.getColor());



    }
}