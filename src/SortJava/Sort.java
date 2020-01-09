package SortJava;

import java.lang.reflect.Array;



public class Sort {
    public  Object object;
    public Sort(Object object){
        this.object=object;
    }
    public Sort(){

    }
    public int[] maopao(int a[]){
        int temp;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
    public int[] MaopaoPlus(int a[]){
        int temp;
        for (int i=0;i<a.length;i++){
            boolean flag=false;
            for (int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    flag=true;
                }
                if (flag==false){
                    break;
                }
            }
        }
        return a;
    }
    public void temp(Object object,int a,int b){
      Object temp;
      if (object.getClass().isArray()){
          temp=Array.get(object,a);
          Array.set(object,a,Array.get(object,b));
          Array.set(object,b,temp);
      }

    }
}
