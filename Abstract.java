public class Abstract {
    public static void main(String[] args) {
        
    Animal1 a=new Cat2();
    a.walk();
    a.breath();
    }
}
abstract class Animal1{
    abstract void walk();
    void breath(){
        System.out.println("This animal breathes through lungs");
    }
    Animal1()
    {
        System.out.println("Creating an Animal....");
    }
}
class Cat2 extends Animal1{
Cat2()
{
    System.out.println("This is a Cat");
}
void walk()
{
    System.out.println("Cat walks on 4 legs");
}
}