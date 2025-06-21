public class Overriding{
 public static void main(String[] args) {
Animals a=new Cat();
a.sound();
Animals b=new Dog();
b.sound();
 }   
}
class Animals{
    void sound()
    {
        System.out.println("All animals have voice:- ");
    }
}
class Cat extends Animals{
    @Override
    void sound()
    {
        System.out.println("Cats have meow sound....");
    }
}
class Dog extends Animals{
    @Override
    void sound()
    {
        System.out.println("Dogs have Bark sound....");
    }
}