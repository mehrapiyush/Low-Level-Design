package FactoryPattern;

import singletonpattern.TestSingleton;

public abstract class Car {
    String name;
    String type;
    public Car(String name,String type){
        this.name = name;
        this.type = type;
    }
    public String getType(){
        return type;
    }

    public static class CarRunner {
        public static void main(String args[])  //static method
        {
            CarFactory carFactory = new CarFactory();
            Car type = carFactory.getCarByType(CarType.MERCEDES,"hatchback");
            System.out.println(type.getType());

            TestSingleton testSingleton = TestSingleton.getInstance();
            System.out.println(testSingleton);
        }
    }
}
