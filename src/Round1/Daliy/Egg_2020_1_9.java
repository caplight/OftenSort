package Round1.Daliy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Egg_2020_1_9 {
    private static  int K=0,N=0,F=0,res=1;;
    //private static Map<Integer,Integer> integerMap;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        K=scanner.nextInt();//K¸ö¼¦µ°
        N=scanner.nextInt();//N²ãÂ¥
        //integerMap=new HashMap<Integer, Integer>();
        System.out.print(method(K,N));
    }
    private static int method(int K,int N){
        if (K==1){return N;}
        if (N==0){return 0;}
        for (int i=1;i<N+1;i++){
            int s=method(K-1,N-1);
            int notS=method(K,N-i);
            int max=0;
            max=notS>s?notS:s;
            max++;
            res=res<max?res:max;
        }
        return res;
    }
}
