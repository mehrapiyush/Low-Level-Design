package FactoryPattern;

public class CarFactory {
    public Car getCarByType(CarType type, String typeOfCar){
        if(type == CarType.MERCEDES){
            return new Mercedes(type.toString(),typeOfCar);
        }
        if(type == CarType.BMW){
            return new BMW(type.toString(),typeOfCar);
        }
        return null;
    }
}
