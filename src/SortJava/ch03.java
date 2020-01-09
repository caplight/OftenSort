package SortJava;

public class ch03 {
    public int Mjf(int a[],int size,int sum[][]){
        int counter=0;
        int max=0;
        for(int i=0;i<size;i++)
            for(int j=i;j<size;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    if(a[k]<0) counter++;//子段元素是否为负数的计数器
                    sum[i][j]+=a[k];//sum[i][j]表示从a[i]加到a[j]的和
                    if(counter==j-i+1) sum[i][j]=0;//当该子段内所有元素均为负时，该子段和为零
                }
                max=(max>=sum[i][j])?max:sum[i][j];
            }
        return max;
    }

    //枚举法优化
    public int MjfGj(int a[],int size,int sum[][]){
        int counter=0;
        int max=0;
        int maxsum=0;
        for (int i=0;i<size;i++){
            for (int p=i;p<size;p++){
                if (a[p]<0){
                    counter++;
                }
                maxsum+=a[p];
                sum[i][p]=maxsum;
                if(counter==p-i+1) sum[i][p]=0;//当该子段内所有元素均为负时，该子段和为零
                max=(max>=sum[i][p])?max:sum[i][p];
            }
        }
        return max;
    }

    //等价划分
    public int Djhf(int a[],int left,int right){
        int sum=0;
        if (left==right){
            if (a[left]>0)sum=a[left];
            else sum=0;
        }
        else {
            int center=(left+right)/2;
            int leftsum=Djhf(a,left,center);
            int rightsum=Djhf(a,center+1,right);
            int s1=0;
            int lefts=0;
            for (int i=center;i>=left;i--){
                lefts+=a[i];
                if (lefts>s1)s1=lefts;
            }
            int s2=0;
            int rights=0;
            for (int j=center+1;j<=right;j++){
                rights+=a[j];
                if (rights>s2)s2=rights;
            }
            sum=s1+s2;
            if(sum<leftsum) sum=leftsum;
            if (sum<rightsum)sum=rightsum;
        }
        return sum;
    }

    //动态规划
    public int Dtgh(int a[],int n){
        int sum=0;
        int b[]=new int[a.length];
        b[0]=a[0];
        for(int i=1;i<n;i++){
            if (b[i-1]>0){
                b[i]=b[i-1]+a[i];}
            else {b[i]=a[i];}
        }
        for (int j=0;j<n;j++){
            if (b[j]>sum)
                sum=b[j];
        }
        return sum;
    }
    public static void main(String[] args) {
        int a[]={-2,11,-4,13,-5,-2};
        int size=6;
        int sum[][]=new int[size][size];
        int max=0;
        ch03 ch03=new ch03();
        max=ch03.Dtgh(a,6);
        System.out.println("最大子段和:"+max);
    }
}
