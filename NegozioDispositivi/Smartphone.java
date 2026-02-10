package NegozioDispositivi;

public class Smartphone extends Dispositivo 
{
    private int numeroSIM;

    public Smartphone(String marca, int numeroSIM) 
    {
        super(marca);
        this.numeroSIM = numeroSIM;
    }

    @Override
    public void mostraInfo() 
    {
        System.out.println("Smartphone - Marca: " + marca + ", Numero SIM: " + numeroSIM);
    }

    public void chiama() 
    {
        System.out.println("Chiamata in corso...");
    }

    public void chiama(String contatto) 
    {
        System.out.println("Chiamata a " + contatto + "...");
    }
}
