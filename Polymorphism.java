public class Polymorphism {
    public static void main(String[] args) {
         CollegeStudent s=new  CollegeStudent();
        s.setParam(2,"Santosh");
        s.getInfo();
        s.getInfo(2);
    }
}
class CollegeStudent{
    int rollno;
    String name;
    public void setParam(int rollno,String name)
    {
        this.rollno=rollno;
        this.name=name;
    }
    public void getInfo()
    {
        System.out.println("Student Available:   ");
    }
    // public void getInfo()
    // {
    //     System.out.println(this.name);
    // }
    public void getInfo(int rollno)//method overloading
    {
        System.out.println("Studen Available with Roll no:- "+this.rollno);
    }
}
