package lanqiao;

import java.util.Scanner;

public class maze {
    static class Node{
        int x=0;
        int y=0;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    private static char[][] map=new char[10][10];
    private static int[][] road=new int[10][10];
    private static int count;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<10;i++){
            map[i]=scanner.nextLine().toCharArray();
        }
        for (int i=0;i<10;i++){
            for (int q=0;q<10;q++){
                method(new Node(q,i));
            }
        }
        System.out.print(count);
    }
    private static void method(Node node){
        if (node.x<0&&node.x>9&&node.y<0&&node.y>9){
            count++;
        }else {
            int x=node.x;
            int y=node.y;
            char where=map[y][x];
            switch (where){
                case 'U':
                    if (road[x][y-1]==0){
                        road[x][y-1]=1;
                        method(new Node(x,y-1));
                        road[x][y-1]=0;
                    }
                    break;
                case 'D':
                    if (road[x][y+1]==0){
                        road[x][y+1]=1;
                        method(new Node(x,y+1));
                        road[x-1][y+1]=0;
                    }
                    break;
                case 'L':
                    if (road[x][y-1]==0){
                        road[x][y-1]=1;
                        method(new Node(x,y-1));
                        road[x][y-1]=0;
                    }
                    break;
                case 'R':
                    if (road[x][y+1]==0){
                        road[x][y+1]=1;
                        method(new Node(x,y+1));
                        road[x][y+1]=0;
                    }
                    break;
            }
        }
    }
}
