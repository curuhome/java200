package xyz.curuhome.chap102;

import java.io.IOException;
public class SystemInputTest2 {
    public static void main(String[] args) {
        char cin='0';
        try{
            while(cin!='/'){                        // / -> end
                do{
                    cin=(char)System.in.read();     // A (read -> return int)
                    System.out.print(cin);          // A
                }while(cin=='\n' | cin=='\r');      // (Loop)
            }
        }catch(IOException e){                      // 에외처리 read 때문에
            System.out.println(e.getMessage());
        }
    }
}
