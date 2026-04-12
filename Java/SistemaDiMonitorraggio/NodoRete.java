package SistemaDiMonitorraggio;

public abstract class NodoRete 
{
    protected String id; // Identificatore del nodo
    protected double energiaBase; // Energia base del nodo

    public NodoRete(String id, double energiaBase) // Costruttore per inizializzare l'id e l'energia base
    {
        this.id = id; // Assegnazione dell'id al nodo
        this.energiaBase = energiaBase; // Assegnazione dell'energia base al nodo
    }

    public String getId() // Metodo per ottenere l'id del nodo
    {
        return id; // Restituisce l'id del nodo
    }

    public double getEnergiaBase() // Metodo per ottenere l'energia base del nodo
    {
        return energiaBase; // Restituisce l'energia base del nodo
    }
    
}
