package xyz.curuhome.chap102;

import java.io.IOException;
public class SystemInputTest1 {
    public static void main(String[] args) {
        char cin='/';
        try{
            cin=(char)System.in.read();     // A (read -> return int)
            System.out.println(cin);        // A
            System.out.println((int)cin);   // 65 (A->65, a->97(ASCII CODE))
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
