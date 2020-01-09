package Final;

public class Demo14 {
    public static void main(String[] args) {
        int[] arr = { 2,5,-3,4,-9,44,32,22,11,-30 };
        System.out.print(maxSumDp(arr));
    }
    public static int maxSumDp(int[] arr) {
        int sum=0,nowSum=0,n=arr.length;
        for (int i=1;i<n;i++){
            if (nowSum>0){
                nowSum+=arr[i-1];
            }else {
                nowSum=arr[i-1];
            }
            if (nowSum>sum){
                sum=nowSum;
            }
        }
        return sum;
    }
}
