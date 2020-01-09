package test;


import SortJava.Sort;
import pojo.People;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortTest {

    public static void main(String[] args){

        Sort sort=new Sort();
        int a[]={5,9,8,3};
        a = sort.maopao(a);
        for (int k=0;k<a.length;k++){
        System.out.print(a[k]);
        }
        //MaoPao排序 TestDemo

        int arr[]={3,4};
        String stringArr[]={"a","b"};
        sort.temp(stringArr,0,1);
        System.out.print("\nOutTemp:a="+stringArr[0]+",b="+stringArr[1]);
       //实现数组判断且交换 不同于书本 TestDemo

        People people1=new People(5,"Lisa");
        People people2=new People(4,"Karsa");
        People people3=new People(7,"Lion");
        People people4=new People(9,"Kim");
        ArrayList<People> arrayList=new ArrayList<People>();
        arrayList.add(people1);
        arrayList.add(people2);
        arrayList.add(people3);
        arrayList.add(people4);
        Collections.sort(arrayList);
        for (int i=0;i<arrayList.size();i++){
            System.out.print("age:"+arrayList.get(i).getAge()+"name:"+arrayList.get(i).getName()+"\n");
        }
       //ArrayList 排序 只要用了Collecttion 可以解决ArrayList List 排序
    }
}
