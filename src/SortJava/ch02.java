package SortJava;

public class ch02 {
    public static int min=0;
    public static int max=0;
    public static void main(String[] args) {
            int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
            ch02 ch02=new ch02();
            ch02.sortmethod(a,10,0,a.length-1);
        System.out.printf("max="+max+"min="+min);
    }
    public int sortmethod(int[] a,int b,int left,int right){
        if ((right+left+1)/2>1){
            min=a[left];
            max=a[right];
            int i=(right+left+1)/2;
            if (a[i]>b){
                right=i;
                sortmethod(a,b,left,right-1);
            }else if (a[i]<b){
                left=i;
                sortmethod(a,b,left+1,right);
            }else if (a[i]==b){
                System.out.printf("结果为"+a[i]);
                return a[i];
            }
        }else {
            max=min=b;
            return -1;
        }
        return 1;
    }
}
