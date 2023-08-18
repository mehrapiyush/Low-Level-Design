package FactoryPattern;

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

}
