public class Piramide extends Quadrato implements Triangolo {
    protected final double altezza;

    public Piramide(double lato, double altezza) {
        super(lato);
        if (!Double.isFinite(altezza) || altezza <= 0) {
            throw new IllegalArgumentException("L'altezza deve essere un numero positivo.");
        }
        this.altezza = altezza;
    }

    private double altezzaInclinata() {
        return Math.hypot(altezza, lato / 2);
    }

    @Override
    public double areaTriangolo() {
        return lato * altezzaInclinata() / 2;
    }

    @Override
    public double perimetroTriangolo() {
        double spigoloLaterale = Math.hypot(altezza, lato / Math.sqrt(2));
        return lato + 2 * spigoloLaterale;
    }

    public double perimetroBase() {
        return super.perimetroBase();
    }

    public double areaSuperficiale() {
        return area() + 4 * areaTriangolo();
    }

    public double volume() {
        return area() * altezza / 3;
    }
}
