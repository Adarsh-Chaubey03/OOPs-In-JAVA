package adarsh.I_Interfaces.A_Introduction;

public class Main {
    public static void main(String[] args) {
   //      Car car = new Car();   same goes with
        Engine car = new Car();

        car.acc();
        car.start();
        car.stop();

        System.out.println("_ -_ -_..now printing from nice car");
        NiceCar  n_car = new NiceCar();
        n_car.start();
        n_car.stopMusic();
    }
}
