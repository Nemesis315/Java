public class Quadrato {
    protected final double lato;

    public Quadrato(double lato) {
        if (!Double.isFinite(lato) || lato <= 0) {
            throw new IllegalArgumentException("Il lato deve essere un numero positivo.");
        }
        this.lato = lato;
    }

    public double area() {
        return lato * lato;
    }

    public double perimetroBase() {
        return 4 * lato;
    }
}
