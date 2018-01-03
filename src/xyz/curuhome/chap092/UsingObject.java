package xyz.curuhome.chap092;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
public class UsingObject {
    public static void main(String[] args) {

        Object obj1=new Object();
        Object obj2=new Object();

        System.out.println(obj1.hashCode());                //native
        /* 1163157884 */
        System.out.println(obj1==obj2);                     //객체는 고유
        /* false */
        System.out.println(obj1.equals(obj2));              //객체는 고유
        /* false */
        System.out.println(obj1);
        /* java.lang.Object@4554617c */
        System.out.println(obj2.toString());
        /* java.lang.Object@74a14482 */

        System.out.println(obj1.getClass().getName());      //클래스이름
        /* java.lang.Object */
        String str=obj1.getClass().getName() + "@"
                + Integer.toHexString(obj1.hashCode());
        System.out.println(str);                            //클래스이름@16진수해쉬코드
        /* java.lang.Object@4554617c */


        Object objstr = new String("Good");        //다형성
        System.out.println(objstr.toString());
        /* Good */
        System.out.println(objstr instanceof Object);
        /* true */
        System.out.println(objstr instanceof String);
        /* true */


        Class classes = obj1.getClass();
        System.out.println(classes.getName());              //클래스이름
        /* java.lang.Object */

        System.out.println("--------constructor-------");
        Constructor[] constructor = classes.getDeclaredConstructors();
        for(Constructor con: constructor){
            System.out.println(con.getName());
        }
        /* java.lang.Object */

        System.out.println("--------Method-------");
        Method[] method = classes.getMethods();
        for(Method me: method){
            System.out.println(me.getName());
        }
        /*
        wait
        wait
        wait
        equals
        toString
        hashCode
        getClass
        notify
        notifyAll
         */
    }
}
