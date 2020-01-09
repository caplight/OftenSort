package lanqiao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class shopping {
    private static Map<Integer,String> map=new HashMap<Integer, String>();
    private static int[] count=null;
    private static int[] all=null;
    private static int num=0;
    private static int sum=0;
    private static int max=1000;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        num=scanner.nextInt();
        count=new int[num];
        all=new int[num];
        for (int i=0;i<num;i++){
            all[i]=scanner.nextInt();
        }
        backTrack(0);
        System.out.println(sum);
        if (sum==0){

        }else {
            for (int i=0;i<all.length;i++){
                System.out.println(map.get(i));
            }
        }
    }

    private static void backTrack(int now){
        if (now==max){
            String a="";
            for (int i=0;i<all.length;i++){
                a+=count[i]+" ";
            }
            if (map.containsValue(a)){

            }else {
            map.put(sum,a);
            sum+=1;
            }

        }else {
            for (int i=0;i<all.length;i++){
                if (now+all[i]<=max){
                    //System.out.println(now);
                    count[i]+=1;
                    backTrack(now+all[i]);
                    count[i]-=1;
                }
            }
        }
    }
}
