package model;

public class CarFactory  {
    public static Car carBuilder(CarType model) throws Exception {
        Car car;
        switch (model){
            case SEDAN:
                car=new SedanCar();
                break;
            case SMALL:
                car=new SmallCar();
                break;
            case LUXURY:
                car=new LuxuryCar();
                break;
            default:
            {
                System.out.println("this type car is not defined");
                throw new Exception("fdf");
            }


        }
        return car;
    }
}
