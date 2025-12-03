public class Sphere extends Circle {
    private double radius;
    public Sphere(double r) {
        super(r);
        this.radius = r;
    }

    @Override
    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    public double volume() {
        return 4.0 / 3.0 * Math.PI * radius * radius * radius;
    }
}
