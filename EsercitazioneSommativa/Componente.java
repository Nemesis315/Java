package EsercitazioneSommativa;

public class Componente 
{
    private String id;
    private double energiaBase;

    public Componente(String id, double energiaBase) 
    {
        this.id = id;
        this.energiaBase = energiaBase;
    }

    public String getId() 
    {
        return id;
    }

    public void setId(String id) 
    {
        this.id = id;
    }

    public double getEnergiaBase() 
    {
        return energiaBase;
    }

    public void setEnergiaBase(double energiaBase) 
    {
        this.energiaBase = energiaBase;
    }

    public double calcolaRendimento() 
    {
        return getEnergiaBase();
    }
}
