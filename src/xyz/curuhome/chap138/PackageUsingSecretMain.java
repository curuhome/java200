package xyz.curuhome.chap138;
import xyz.curuhome.chap138.one.MyMotherSecret;
import xyz.curuhome.chap138.two.MyTopSecret;

public class PackageUsingSecretMain {
    public static void main(String[] args) {
        MyMotherSecret mother = new MyMotherSecret();
        MyTopSecret my = new MyTopSecret();
//        private,(default),protected가 안보임
        System.out.println(mother.getSlushMoney());//public
        /* 300.0 */

        System.out.println(mother);//public
        /* 나이:35,혈액형: A,비자금:300.0 */

        System.out.println(my.getSlushMoney());//public
        /* 200.0 */

        System.out.println(my);//public
        /* 나이:28, 비자금:200.0, 남자친구:Jim */
    }
}
