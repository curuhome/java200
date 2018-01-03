package xyz.curuhome.chap089;

public class BitShifting {
    private static final int BITMASK=1;

    public  String makeBit(int value){
        //char배열을 String으로 만들기 위해
        char[] val=new char[8];
        for(int i=7; i>=0; i--){
            if((value & BITMASK) ==1){ // 비트연산자 : 논리곱(and) & 각 비트를 비교하여 양쪽 모두 1이면 1 아니면 0
                val[i]='1';     // (1 & 1)일때만 : 1 그외 0
            }else{
                val[i]='0';	    // (1 & 1)일때만 : 1 그외 0
            }
            value >>>= 1;       // value=value>>>1; 부호무시(부호와 관계없이) 오른쪽 이동
        }
        return new String(val); // char배열을 String으로
    }
    //양수면 오른쪽 이동 음수면 왼쪽이동
    public  String makeBit(int orgin,int shift){
        String temp="";
        if(shift>=0){
            temp=makeBit(orgin>>shift);
        }else{
            temp=makeBit(orgin<<(-shift));
        }
        return temp;
    }
}
