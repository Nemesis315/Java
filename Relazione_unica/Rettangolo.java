package lezioni.oggetti; // Definisce il package a cui appartiene la classe Rettangolo.

// La classe Rettangolo rappresenta un oggetto geometrico
public class Rettangolo { // Definizione della classe Rettangolo.
    // Inizio della definizione della classe Rettangolo.
    
    // Attributi privati per l'Information Hiding (variabili istanza).
    private double base; // Lunghezza della base.
    private double altezza; // Lunghezza dell'altezza.

    // Costruttore: metodo speciale per creare e inizializzare un oggetto.
    public Rettangolo(double baseInit, double altezzaInit) { // Costruttore con base e altezza.
        this.base = baseInit;       // Assegna il valore di base iniziale.
        this.altezza = altezzaInit; // Assegna il valore di altezza iniziale.
    } // Fine costruttore Rettangolo

    // Metodo GETTER: restituisce il valore corrente dell'attributo 'base'.
    public double getBase() { // Ritorna il valore della base.
        return base; // Valore del campo 'base'.
    } // Fine metodo getBase

    // Metodo SETTER: modifica il valore dell'attributo 'base'.
    public void setBase(double nuovaBase) { // Imposta un nuovo valore per la base con controllo.
        // Logica di controllo: accetta solo valori positivi (> 0).
        if (nuovaBase > 0) { // Controlla che il valore sia positivo prima dell'assegnazione.
            base = nuovaBase; // Assegna il nuovo valore al campo 'base'.
        } // Fine if: controllo validità nuovaBase
        // Se nuovaBase non > 0, l'attributo non viene modificato (Incapsulamento).
    } // Fine metodo setBase

    // Metodo (servizio): calcola l'area (comportamento dell'oggetto).
    public double calcolaArea() { // Calcola e ritorna l'area del rettangolo.
        return base * altezza; // Area = base * altezza.
    } // Fine metodo calcolaArea

    // Metodo (servizio): restituisce una stringa descrittiva dei dettagli.
    public String dettagli() { // Costruisce una stringa con i dettagli del rettangolo.
        // Concatena base, altezza e area in un formato leggibile.
        return "Rettangolo con Base: " + base + ", Altezza: " + altezza + ", Area: " + calcolaArea(); // Restituisce la stringa descrittiva.
    } // Fine metodo dettagli
} // Fine classe Rettangolo