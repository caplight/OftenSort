package lanqiao;

import java.util.*;

public class dianzan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n,d,k;
        Map<Integer,Map<Integer,Integer>> idMap = new HashMap<Integer, Map<Integer, Integer>>();
        String test="";
        test=scanner.nextLine();
        String[] strings=test.split(" ");
        n=Integer.parseInt(strings[0]);
        d=Integer.parseInt(strings[1]);
        k=Integer.parseInt(strings[2]);
        String line="";
        int max=0;
        int h=0;
        while ( h<n){
            line=scanner.nextLine();
            String[] split=line.split(" ");
            if (Integer.parseInt(split[0])>max){
                max=Integer.parseInt(split[0]);
            }
            if (idMap.containsKey(Integer.parseInt(split[1]))){
                idMap.get(Integer.parseInt(split[1])).put(Integer.parseInt(split[0]),1);
            }else {
                Map<Integer,Integer> integerMap=new HashMap<Integer, Integer>();
                idMap.put(Integer.parseInt(split[1]),integerMap);
                idMap.get(Integer.parseInt(split[1])).put(Integer.parseInt(split[0]),1);
            }
            h++;
        }
        Set<Integer> set=idMap.keySet();
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            int[] b=new int[max];
            Map<Integer,Integer> integerMap=idMap.get(it);
           for (int i=1;i<max;i++){
                if (integerMap.containsKey(i))
                   b[i]=b[i-1]+1;
               }
           }
        }


}
