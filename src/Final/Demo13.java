package Final;

public class Demo13 {
    private static int[] a={1,2,3,4,5,6,7,8,9};
    public static void main(String[] args) {
        System.out.print(recursionBinarySearch(0));
    }
    public static int sequenceSort(int num){
        for (int i=0;i<a.length;i++){
            if (num==a[i]){
                return i;
            }
        }
        return -1;
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
