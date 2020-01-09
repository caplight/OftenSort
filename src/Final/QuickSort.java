package Final;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = { 2, 8, 7, 1, 3, 5, 6, 4 };
        QuickSort.quickSort(a, 8);
        for (int i=0;i<8;i++){
            System.out.print(a[i]);
        }
    }
    /**
     * 快速排序
     *
     * @param a
     * @param n
     */
    public static void quickSort(int[] a, int n) {
        quickSortRecursive(a, 0, n - 1);
    }

    /**
     * 快速排序递归函数，p,r为下标。
     *
     * @param a
     * @param p
     * @param r
     */
    public static void quickSortRecursive(int[] a, int p, int r) {
        if (p >= r) {
            return;
        }
        // 获取分区点
        int q = partition(a, p, r);
        quickSortRecursive(a, p, q - 1);
        quickSortRecursive(a, q + 1, r);
    }

    public static int partition(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] < pivot) {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
                i++;
            }
        }
        int t = a[i];
        a[i] = a[r];
        a[r] = t;
        return i;
    }

}
