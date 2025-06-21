public class Area {

    class Circle {
        public void circle(int r) {
            System.out.println("Area of Circle: " + (3.14 * r * r));
        }
    }

    class Rectangle {
        public void rect(int l, int b) {
            System.out.println("Area of Rectangle: " + (l * b));
        }
    }

    class Triangle {
        public void triangle(int h, int b) {
            System.out.println("Area of Triangle: " + (0.5 * b * h));
        }
    }

    public static void main(String[] args) {
        Area area = new Area();

        Area.Circle circle = area.new Circle();
        circle.circle(5);

        Area.Rectangle rectangle = area.new Rectangle();
        rectangle.rect(4, 6);

        Area.Triangle triangle = area.new Triangle();
        triangle.triangle(5, 8);
    }
}
