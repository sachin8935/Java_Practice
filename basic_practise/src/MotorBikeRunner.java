public class MotorBikeRunner {
    public static void main(String[] args){
        Vehicle v1= new Bike();
        Vehicle v2 = new MotorCar();
        v1.start();
        v2.start();
    }
}
