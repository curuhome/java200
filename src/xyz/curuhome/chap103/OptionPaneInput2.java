package xyz.curuhome.chap103;

import javax.swing.*;
public class OptionPaneInput2 {
    /* showMessageDialog available optionType */
    static int[] mDia={
            JOptionPane.ERROR_MESSAGE,JOptionPane.INFORMATION_MESSAGE,
            JOptionPane.WARNING_MESSAGE,JOptionPane.QUESTION_MESSAGE,
            JOptionPane.PLAIN_MESSAGE };
    static String[] sDia={"ERROR_MESSAGE","INFORMATION_MESSAGE",
                          "WARNING_MESSAGE","QUESTION_MESSAGE",
                          "PLAIN_MESSAGE"};

    /* showConfirmDialog available optionType */
    static int [] mDis={
            JOptionPane.YES_OPTION,JOptionPane.NO_OPTION,
            JOptionPane.CANCEL_OPTION,JOptionPane.OK_OPTION,
            JOptionPane.CLOSED_OPTION };
    static String [] sDis={"YES_OPTION","NO_OPTION",
                           "CANCEL_OPTION","OK_OPTION",
                           "CLOSED_OPTION"};

    public static void main(String[] args) {
        showMessageDialog();
        showConfirmDialog();
        showOptionDialog();
        System.exit(1);
    }
    private static void showMessageDialog(){
        //showMessageDialog(Component parentComponent, Object message, String title, int messageType)
        for(int i=0;i<mDia.length;i++){
            JOptionPane.showMessageDialog(null, sDia[i], "MD_"+sDia[i], mDia[i]);
        }
    }
    private static void showConfirmDialog(){
        int num = 0;
        //showConfirmDialog(Component parentComponent, Object message, String title, int optionType)
        for(int i=0;i<mDis.length;i++){
            num=JOptionPane.showConfirmDialog(null, sDis[i], "CD_"+sDis[i], mDis[i]);
            System.out.println(num);
        }
    }
    private static void showOptionDialog(){
        //showConfirmDialog, showMessageDialog, showInputDialog를 모두 통합
        int num=0;
        // showOptionDialog(Component parentComponent, Object message,
        // String title, int optionType, int messageType,
        // Icon icon, Object[] options, Object initialValue)
        for(int i=0;i<mDia.length;i++){  //5
            for(int j=0;j<mDis.length;j++){//5
                num=JOptionPane.showOptionDialog(null, "원하는 것을 선택하시오.",
                        "showOptionDialog", mDis[j], mDia[i],
                        null, sDis, sDis[j]);
                System.out.println(num);//25가지의 경우수
            }
        }
    }
}
