package Final;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo18 {
    int[] x;//��ǰ��
    int N;//�ʺ����
    int sum = 0;//��ǰ���ҵ��Ŀ��з�����
    public int totalNQueens(int n) {
        N = n;
        x = new int[N+1];
        backTrace(1);
        return sum;
    }
    /**
     * col������㣬x[col]������㡣���Ѿ����ڵļ����ʺ��Ƿ����Ҫ�󣬷ŵ����λ���ϣ�
     * @param col
     * @return
     */
    private boolean place(int col){
        for(int i = 1; i < col; i++){
            if(Math.abs(col - i)==Math.abs(x[col]-x[i])||x[col]==x[i]){
                return false;
            }
        }

        return true;
    }
    private void backTrace(int t) {
        if(t>N){
            sum++;
        }else {
            //��t�С�����ȫ���Ľڵ�
            for(int j = 1; j <= N; j++) {
                x[t] = j ;
                //�����j���ڵ��ܹ����»ʺ�
                if(place(t)){
                    //���ŷ���һ��
                    backTrace(t+1);
                }
            }
        }

    }
    public static void main(String[] args) {
        Demo18 n = new Demo18();
        System.out.println(n.totalNQueens(4));
    }
}
