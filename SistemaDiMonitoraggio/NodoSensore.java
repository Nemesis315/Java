// Inizio del blocco commento della classe concreta
/**
 * Classe Concreta NodoSensore
 * Implementa l'interfaccia GestoreEnergia
 * Rappresenta un piccolo sensore con gestione energetica specifica
 */
// Dichiarazione della classe che implementa l'interfaccia GestoreEnergia
public class NodoSensore implements GestoreEnergia 
// Apertura del corpo della classe
{
    // Dichiarazione del consumo di energia in modalità normale in Watt
    private double consumoNormale;
    // Dichiarazione del consumo di energia in modalità risparmio in Watt
    private double consumoRisparmio;
    // Dichiarazione del flag di stato del risparmio energetico
    private boolean risparmoAttivo;
    // Dichiarazione dell'ultimo valore letto dal sensore
    private double ultimoValore; // Ultimo valore letto dal sensore
    // Dichiarazione della stringa che identifica il tipo di sensore
    private String tipoSensore;
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del costruttore
    /**
     * Costruttore di NodoSensore
     * @param tipoSensore il tipo di sensore (temperatura, umidità, luminosità, ecc.)
     * @param consumoNormale consumo in watt in modalità normale
     * @param consumoRisparmio consumo in watt in modalità risparmio
     */
    // Dichiarazione del costruttore che accetta il tipo di sensore e i consumi
    public NodoSensore(String tipoSensore, double consumoNormale, double consumoRisparmio) 
    // Apertura del corpo del costruttore
    {
        // Assegnazione del tipo di sensore
        this.tipoSensore = tipoSensore;
        // Assegnazione del consumo normale
        this.consumoNormale = consumoNormale;
        // Assegnazione del consumo in risparmio
        this.consumoRisparmio = consumoRisparmio;
        // Inizializzazione del flag di risparmio a false
        this.risparmoAttivo = false;
        // Inizializzazione dell'ultimo valore a 0.0
        this.ultimoValore = 0.0;
    }
    
    // Spazio vuoto per leggibilità
    
    // Annotazione che indica l'override di un metodo dell'interfaccia
    @Override
    // Dichiarazione del metodo per attivare il risparmio energetico
    public void attivaRisparmoEnergetico() 
    // Apertura del corpo del metodo
    {
        // Impostazione del flag di risparmio a true
        risparmoAttivo = true;
        // Stampa del messaggio di attivazione
        System.out.println("  → Sensore " + tipoSensore + ": Risparmio energetico ATTIVATO");
    }
    
    // Spazio vuoto per leggibilità
    
    // Annotazione che indica l'override di un metodo dell'interfaccia
    @Override
    // Dichiarazione del metodo per disattivare il risparmio energetico
    public void disattivaRisparmoEnergetico() 
    // Apertura del corpo del metodo
    {
        // Impostazione del flag di risparmio a false
        risparmoAttivo = false;
        // Spazio per leggibilità nel corpo del metodo
        // Stampa del messaggio di disattivazione
        System.out.println("  → Sensore " + tipoSensore + ": Risparmio energetico DISATTIVATO");
    }
    
    // Spazio vuoto per leggibilità
    
    // Annotazione che indica l'override di un metodo dell'interfaccia
    @Override
    // Dichiarazione del metodo che legge il consumo attuale
    public double leggiConsumoAttuale() 
    // Apertura del corpo del metodo
    {
        // Ritorno del consumo in base allo stato di risparmio
        return risparmoAttivo ? consumoRisparmio : consumoNormale;
    }
    
    // Spazio vuoto per leggibilità
    
    // Annotazione che indica l'override di un metodo dell'interfaccia
    @Override
    // Dichiarazione del metodo che verifica se il risparmio è attivo
    public boolean isRisparmoAttivo() 
    // Apertura del corpo del metodo
    {
        // Ritorno dello stato del risparmio energetico
        return risparmoAttivo;
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del metodo
    /**
     * Legge il valore dal sensore (simulato)
     */
    // Dichiarazione del metodo che legge il valore dal sensore
    public double leggiValore() 
    // Apertura del corpo del metodo
    {
        // Commento che spiega il tipo di lettura
        // Simulazione della lettura del sensore
        // Assegnazione di un valore casuale all'ultimo valore letto
        ultimoValore = Math.random() * 100;
        // Ritorno dell'ultimo valore letto
        return ultimoValore;
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del getter
    /**
     * Getter del tipo di sensore
     */
    // Dichiarazione del getter per il tipo di sensore
    public String getTipoSensore() 
    // Apertura del corpo del metodo
    {
        // Ritorno del tipo di sensore
        return tipoSensore;
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del getter
    /**
     * Getter dell'ultimo valore letto
     */
    // Dichiarazione del getter per l'ultimo valore
    public double getUltimoValore() 
    // Apertura del corpo del metodo
    {
        // Ritorno dell'ultimo valore letto
        return ultimoValore;
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del metodo
    /**
     * Mostra lo stato dettagliato del sensore
     */
    // Dichiarazione del metodo che visualizza lo stato del sensore
    public void mostraStato() 
    // Apertura del corpo del metodo
    {
        // Stampa della riga superiore del riquadro
        System.out.println("\n╔══════════════════════════════════════╗");
        // Stampa del tipo di sensore in maiuscole
        System.out.println("║ SENSORE: " + tipoSensore.toUpperCase());
        // Stampa dell'ultimo valore letto con formato a 2 decimali
        System.out.println("║ Ultimo valore: " + String.format("%.2f", ultimoValore));
        // Stampa del consumo normale
        System.out.println("║ Consumo normale: " + consumoNormale + "W");
        // Stampa del consumo in risparmio
        System.out.println("║ Consumo risparmio: " + consumoRisparmio + "W");
        // Stampa dello stato del risparmio
        System.out.println("║ Stato risparmio: " + (risparmoAttivo ? "ATTIVO" : "INATTIVO"));
        // Stampa del consumo attuale
        System.out.println("║ Consumo attuale: " + leggiConsumoAttuale() + "W");
        // Stampa della riga inferiore del riquadro
        System.out.println("╚══════════════════════════════════════╝");
    }
    // Chiusura del corpo della classe
}
