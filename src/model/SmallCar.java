package model;

import java.util.logging.Logger;

public class SmallCar extends Car {
    public SmallCar(){
        super(CarType.SMALL);
        construct();
    }
    @Override
    protected void construct() {
//        System.err.println("this is Small car");
        Logger.getLogger(Logger.GLOBAL_LOGGER_NAME,"this is small car");
    }
}
