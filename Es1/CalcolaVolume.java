import java.util.Scanner;

public class CalcolaVolume {
    public static void main(String[] args) throws InterruptedException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Inserisci il lato del cubo: ");
            double cubeSide = scanner.nextDouble();

            System.out.print("Inserisci il raggio della sfera: ");
            double sphereRadius = scanner.nextDouble();

            System.out.print("Inserisci il lato del tetraedro: ");
            double tetrahedronSide = scanner.nextDouble();

            Cube cube = new Cube(cubeSide);
            Sphere sphere = new Sphere(sphereRadius);
            Tetrahedron tetrahedron = new Tetrahedron(tetrahedronSide);

            Thread t1 = new Thread(cube);
            Thread t2 = new Thread(sphere);
            Thread t3 = new Thread(tetrahedron);

            t1.start();
            t2.start();
            t3.start();

            t1.join();
            t2.join();
            t3.join();

            System.out.println("Cube volume: " + cube.getVolume());
            System.out.println("Sphere volume: " + sphere.getVolume());
            System.out.println("Tetrahedron volume: " + tetrahedron.getVolume());
        }
    }
}
