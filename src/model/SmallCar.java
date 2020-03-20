package model;

import java.util.logging.Logger;

public class SmallCar extends Car {
    public SmallCar(){
        super(CarType.SMALL);
        construct();
    }
    @Override
    protected void construct() {
        System.out.println("this is sedan Car");

    }
}
