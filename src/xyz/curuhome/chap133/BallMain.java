package xyz.curuhome.chap133;

public class BallMain {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        b1.printName();
        /* name :Ball */
        System.out.println(b1.getName());
        /* Ball */

        BaseBall bs1=new BaseBall();
        bs1.printName();
        /* BaseBall */
        bs1.printSize();
        /* BaseBall: 11.0 */

        SockerBall cs1=new SockerBall();
        cs1.printName();
        /* SockerBall */
        cs1.printSize();
        /* SockerBall: 25.0 */

        Ball b2= new BaseBall();//reference 다형성
        BaseBall b3= new BaseBall();//reference 다형성
        print(b3);//argument 다형성
        /*
            BaseBall
            BaseBall: 11.0
         */
    }
    public static void print(Ball b){//argument 다형성
        b.printName();//overring--> method 다형성
        if(b instanceof BaseBall){//instance가 어떤것?
            BaseBall bb=(BaseBall)b;//casting
            bb.printSize();
        }else if(b instanceof SockerBall){
            SockerBall bb=(SockerBall)b;//casting
            bb.printSize();
        }
    }
}
