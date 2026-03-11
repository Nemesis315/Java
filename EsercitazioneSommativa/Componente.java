package EsercitazioneSommativa; // Aggiunta del package per organizzare le classi

public class Componente // Classe base per rappresentare un componente generico
{
    protected String id; // Identificatore del componente
    protected double energiaBase; // Energia base del componente

    public Componente(String id, double energiaBase) // Costruttore per inizializzare l'id e l'energia base del componente
    {
        this.id = id; // Assegnazione dell'id al campo id
        this.energiaBase = energiaBase; // Assegnazione dell'energia base al campo energiaBase
    }

    public String getId() // Metodo getter per ottenere l'id del componente
    {
        return id; // Restituisce l'id del componente
    }

    public void setId(String id) // Metodo setter per impostare l'id del componente
    {
        this.id = id; // Assegna il nuovo id al campo id
    }

    public double getEnergiaBase() //
    {
        return energiaBase; // Restituisce l'energia base del componente
    }

    public void setEnergiaBase(double energiaBase) // Metodo setter per impostare l'energia base del componente
    {
        this.energiaBase = energiaBase; // Assegna la nuova energia base al campo energiaBase
    }

    public double calcolaRendimento() // Metodo per calcolare il rendimento del componente, da sovrascrivere nelle classi derivate
    {
        return getEnergiaBase(); // Restituisce l'energia base come rendimento di default, da sovrascrivere nelle classi derivate
    }
}
