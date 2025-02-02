package SortJava;

public class MostShort {
    static int M=10000;//(此路不通)
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] weight1 = {//邻接矩阵
                {0,3,2000,7,M},
                {3,0,4,2,M},
                {M,4,0,5,4},
                {7,2,5,0,6},
                {M,M,4,6,0}
        };


        int[][] weight2 = {
                {0,10,M,30,100},
                {M,0,50,M,M},
                {M,M,0,M,10},
                {M,M,20,0,60},
                {M,M,M,M,0}
        };
        int start=0;
        int[] shortPath = Dijsktra(weight2,start);

        for(int i = 0;i < shortPath.length;i++)
            System.out.println("从"+start+"出发到"+i+"的最短距离为："+shortPath[i]);

    }
    public static int[] Dijsktra(int[][] weight,int start){
        int n = weight.length;
        int[] shortPath = new int[n];
        String[] path=new String[n];
        for(int i=0;i<n;i++)
            path[i]=new String(start+"-->"+i);
        int[] visited = new int[n];

        //初始化，第一个顶点求出
        shortPath[start] = 0;
        visited[start] = 1;

        for(int count = 1;count <= n - 1;count++)
        {

            int k = -1;
            int dmin = Integer.MAX_VALUE;
            for(int i = 0;i < n;i++)
            {
                if(visited[i] == 0 && weight[start][i] < dmin)
                {
                    dmin = weight[start][i];

                    k = i;
                }
            }
            System.out.println("k="+k);
            shortPath[k] = dmin;

            visited[k] = 1;
            for(int i = 0;i < n;i++)
            {
                if(visited[i] == 0 && weight[start][k] + weight[k][i] < weight[start][i]){
                    weight[start][i] = weight[start][k] + weight[k][i];

                    path[i]=path[k]+"-->"+i;

                }

            }

        }
        for(int i=0;i<n;i++)
            System.out.println("从"+start+"出发到"+i+"的最短路径为："+path[i]);
        System.out.println("=====================================");

        return shortPath;
    }
}
