package xyz.curuhome.chap102;

public class StringInput {
    public static int readInt(){
        int temp = Integer.parseInt(readString());
        return temp;
    }
    public static String readString(){
        byte[] b = new byte[40];
        int len=0;

        try{
            /* 입력된 문자열을 byte 타입의 배열에 담는다 */
            len = System.in.read(b);
        } catch(Exception e){
            System.out.println("입력실패");
        }
        /* 위에서 담은 배열을 String 타입으로 바꾸려고 String 객체 생성 */
        String str = new String(b,0,len-1); //'\n'이 붙어 있어서 1를 뺀다.
        return str;
    }
}
