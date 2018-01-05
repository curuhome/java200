package xyz.curuhome.chap093;

public class StringMethodMain1 {
    public static void main(String[] args) {
        // 1. String - immutable
        String st="hello";
        System.out.println(st+st.hashCode());
        /* hello99162322 */
        st.replace('h','H');    // immutable hello
        System.out.println(st+st.hashCode());
        /* hello99162322 */
        st=st.replace('h','H'); //st에 할당을 받아야 한다.
        System.out.println(st+st.hashCode());
        /* Hello69609650 */

        // 2. String의 위치 method index는 0부터
        String test1  = "Hello my nick name is totoro.\n";
        test1        += "I,m 29 years old.\n";
        test1        += "I'm a good boy.";
        System.out.println("이글의 길이 : "+test1.length());
        /* 이글의 길이 : 63 */
        //System.out.println("첫 번째 .위치  : "+test1.indexOf('H'));    //-1이면 없다.
        /* 첫 번째 .위치  : 0 */
        System.out.println("첫 번째 .위치  : "+test1.indexOf('.'));      //-1이면 없다.
        /* 첫 번째 .위치  : 28 */
        System.out.println("마지막째 .위치  : "+test1.lastIndexOf('.'));
        /* 마지막째 .위치  : 62 */
        System.out.println("첫 번째 years위치  : "+test1.indexOf("years"));
        /* 첫 번째 years위치  : 37 */

        // 3. 위치에 있는 한글자씩  부르기
        for(int i=0;i<test1.length();i++){
            System.out.print(test1.charAt(i));
        }
        /*
            Hello my nick name is totoro.
            I,m 29 years old.
            I'm a good boy.
        */

        // 4. 원하는 문자열  배열
        String [] a =test1.split("\n");
        System.out.println(a.length);
        System.out.println(a[0]);
        /*
            3
            Hello my nick name is totoro.
         */

        // 5. 문자열 나누기 index는 0부터 시작한다.
        String b  = test1.substring(4,8);
        String c  = test1.substring(0,5);
        String bb = test1.substring(4);
        System.out.println(b);  // 4번째 문자부터 (8-1)번째 문자까지
        /* o my */
        System.out.println(c);  // 0번째 문자부터 (5-1)번째 문자까지
        /* Hello */
        System.out.println(bb); // 0번째 문자부터 (4-1)번째 문자까지
        /*
            o my nick name is totoro.
            I,m 29 years old.
            I'm a good boy.
         */
    }
}
