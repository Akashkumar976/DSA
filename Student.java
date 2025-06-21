class StudentOOPs {
    String name;
    int rn;
    int age;

    StudentOOPs(String name, int rn, int age) {
        this.name = name;
        this.rn = rn;
        this.age = age;
        System.out.println("Name:-" + this.name);
        System.out.println("Roll number:-" + this.rn);
        System.out.println("Age:-" + this.age);
    }
        StudentOOPs(String name, int rn) {
        this.name = name;
        this.rn = rn;
        System.out.println("Name:-" + this.name);
        System.out.println("Roll number:-" + this.rn);
    }
}
public class Student {
    public static void main(String[] args) {
        StudentOOPs sn = new StudentOOPs("Akash", 34);
     new StudentOOPs("Akashkumar", 34, 65);
    }
}
