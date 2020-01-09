package lanqiao;

public class AllSort {
    public static int num=0;

    public static void main(String[] args) {
        int[] x={1,2,3,4,5,6,7,8,9};
        sort(x,0,9);
        System.out.println(num/6);
    }

    private static void sort(int x[],int now,int all){
        if (now==all){
            isOk(x);
        }else {
            for (int i=now;i<all;i++){
                swap(x,now,i);
                sort(x,now+1,all);
                swap(x,now,i);
            }
        }
    }

    private static Boolean isOk(int[] x){
        int a=x[0]+x[1]+x[3]+x[6];
        int b=x[0]+x[2]+x[4]+x[8];
        int c=x[5]+x[7]+x[6]+x[8];
        if (a==b&&b==c){
            num++;
            return true;
        }else{
        return false;
        }
    }

    private static void swap(int []a,int old,int now){
        int temp=a[old];
        a[old]=a[now];
        a[now]=temp;
    }
}
