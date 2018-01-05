package xyz.curuhome.chap095;

public class StringVsStringBuffer {
    public static void main(String[] args) {
//        String str=new String();
        String str = "";
        StringBuffer sb=new StringBuffer();
        System.out.println(str.hashCode());
        /* 0 */
        str.concat("I").concat(" go").concat(" to shcool.");
        System.out.println(str.hashCode());
        /* 0 */
        str=str.concat("I").concat(" go").concat(" to shcool.");
        System.out.println(str.hashCode());
        /* 910426828 */
        System.out.println(sb.hashCode());
        /* 1163157884 */

        sb.append("I").append(" go").append(" to shcool.");
        System.out.println(sb.toString());
        /* I go to shcool. */

        System.out.println(sb.hashCode());
        /* 1163157884 */

        replaces(str);  // immutable
        reverse(sb);    // mutable
        System.out.println(str);
        /* I go to shcool. */
        System.out.println(sb.toString());
        /* .loochs ot og I */
    }
    private static void reverse(StringBuffer sb){
        sb.reverse();
    }
    private static void replaces(String str){
        str.concat("GoGo");
    }
}
