package SortJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ch06plus {
    public static void main(String[] args) {
        int m=0,s[],i=0,count[];
        //Map<Integer,Integer> integerIntegerMap=new HashMap<Integer,Integer>();
        Scanner scan = new Scanner(System.in);
        m=scan.nextInt();
        s=new int[m];
        count=new int[m];
        while (scan.hasNext()){
            s[i]=scan.nextInt();
            //integerIntegerMap.put(s[i],0);
            count[i]=0;
            i++;
            if (i>m-1){
                break;
            }
        }
        for (int p=0;p<s.length;p++){
            backtrack(s,count,0,s[p],p);
            for (int q=0;q<count.length;q++){
                count[q]=0;
            }
        }
    }
    public static void backtrack(int[] s,int[] count,int sum,int input,int num){
        count[num]++;
        sum+=input;
       // System.out.println("sum"+sum);
        if (sum==1000){
            for (int i=0;i<count.length;i++){
                System.out.print(count[i]+" ");
            }
            count[num]--;
            sum-=input;
            System.out.println(" ");
            return;
        }else if (sum>1000){
            count[num]--;
            sum-=input;
            return;
        }else {
            for (int i=0;i<s.length;i++){
                backtrack(s,count,sum,s[i],i);
            }
        }
    }
}
