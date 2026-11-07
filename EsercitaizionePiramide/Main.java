import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Inserisci lato del quadrato di base: ");
            double lato = scanner.nextDouble();

            System.out.print("Inserisci altezza della piramide: ");
            double altezza = scanner.nextDouble();

            Piramide piramide = new Piramide(lato, altezza);

            System.out.println("Area del quadrato (base): " + piramide.area());
            System.out.println("Perimetro del quadrato (base): " + piramide.perimetroBase());
            System.out.println("Volume della piramide: " + piramide.volume());
            System.out.println("Area della faccia triangolare: " + piramide.areaTriangolo());
            System.out.println("Perimetro della faccia triangolare: " + piramide.perimetroTriangolo());
            System.out.println("Area superficiale della piramide: " + piramide.areaSuperficiale());
        }
    }
}