package xyz.curuhome.chap080;

public class CarMain {

    public static void main(String[] args) {

        Car car1=new Car();
        car1.speedUp();
        car1.speedDown();
        car1.speedUp();
        System.out.println(car1.curSpeed());
        /* 5 */

        car1.turnDirect(-30);
        car1.turnDirect(10);
        System.out.println(car1.curDirect());
        /* -20 */
    }
}