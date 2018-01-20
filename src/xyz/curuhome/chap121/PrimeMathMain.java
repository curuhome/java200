package xyz.curuhome.chap121;

public class PrimeMathMain {
    public static void main(String[] args) {
        PrimeMath pm = new PrimeMath();
        pm.printPrime(pm.commonDividors(10));
        /* 4개  : [  1 , 2 , 5 , 10  ] */

        System.out.println("----------------------------------");
        System.out.println("7880599가 솟수인가? " + pm.isPri(7880599));
        /* 7880599가 솟수인가? false */

        for(int i=1;i<=10;i++){
            System.out.print(i+" : ");pm.printPrime(pm.commonDividors(i));
        }
        /*
            1 : 1개  : [  1  ]
            2 : 2개  : [  1 , 2  ]
            3 : 2개  : [  1 , 3  ]
            4 : 3개  : [  1 , 2 , 4  ]
            5 : 2개  : [  1 , 5  ]
            6 : 4개  : [  1 , 2 , 3 , 6  ]
            7 : 2개  : [  1 , 7  ]
            8 : 4개  : [  1 , 2 , 4 , 8  ]
            9 : 3개  : [  1 , 3 , 9  ]
            10 : 4개  : [  1 , 2 , 5 , 10  ]
         */

        System.out.println("\n약수개수 구하고 소수구하기");
        for(int i=1;i<=10;i++){
            if(pm.divisors(i)==2){
                System.out.println(i+":는 약수의 개수가 2개: 소수 ");
            }
        }
        /*
            2:는 약수의 개수가 2개: 소수
            3:는 약수의 개수가 2개: 소수
            5:는 약수의 개수가 2개: 소수
            7:는 약수의 개수가 2개: 소수
         */
    }
}
