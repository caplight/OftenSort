package SortJava;

import java.lang.reflect.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ch06 {
    public static void main(String[] args) {
        //num:s的长度，count:子集和，sum剪枝
        int num=0,count=0,sum=0;
        int i=0;
        int[] s;
        Scanner scan = new Scanner(System.in);
        num=scan.nextInt();
        count=scan.nextInt();
        s=new int[count];
        int[] printer=new int[count];
        while (scan.hasNext()){
            s[i]=scan.nextInt();
            i++;
            if (i>num-1){
                break;
            }
        }
        //排除全加起来小于子集和的结果
        for (int a=0;a<s.length;a++){
            sum+=s[a];
        }
        if (sum<count){
            System.out.print("No solution!");
            return;
        }
        backtrack(s,printer,count,0,0);
    }
    public static void backtrack(int[] input,int[] record,int key,int sum,int num) {
        //剪枝
        if(num == input.length){
            return;
        }else{
            //子集
            for(int i=0; i<=1; i++){
                sum += i*input[num];
                record[num] = i;
                //如果当前和为要求子集和
                if(sum == key){
                    for(int j=0; j<=num; j++){
                        if(record[j]==1)
                            System.out.print(input[j]+" ");
                    }
                    System.out.println();
                }
                if(sum<key){
                    backtrack(input, record, key, sum, num+1);
                }
                sum -= i*input[num];
            }
        }
    }
}
