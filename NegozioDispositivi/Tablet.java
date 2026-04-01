

public class Tablet extends Dispositivo 
{
    private boolean possiedePennino;

    public Tablet(String marca, boolean possiedePennino) 
    {
        super(marca);
        this.possiedePennino = possiedePennino;
    }

    @Override
    public void mostraInfo() 
    {
        System.out.println("Tablet - Marca: " + marca + ", Possiede pennino: " + possiedePennino);
    }
}
