public class Cube implements Runnable {
    private double side;
    private double volume;

    public Cube(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (!Double.isFinite(side) || side <= 0) {
            throw new IllegalArgumentException("Il lato del cubo deve essere positivo.");
        }
        this.side = side;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public void run() {
        volume = Math.pow(side, 3);
    }
}
