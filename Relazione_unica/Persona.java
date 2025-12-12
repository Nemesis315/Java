package lezioni.oggetti; // Definisce il package a cui appartiene la classe Persona.

// La classe Persona dimostra l'overloading dei costruttori
public class Persona { // Definizione della classe Persona.
    // Inizio della definizione della classe Persona.
    
    // Attributi privati.
    private String nome; // Attributo: nome della persona.
    private int eta; // Attributo: età della persona.

    // Costruttore 1 (Overloading): inizializza solo il nome (1 parametro).
    public Persona(String nomeInit) { // Costruttore che riceve solo il nome.
        // Chiama l'altro costruttore (Costruttore 2) passando 0 come eta di default.
        // Questo e il modo migliore per implementare l'OVERLOADING tra costruttori (this(...) ).
        this(nomeInit, 0); 
    }

    // Costruttore 2 (Overloading - IL PRINCIPALE): inizializza nome ed eta (2 parametri).
    // Ha una "firma" diversa dal Costruttore 1 (numero e tipo di parametri).
    public Persona(String nomeInit, int etaInit) { // Costruttore che riceve nome ed età.
        this.nome = nomeInit; // Assegna il nome.
        this.eta = etaInit;   // Assegna l'eta.
    }

    // Metodo: implementa il comportamento di compiere gli anni.
    public void compiCompleanno() { // Metodo che incrementa l'età di uno.
        this.eta = this.eta + 1; // Incrementa l'attributo 'eta' di uno.
    }

    // Metodo: restituisce una stringa descrittiva dei dettagli.
    public String dettagli() { // Restituisce una stringa descrittiva nome+età.
        return nome + " ha " + eta + " anni."; // Costruisce la stringa dei dettagli.
    }
} // Fine classe Persona
