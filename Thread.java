class Thread1{
    public void start(){
        System.out.println("Thread1 is running");
    }
}
class Thread2 extends Thread1{
    public void start(){
        System.out.println("Thread2 is running");
    }
}
public class Thread {
    public static void main(String[] args) {
        Thread1 t=new Thread1();
        Thread2 t1=new Thread2();
        t.start();
        t1.start();

}
}