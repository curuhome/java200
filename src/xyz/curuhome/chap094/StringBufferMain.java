package xyz.curuhome.chap094;

public class StringBufferMain {
    public static void main(String[] args) {
        // StringBuffer 생성
        StringBuffer sb1=new StringBuffer();
        // 1. 계속 붙이는 함수 mutable
        sb1.append("안녕하세요.").append("또 만나요.").append("모두를 사랑해요. 기다려봐.");
        System.out.println(sb1.toString()+sb1.hashCode());
        /* 안녕하세요.또 만나요.모두를 사랑해요. 기다려봐.1163157884 */

        // 2. replace
        sb1.replace(0,2,"나 보기가 역거워");
        System.out.println(sb1.toString()+sb1.hashCode());
        /* 나 보기가 역거워하세요.또 만나요.모두를 사랑해요. 기다려봐.1163157884 */

        // 3. reverse
        sb1.reverse();
        System.out.println(sb1.toString());
        /* .봐려다기 .요해랑사 를두모.요나만 또.요세하워거역 가기보 나 */

        // 4. delete
        sb1.delete(10,15);
        System.out.println(sb1.toString());
        /* .봐려다기 .요해랑.요나만 또.요세하워거역 가기보 나 */

        // 5. cal by reference, shallow copy
        replaces(sb1);
        System.out.println(sb1.toString());
        /* GoGo기가 역거워하세요.또 만나요.랑해요. 기다려봐. */
    }
    private static void replaces(StringBuffer sb){
        sb.reverse();
        sb.replace(0,3,"GoGo");     //0부터 2까지를 GoGo로
    }
}
