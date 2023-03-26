import java.util.Scanner;

public class bai4 {
    private String name;
    private int age;
    private String classes;
    public bai4(String name, int age, String classes) {
        this.name = name;
        this.age = age;
        this.classes = classes;
    }
    public String getName(){
        return  name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public int getAge(){
        return  age;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public String getClasses(){
        return  classes;
    }
    public void setClasses(String newClasses){
        this.classes = newClasses;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        bai4 Student  = new bai4("cong",25,"C0223G1");
        Student.setName("Hung");
        Student.setAge(25);
        Student.setClasses("C0223G1");
        System.out.println("student name is: "+ Student.getName() +", age: "+ Student.getAge() + ",class: " + Student.getClasses());
        System.out.println("information student:");
        Student.name = scanner.nextLine();
        Student.age = scanner.nextInt();
        scanner.nextLine();
        Student.classes = scanner.nextLine();
        System.out.println("student name is: "+  Student.name + ", age: " + Student.age + ",class: " + Student.classes);

    }
}
