package SortJava;

public class Ch01 {

    public void Swap(int a[],int n,int i){
        int item;
        if (i<a.length){
        item=a[n];
        a[n]=a[i];
        a[i]=item;
        }
    }
    public void Perm(int []a,int i){
        if(i<a.length){
        int x,y,z;
        x=100*a[0]+10*a[1]+a[2];
        y=100*a[3]+10*a[4]+a[5];
        z=100*a[6]+10*a[7]+a[8];
            if (x+y==z){
                System.out.println(x+"+"+y+"="+z);
             }
             else {
                System.out.println(x+"+"+y+"="+z);
                Swap(a,i,i+1);
                Perm(a,i+1);
                Swap(a,i,i+1);
            }
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        Ch01 ch01=new Ch01();
        ch01.Perm(a,0);
    }
}
