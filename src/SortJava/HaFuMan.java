package SortJava;

import pojo.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HaFuMan {
    //哈夫曼树的构建
    public static void function_01(){
        List<Node> nodes = new ArrayList<Node>();
        Node A = new Node(null,null,"A",45);
        Node B = new Node(null,null,"B",13);
        Node C = new Node(null,null,"C",12);
        Node D = new Node(null,null,"D",16);
        Node E = new Node(null,null,"E",9);
        Node F = new Node(null,null,"F",5);
        nodes.add(A);
        nodes.add(B);
        nodes.add(C);
        nodes.add(D);
        nodes.add(E);
        nodes.add(F);

        while(true){
            if(nodes.size()==1)break;

            Collections.sort(nodes);

            Node temp = new Node();
            Node node = nodes.get(0);
            Node node1 = nodes.get(1);
            int w1 = node.getWeight();
            int w2 = node1.getWeight();
            temp.setWeight(w1+w2);

            if(w1<w2){
                temp.setLeft(node);
                temp.setRight(node1);
            }else{
                temp.setLeft(node1);
                temp.setRight(node);
            }

            nodes.remove(node);
            nodes.remove(node1);

            nodes.add(temp);
        }
        Node node = nodes.get(0);
        BL(node);
        print(node);
    }

    public static void BL(Node node){
        if(node.getLeft()==null)return;
        node.getLeft().setCode(node.getCode()+"0");
        node.getRight().setCode(node.getCode()+"1");
        BL(node.getLeft());
        BL(node.getRight());
    }

    public static void print(Node n){
        if(n.getLeft()==null){
            System.out.println(n.getValue()+"------"+n.getCode());
            return;
        }
        print(n.getLeft());
        print(n.getRight());
    }

    public static void main(String[] args) {
        function_01();
    }
}
