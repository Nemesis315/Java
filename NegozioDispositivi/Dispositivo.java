package NegozioDispositivi;

public class Dispositivo 
{
    protected String marca;

    public Dispositivo(String marca) 
    {
        this.marca = marca;
    }

    public void mostraInfo() 
    {
        System.out.println("Marca: " + marca);
    }
}
