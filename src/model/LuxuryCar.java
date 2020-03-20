package model;

import java.util.logging.Logger;


public class LuxuryCar extends Car {

    public LuxuryCar() {
        super(CarType.LUXURY);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("this is sedan Car");

    }
}
