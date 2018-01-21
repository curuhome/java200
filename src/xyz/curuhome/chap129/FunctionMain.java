package xyz.curuhome.chap129;

public class FunctionMain {
    public static void main(String[] args) {
        //^를 승(승수)로 보자.
        Function funct=new Function();
        double [] m={1,-1,0,-1};
        //f(x)=1*x^3-1*x^2+0*x^1-1
        funct.setM(m);
        funct.setX(2.0); //f(2)
        System.out.println("f(2.0)= "+funct.functs());
        /* f(2.0)= 3.0 */

        double []m1={1,-1,0,-1};
        //f(x)=1*x^3-1*x^2+0*x^1-1
        funct.setM(m1);
        funct.setX(2/3.0);  //f(2/3.0)
        System.out.println("f(2/3.0)= "+funct.functs());
        /* f(2/3.0)= -1.1481481481481481 */
    }
}
