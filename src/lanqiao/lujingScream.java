package lanqiao;

import java.util.Scanner;

public class lujingScream {
    static class Node{
        int left=0;
        int hight=0;
        Node before;

        private Node(int left, int hight, Node before) {
            this.left = left;
            this.hight = hight;
            this.before = before;
        }
    }
    private static int N;
    private static int[]west;
    private static int[]north;
    private static int[][] road;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        N = Integer.parseInt(scanner.nextLine());
        road=new int[N][N];
        west=new int[N];
        north=new int[N];
        String westStr="";
        String northStr="";
        northStr = scanner.nextLine();
        westStr = scanner.nextLine();
        for (int i=0;i<northStr.split(" ").length;i++){
            north[i]=Integer.parseInt(northStr.split(" ")[i]);
        }
        for (int i=0;i<westStr.split(" ").length;i++){
            west[i]=Integer.parseInt(westStr.split(" ")[i]);
        }
        scanner.close();
    }

    public static void method(Node node,int[] west,int[] north){
        if (node.left==west.length-1&&node.hight==north.length-1){

        }else {
            int left=node.left;
            int hight=node.hight;
            if (road[left][hight-1]!=1&&west[hight-1]!=0&&north[left]!=0){
                road[left][hight-1]=1;
                Node newNode=new Node(left,hight-1,node);
                west[hight-1]--;
                north[left]--;
                method(newNode,west,north);
                road[left][hight-1]=0;
                west[hight-1]++;
                north[left]++;
            }
            if (road[left-1][hight]!=1){

            }
            if (road[left+1][hight]!=1){

            }
            if (road[left][hight+1]!=1){

            }
        }
    }
}
