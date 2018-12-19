import java.util.Scanner;
public class Member {
    private String name;
    private int age,salary;
    public void setData(String name,int age, int salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public void getData(){
        System.out.println(name+ " "+age +" "+ salary);
    }
    public static void main(String[] args) {
    }
}