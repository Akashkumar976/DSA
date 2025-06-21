public class InterfaceInJava {
 public static void main(String[] args) {
    Cars c=new Benz();
    System.out.print("Speed of Benz:-" );c.speed();
    Cars b=new Bhugati();
    System.out.print("Speed of Bhugati:-" );b.speed();
 }   
}
interface Cars {
void speed();
}
class Benz implements Cars{
    
    public void speed()
    {
    System.out.println("140kmph");
    }
}
class Bhugati implements Cars{
    public void speed(){
        System.out.println("200kmph");
    }
}
