package Round1.StrsDeal;

import java.util.Scanner;

/*
        在实际的开发工作中，对字符串的处理是最常见的编程任务。本题目即是要求程序对用户输入的串进行处理。具体规则如下：
        1.	把每个单词的首字母变为大写。
        2.	把数字与字母之间用下划线字符（_）分开，使得更清晰
        3.	把单词中间有多个空格的调整为1个空格。

        例如：
        用户输入：
        you and     me what  cpp2005program
        则程序输出：
        You And Me What Cpp_2005_program

        用户输入：
        this is     a      99cat
        则程序输出：
        This Is A 99_cat

*/
public class StrDo {
    private static String string="";
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        string=scanner.nextLine();
        char[] chars=string.toCharArray();
        if (chars[0]>=97||chars[0]<=122){chars[0]-=32;}
        for (int i=0;i<chars.length;i++){
            if (i!=0){
                /*if ()*/
            }
        }
    }
}
