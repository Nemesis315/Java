public class Sphere implements Runnable {
    private double radius;
    private double volume;

    public Sphere(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (!Double.isFinite(radius) || radius <= 0) {
            throw new IllegalArgumentException("Il raggio della sfera deve essere positivo.");
        }
        this.radius = radius;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public void run() {
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
