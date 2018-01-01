package xyz.curuhome.chap078;

import java.util.*;
public class EnhancedFor {
    public static void main(String[] args) {
        int[] aa = {5,4,7,1,9,12,0,3,2,6};
        for(int en=0; en<aa.length; en++){
            System.out.print("["+aa[en]+"] ");
        }
        System.out.println();
        /* [5] [4] [7] [1] [9] [12] [0] [3] [2] [6] */

        for(int en : aa){
            System.out.printf("[%d] ",en);
        }
        System.out.println();
        /* [5] [4] [7] [1] [9] [12] [0] [3] [2] [6] */

        String[] sNames={"소철","무궁화","개나리","철쭉"};
        for(String sName : sNames){
            System.out.printf("[%s] ",sName);
        }
        System.out.println();
        /* [소철] [무궁화] [개나리] [철쭉]  */

        int[][] bb = {{3,4,5},{7,8,9},{1,2,3}};
        for(int[] outs : bb){
            for(int ins : outs){
                System.out.printf("[%d] ",ins);
            }
            System.out.println();
        }
        System.out.println();
        /*
        [3] [4] [5]
        [7] [8] [9]
        [1] [2] [3]
         */

        ArrayList<String> list = new ArrayList<>();
        list.add("소철");
        list.add("무궁화");
        list.add("개나리");
        list.add("철쭉");
        for(String sName : list){
            System.out.printf("[%s] ",sName);
        }
        System.out.println();
        /*
        [소철] [무궁화] [개나리] [철쭉]
         */

        for(Season se : Season.values()){
            System.out.println(se);//Autumn
        }
    }
}
