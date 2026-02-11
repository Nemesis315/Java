package NegozioDispositivi;

public class Main 
{
    public static void main(String[] args) 
    {
        Dispositivo[] dispositivi = new Dispositivo[2];
        dispositivi[0] = new Smartphone("Samsung", 2);
        dispositivi[1] = new Tablet("Apple", true);

        for (Dispositivo d : dispositivi) 
        {
            d.mostraInfo();
        }

        // Dimostrazione dell'overloading su Smartphone
        if (dispositivi[0] instanceof Smartphone) 
        {
            Smartphone s = (Smartphone) dispositivi[0];
            s.chiama();
            s.chiama("Luca");
        }
    }
}
