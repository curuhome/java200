package xyz.curuhome.chap097;

public class StringBuilderMain {
    public static void main(String[] args) {
        //synchronized 안한 StringBuffer
        StringBuilder sbu = new StringBuilder();
        sbu.append("I").append(" go").append(" to the shcool.");
        System.out.println(sbu);
        /* I go to the shcool. */

        sbu.replace(7,11,"");
        System.out.println(sbu);
        /* I go to shcool. */

        sbu.reverse();
        System.out.println(sbu);
        /* .loochs ot og I */

        sbu.deleteCharAt(3);
        System.out.println(sbu);
        /* .lochs ot og I */

        sbu.delete(1,3);
        System.out.println(sbu);
        /* .chs ot og I */

        sbu.substring(0);
        System.out.println(sbu);
        /* .chs ot og I */

        sbu.substring(0,4);
        System.out.println(sbu);
        /* .chs ot og I */

//        String sbu2 = sbu.substring(0,4);
//        System.out.println(sbu2);
    }
}
