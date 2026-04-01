package SistemaDiMonitorraggio;

public class NodoEdgeAvanzato extends NodoRete implements GestoreEnergia
{
    private boolean acceso; // Stato del nodo (acceso o spento)
    private boolean risparmioEnergia; // Stato del risparmio energetico (attivo o inattivo)

    public NodoEdgeAvanzato(String id, double energiaBase) // Costruttore per inizializzare l'id e l'energia base del nodo
    {
        super(id, energiaBase); // Chiamata al costruttore della classe padre NodoRete
        this.acceso = false; // Inizializzazione dello stato del nodo come spento
        this.risparmioEnergia = false; // Inizializzazione dello stato del risparmio energetico come inattivo
    }

    @Override
    public void accendi() // Metodo per accendere il nodo
    {
        acceso = true; // Imposta lo stato del nodo su acceso
        System.out.println("Nodo Edge Avanzato " + id + " acceso."); // Stampa un messaggio di conferma
    }

    @Override
    public void spegni() // Metodo per spegnere il nodo
    {
        acceso = false; // Imposta lo stato del nodo su spento
        System.out.println("Nodo Edge Avanzato " + id + " spento."); // Stampa un messaggio di conferma
    }

    @Override
    public void accendiRisparmioEnergia() // Metodo per attivare il risparmio energetico del nodo
    {
        if (acceso) 
        { // Controlla se il nodo è acceso prima di attivare il risparmio energetico
            risparmioEnergia = true; // Imposta lo stato del risparmio energetico su attivo
            System.out.println("Risparmio energetico attivato per il Nodo Edge Avanzato " + id + "."); // Stampa un messaggio di conferma
        } 
        else 
        {
            System.out.println("Il Nodo Edge Avanzato " + id + " è spento. Accendilo prima di attivare il risparmio energetico."); // Messaggio di errore se il nodo è spento
        }
    }

    @Override
    public void spegniRisparmioEnergia() // Metodo per disattivare il risparmio energetico del nodo
    {
        if (acceso)
        { // Controlla se il nodo è acceso prima di disattivare il risparmio energetico
            risparmioEnergia = false; // Imposta lo stato del risparmio energetico su inattivo
            System.out.println("Risparmio energetico disattivato per il Nodo Edge Avanzato " + id + "."); // Stampa un messaggio di conferma
        }
        else
        {
            System.out.println("Il Nodo Edge Avanzato " + id + " è spento. Accendilo prima di disattivare il risparmio energetico."); // Messaggio di errore se il nodo è spento
        }
    }

    @Override
    public int consumoTotale() // Metodo per calcolare il consumo totale di energia del nodo
    {
        double consumo = energiaBase;
        if (risparmioEnergia)
        { // Se il risparmio energetico è attivo, riduce il consumo del 30%
            consumo *= 0.7;
        }
        return (int)consumo;
    }
}
