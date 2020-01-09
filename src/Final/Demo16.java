package Final;

import java.lang.reflect.Array;

public class Demo16 {
    private static int a[] = new int[] { 6, 10, 25, 3, 33, 90, 60, 100, 56 };
    public static void main(String[] args) {
        System.out.print(recursionBinarySearch(35));
    }
    public static int recursionBinarySearch(int num){
        int left=0;
        int right=a.length-1;
        if (left>right||num<a[left]||num>a[right]){
            return -1;
        }
        while (left<right){
            int mid=(right-left)/2;
            if (a[mid]==num){
                return mid;
            }else if (a[mid]>num){
                right=mid-1;
            }else if (a[mid]<num){
                left=mid+1;
            }
        }
        return -1;
    }
}
