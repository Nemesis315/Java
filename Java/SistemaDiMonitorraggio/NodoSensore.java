package SistemaDiMonitorraggio;

public class NodoSensore implements GestoreEnergia
{
    private String id; // Identificatore del sensore
    private double energiaBase; // Energia base del sensore
    private boolean acceso; // Stato del sensore (acceso o spento)
    private boolean risparmioEnergia; // Stato del risparmio energetico (attivo o inattivo)

    public NodoSensore(String id, double energiaBase) // Costruttore per inizializzare l'id e l'energia base del sensore
    {
        this.id = id; // Assegnazione dell'id al sensore
        this.energiaBase = energiaBase; // Assegnazione dell'energia base al sensore
        this.acceso = false; // Inizializzazione dello stato del sensore come spento
        this.risparmioEnergia = false; // Inizializzazione dello stato del risparmio energetico come inattivo
    }

    @Override
    public void accendi() // Metodo per accendere il sensore
    {
        acceso = true; // Imposta lo stato del sensore su acceso
        System.out.println("Sensore " + id + " acceso."); // Stampa un messaggio di conferma
    }

    @Override
    public void spegni() // Metodo per spegnere il sensore
    {
        acceso = false; // Imposta lo stato del sensore su spento
        System.out.println("Sensore " + id + " spento."); // Stampa un messaggio di conferma
    }

    @Override
    public void accendiRisparmioEnergia() // Metodo per attivare il risparmio energetico del sensore
    {
        if (acceso) 
        { // Controlla se il sensore è acceso prima di attivare il risparmio energetico
            risparmioEnergia = true; // Imposta lo stato del risparmio energetico su attivo
            System.out.println("Risparmio energetico attivato per il sensore " + id + "."); // Stampa un messaggio di conferma
        } 
        else 
        {
            System.out.println("Il sensore " + id + " è spento. Accendilo prima di attivare il risparmio energetico."); // Messaggio di errore se il sensore è spento
        }
    }

    @Override
    public void spegniRisparmioEnergia() // Metodo per disattivare il risparmio energetico del sensore
    {
        if (risparmioEnergia) { // Controlla se il risparmio energetico è attivo prima di disattivarlo
            risparmioEnergia = false; // Imposta lo stato del risparmio energetico su inattivo
            System.out.println("Risparmio energetico disattivato per il sensore " + id + "."); // Stampa un messaggio di conferma
        } 
        else 
        {
            System.out.println("Il risparmio energetico per il sensore " + id + " è già disattivato."); // Messaggio di conferma se il risparmio energetico è già disattivato
        }
    }

    @Override
    public int consumoTotale() // Metodo per calcolare il consumo energetico totale del sensore
    {
        if (!acceso) 
        { // Se il sensore è spento, il consumo è zero
            return 0;
        }
        
        double consumo = energiaBase; // Consumi il valore base di energia
        
        if (risparmioEnergia) 
        { // Se il risparmio energetico è attivo, riduce il consumo del 30%
            consumo *= 0.7;
        }
        
        return (int) consumo; // Restituisce il consumo totale calcolato
    }
}
