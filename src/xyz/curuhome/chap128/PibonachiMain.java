package xyz.curuhome.chap128;

public class PibonachiMain {
    public static void main(String[] args) {
        Pibonachi pibo=new Pibonachi();
        for(int i=1;i<36;i++){
            double la=System.currentTimeMillis();
            int aa=pibo.pibo(i);
            double ab=pibo.golden(i);
            double lb=System.currentTimeMillis();
            System.out.println(ab+"  "+aa+" : "+(lb-la));
        }
        /*
            1.0  1 : 0.0
            1.0  1 : 0.0
            0.6666666666666666  2 : 0.0
            0.6  3 : 0.0
            0.625  5 : 0.0
            0.6153846153846154  8 : 0.0
            0.6190476190476191  13 : 0.0
            0.6176470588235294  21 : 0.0
            0.6181818181818182  34 : 0.0
            0.6179775280898876  55 : 0.0
            0.6180555555555556  89 : 0.0
            0.6180257510729614  144 : 0.0
            0.6180371352785146  233 : 0.0
            0.6180327868852459  377 : 0.0
            0.6180344478216818  610 : 0.0
            0.6180338134001252  987 : 0.0
            0.6180340557275542  1597 : 0.0
            0.6180339631667066  2584 : 0.0
            0.6180339985218034  4181 : 0.0
            0.618033985017358  6765 : 0.0
            0.6180339901755971  10946 : 0.0
            0.6180339882053251  17711 : 0.0
            0.618033988957902  28657 : 0.0
            0.6180339886704432  46368 : 0.0
            0.6180339887802427  75025 : 0.0
            0.618033988738303  121393 : 16.0
            0.6180339887543226  196418 : 0.0
            0.6180339887482036  317811 : 16.0
            0.6180339887505408  514229 : 31.0
            0.6180339887496481  832040 : 31.0
            0.618033988749989  1346269 : 63.0
            0.6180339887498588  2178309 : 93.0
            0.6180339887499086  3524578 : 172.0
            0.6180339887498896  5702887 : 203.0
            0.6180339887498969  9227465 : 360.0
         */
    }
}