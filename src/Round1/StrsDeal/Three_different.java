package Round1.StrsDeal;

import java.util.*;

public class Three_different {
    private static String str="";
    private static Set<Character> characterTreeSet;
    public static void main(String[] args) {
        characterTreeSet=new LinkedHashSet<Character>();
        Scanner scanner=new Scanner(System.in);
        str=scanner.nextLine();
        char[] chars=str.toCharArray();
        Arrays.sort(chars);
        for(int i=0;i<str.length();i++){
            characterTreeSet.add(chars[i]);
        }
        method();
    }
    private static void method(){
        Iterator<Character> characterIterator=characterTreeSet.iterator();
        List<Character> characters=new ArrayList<Character>();
        while (characterIterator.hasNext()){
            characters.add(characterIterator.next());
        }
        int n=characters.size();
        int i,j,k;
        for (i=0; i<n-2; i++)
            for (j=i+1; j<n; j++)
                for (k=j+1; k<n; k++)
                    System.out.printf("%c%c%c\n", characters.get(i), characters.get(j), characters.get(k));
    }
}
