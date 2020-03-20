package test;

import model.CarFactory;
import model.CarType;
import model.SedanCar;

public class TestFactoryPattern {
    public static void main(String[] args) throws Exception {
        System.out.println(CarFactory.carBuilder(CarType.LUXURY));
        System.out.println(CarFactory.carBuilder(CarType.SEDAN));
        System.out.println(CarFactory.carBuilder(CarType.SMALL));

    }
}
