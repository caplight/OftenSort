package pojo;

public class People implements Comparable {
    private int age;
    private String name;
    public People(int age,String name){
       this.age=age;
       this.name=name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Object o){
        People people=(People)o;
        return this.getAge()-people.getAge();
    }
}
