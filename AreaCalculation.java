public class AreaCalculation extends Area {
    public static void main(String[] args)  {
        AreaCalculation ac = new AreaCalculation();

        Circle c = ac.new Circle();
        Rectangle r = ac.new Rectangle();
        Triangle t = ac.new Triangle();

        c.circle(2);
        r.rect(5, 5);
        t.triangle(5, 2);
    }
}
