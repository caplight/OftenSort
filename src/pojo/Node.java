package pojo;

public class Node implements Comparable<Node>{
    private Node left;
    private Node right;
    private String value;
    private int weight;
    private String code=" ";

    @Override
    public String toString() {
        return "Node{" +
                "left=" + left +
                ", right=" + right +
                ", value='" + value + '\'' +
                ", weight=" + weight +
                ", code='" + code + '\'' +
                '}';
    }

    public Node() {
    }

    public Node(Node left, Node right, String value, int weight) {
        this.left = left;
        this.right = right;
        this.value = value;
        this.weight = weight;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {
        if(this.weight<o.getWeight()){
            return -1;
        }else if(this.weight>o.getWeight()){
            return 1;
        }else{
            return 0;
        }
    }
}
