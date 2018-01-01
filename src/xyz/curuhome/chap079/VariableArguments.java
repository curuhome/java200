package xyz.curuhome.chap079;

public class VariableArguments {
    public static void main(String[] args) {
        print(3,4,5,6,7);
        /* [3] [4] [5] [6] [7] */

        int[] aa = {5,4,7,1,9,12,0,3,2,6};
        print(aa);
        /* [5] [4] [7] [1] [9] [12] [0] [3] [2] [6] */

        int a = 4; //배열이 아닌데도 가능
        print(a);
        /* [4] */

        String [ ] sNames={"소철","무궁화","개나리","철쭉"};
        print(sNames);
        /* [소철] [무궁화] [개나리] [철쭉] */

        print("동백"); //prinf 원리
        /* [동백] */

        Flower flo = Flower.LILY;
        print(flo);
        /* [LILY] */

        print(Flower.values());
        /* [ROSE] [LILY] [TULIP] [AZALEA] */

        String s="Welcome to the Java Programming";
        //String[] ss = s.split(" ");//String[] 리턴
        print(s.split(" "));
        //print(ss);
    }
    public static void print(int ... p){
        for(int en : p){
            System.out.printf("[%d] ",en);
        }
        System.out.printf("%n");
    }
    public static void print(String ... p){
        for(String en : p){
            System.out.printf("[%s] ",en);
        }
        System.out.printf("%n");
    }
    public static void print(Flower ... p){
        for(Flower en : p){
            System.out.printf("[%s] ",en);
        }
        System.out.printf("%n");
    }
}
