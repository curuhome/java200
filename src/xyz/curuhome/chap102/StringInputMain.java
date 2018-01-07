package xyz.curuhome.chap102;

public class StringInputMain {
    public static void main(String[] args) {
        System.out.println(StringInput.readString());   // abc -> abc
        int a = StringInput.readInt();                  // 1(int 범위의 수)
        int b = StringInput.readInt();                  // 2(int 범위의 수)
        System.out.println(a+b);                        // 3
    }
}
