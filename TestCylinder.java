    public class TestCylinder {
        public static void main(String[] args) {
            Circle circle = new Circle(2.0, "blue");
            System.out.println(circle.toString());
            System.out.println("Area: " + circle.getArea());

            Cylinder cylinder = new Cylinder(2.0, "green", 3.0);
            System.out.println(cylinder.toString());
            System.out.println("Volume: " + cylinder.getVolume());
        }
    }
