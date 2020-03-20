package model;

import java.util.logging.Logger;

public class SedanCar extends Car {

    public SedanCar(){
        super(CarType.SEDAN);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("this is sedan Car");

    }
}
