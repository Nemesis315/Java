package lezioni.oggetti; // Definisce il package per la classe Impiegato.

// La classe Impiegato e usata per l'Array di oggetti e l'I/O su file
public class Impiegato { // Definizione della classe Impiegato.
    // Inizio della definizione della classe Impiegato.
    
    // Attributi privati (Information Hiding): visibili solo all'interno di questa classe.
    private String nome; // Nome del dipendente.
    private String cognome; // Cognome del dipendente.
    private double salario; // Salario del dipendente.

    // Costruttore: inizializza l'oggetto con tutti i dati necessari.
    // Viene invocato con 'new Impiegato(n, c, s)'.
    public Impiegato(String n, String c, double s) { // Costruttore con nome, cognome e salario.
        this.nome = n;      // Assegna il parametro 'n' all'attributo 'nome'.
        this.cognome = c;   // Assegna il parametro 'c' all'attributo 'cognome'.
        this.salario = s;   // Assegna il parametro 's' all'attributo 'salario'.
    }

    // Metodo (servizio): descrive il comportamento di aumento di salario.
    public void incrementaSalario(int percentuale) { // Aumenta il salario di una percentuale.
        // Calcola l'aumento percentuale e lo aggiunge al salario corrente.
        salario = salario + ((salario * percentuale) / 100);
    }
    
    // Metodo GETTER: fornisce accesso in lettura all'attributo privato 'nome'.
    public String getNome() { // Ritorna il nome dell'impiegato.
        return nome; // Restituisce il valore del campo 'nome'.
    }
    
    // Metodo GETTER: fornisce accesso in lettura all'attributo privato 'cognome'.
    public String getCognome() { // Ritorna il cognome dell'impiegato.
        return cognome; // Restituisce il valore del campo 'cognome'.
    }
    
    // Metodo GETTER: fornisce accesso in lettura all'attributo privato 'salario'.
    public double getSalario() { // Ritorna il salario dell'impiegato.
        return salario; // Restituisce il valore del campo 'salario'.
    }

    // Metodo (servizio): restituisce una rappresentazione testuale dell'oggetto.
    public String dettagli() { // Costruisce e restituisce la stringa con i dettagli dell'impiegato.
        // Concatena gli attributi in una singola stringa.
        return ("Nome "+nome+" Cognome "+cognome+" Salario "+salario); // Stringa di output con i campi separati.
    }
} // Fine classe Impiegato