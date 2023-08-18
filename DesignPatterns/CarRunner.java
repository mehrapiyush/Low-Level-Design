import FactoryPattern.Car;
import FactoryPattern.CarFactory;
import FactoryPattern.CarType;

public class CarRunner {
    public static void main(String args[])  //static method
    {
        CarFactory carFactory = new CarFactory();
        Car type = carFactory.getCarByType(CarType.MERCEDES,"hatchback");
        System.out.println(type.getType());

        TestSingleton testSingleton = TestSingleton.getInstance();
        System.out.println(testSingleton);
    }
}
