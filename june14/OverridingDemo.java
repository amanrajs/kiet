package june14;

abstract class Car{
    public abstract void move();
}

class TataCar extends  Car{

   public void move(){
        System.out.println("\n\t This car moves fast...");
    }
}

class BMWCar extends Car{
    public void move(){
        System.out.println("\n\t This car moves smooth and fast...");
    }
}

class HondaCar extends Car{

}

public class OverridingDemo {
    public static void main(String[] args) {

            Car car = new TataCar();
            car.move();

            car = new BMWCar();
            car.move();

    }
}
