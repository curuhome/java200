package xyz.curuhome.chap083;

import java.lang.reflect.*;
import xyz.curuhome.chap080.Car;
public class CarInstanceMain {
    //section 080 - Car
    public static void main(String[] args) {

        Car car1=new Car();
//        Car car2=new Car();
//        Car car3=new Car();

        System.out.println(car1);
//        System.out.println(car1.toString());
        /* xyz.curuhome.chap080.Car@4554617c */

        System.out.println(Integer.toHexString(car1.hashCode()));
        /* 4554617c */

        //java.lang.reflect.* --> Reflection class에 대한 정보
        Class ca = car1.getClass();
        Field[] fie = ca.getDeclaredFields();
        for(int i=0;i<fie.length;i++){
            System.out.println(fie[i].getName());
        }
        /*
        speed
        direction
        */

        Method[] me = ca.getDeclaredMethods();//static 메서드 포함
        for(int i=0;i<me.length;i++){
            System.out.print(me[i].getName()+"  ");
            System.out.print(Modifier.isStatic(me[i].getModifiers())+" ");
            System.out.println(Modifier.isPublic(me[i].getModifiers()));
        }
        /*
        curSpeed  false true
        speedDown  false true
        turnDirect  false true
        curDirect  false true
        speedUp  false true
         */

        Constructor[] con = ca.getDeclaredConstructors();
        for(int i=0;i<con.length;i++){
            System.out.println(con[i].getName());
        }
        /*
        xyz.curuhome.chap080.Car
         */
    }
}
