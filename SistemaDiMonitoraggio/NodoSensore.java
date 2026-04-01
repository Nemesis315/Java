// Inizio del blocco di commento della classe concreta
/**
 * Classe Concreta NodoSensore
 * Implementa l'interfaccia GestoreEnergia
 * Rappresenta un piccolo sensore con gestione energetica specifica
 */
// Dichiarazione della classe che implementa l'interfaccia GestoreEnergia
public class NodoSensore implements GestoreEnergia 
// Apertura del corpo della classe
{
    // Dichiarazione della variabile istanza per il consumo di energia in modalità normale
    private double consumoNormale;
    // Dichiarazione della variabile istanza per il consumo di energia in modalità risparmio
    private double consumoRisparmio;
    // Dichiarazione della variabile istanza booleana per il flag di risparmio energetico
    private boolean risparmoAttivo;
    // Dichiarazione della variabile istanza per l'ultimo valore letto dal sensore
    private double ultimoValore;
    // Dichiarazione della variabile istanza stringa che identifica il tipo di sensore
    private String tipoSensore;
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del costruttore
    /**
     * Costruttore di NodoSensore
     * @param tipoSensore il tipo di sensore (temperatura, umidità, luminosità, ecc.)
     * @param consumoNormale consumo in watt in modalità normale
     * @param consumoRisparmio consumo in watt in modalità risparmio
     */
    // Dichiarazione del costruttore che accetta tre parametri
    public NodoSensore(String tipoSensore, double consumoNormale, double consumoRisparmio) 
    // Apertura del corpo del costruttore
    {
        // Assegnazione del parametro tipoSensore alla variabile istanza
        this.tipoSensore = tipoSensore;
        // Assegnazione del parametro consumoNormale alla variabile istanza
        this.consumoNormale = consumoNormale;
        // Assegnazione del parametro consumoRisparmio alla variabile istanza
        this.consumoRisparmio = consumoRisparmio;
        // Inizializzazione del flag risparmoAttivo a false
        this.risparmoAttivo = false;
        // Inizializzazione dell'ultimoValore a 0.0
        this.ultimoValore = 0.0;
    }
    
    // Spazio vuoto per leggibilità
    
    // Annotazione @Override che indica l'override di un metodo dell'interfaccia
    @Override
    // Dichiarazione del metodo che implementa attivaRisparmoEnergetico dell'interfaccia
    public void attivaRisparmoEnergetico() 
    // Apertura del corpo del metodo
    {
        // Impostazione del flag risparmoAttivo a true per attivare il risparmio
        risparmoAttivo = true;
        // Stampa del messaggio di attivazione del risparmio energetico
        System.out.println("  → Sensore " + tipoSensore + ": Risparmio energetico ATTIVATO");
    }
    
    // Spazio vuoto per leggibilità
    
    // Annotazione @Override che indica l'override di un metodo dell'interfaccia
    @Override
    // Dichiarazione del metodo che implementa disattivaRisparmoEnergetico dell'interfaccia
    public void disattivaRisparmoEnergetico() 
    // Apertura del corpo del metodo
    {
        // Impostazione del flag risparmoAttivo a false per disattivare il risparmio
        risparmoAttivo = false;
        // Stampa del messaggio di disattivazione del risparmio energetico
        System.out.println("  → Sensore " + tipoSensore + ": Risparmio energetico DISATTIVATO");
    }
    
    // Spazio vuoto per leggibilità
    
    // Annotazione @Override che indica l'override di un metodo dell'interfaccia
    @Override
    // Dichiarazione del metodo che implementa leggiConsumoAttuale dell'interfaccia
    public double leggiConsumoAttuale() 
    // Apertura del corpo del metodo
    {
        // Ritorno del consumo in base allo stato del risparmio (operatore ternario)
        return risparmoAttivo ? consumoRisparmio : consumoNormale;
    }
    
    // Spazio vuoto per leggibilità
    
    // Annotazione @Override che indica l'override di un metodo dell'interfaccia
    @Override
    // Dichiarazione del metodo che implementa isRisparmoAttivo dell'interfaccia
    public boolean isRisparmoAttivo() 
    // Apertura del corpo del metodo
    {
        // Ritorno dello stato del flag risparmoAttivo
        return risparmoAttivo;
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del metodo leggiValore
    /**
     * Legge il valore dal sensore (simulato)
     * @return un valore casuale tra 0 e 100
     */
    // Dichiarazione del metodo che legge il valore dal sensore
    public double leggiValore() 
    // Apertura del corpo del metodo
    {
        // Commento che spiega il tipo di lettura
        // Simulazione della lettura del sensore
        // Assegnazione di un valore casuale moltiplicato per 100 all'ultimoValore
        ultimoValore = Math.random() * 100;
        // Ritorno dell'ultimoValore che è stato appena letto
        return ultimoValore;
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del getter getTipoSensore
    /**
     * Getter del tipo di sensore
     * @return il tipo di sensore come stringa
     */
    // Dichiarazione del getter per il tipo di sensore
    public String getTipoSensore() 
    // Apertura del corpo del metodo
    {
        // Ritorno del tipo di sensore
        return tipoSensore;
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del getter getUltimoValore
    /**
     * Getter dell'ultimo valore letto
     * @return l'ultimo valore letto dal sensore
     */
    // Dichiarazione del getter per l'ultimo valore
    public double getUltimoValore() 
    // Apertura del corpo del metodo
    {
        // Ritorno dell'ultimoValore
        return ultimoValore;
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del metodo mostraStato
    /**
     * Mostra lo stato dettagliato del sensore in un riquadro formattato
     */
    // Dichiarazione del metodo che visualizza lo stato del sensore
    public void mostraStato() 
    // Apertura del corpo del metodo
    {
        // Stampa della riga superiore del riquadro con caratteri speciali
        System.out.println("\n╔══════════════════════════════════════╗");
        // Stampa del tipo di sensore in maiuscole all'interno del riquadro
        System.out.println("║ SENSORE: " + tipoSensore.toUpperCase());
        // Stampa dell'ultimo valore letto formattato con due decimali
        System.out.println("║ Ultimo valore: " + String.format("%.2f", ultimoValore));
        // Stampa del consumo normale di energia
        System.out.println("║ Consumo normale: " + consumoNormale + "W");
        // Stampa del consumo in risparmio energetico
        System.out.println("║ Consumo risparmio: " + consumoRisparmio + "W");
        // Stampa dello stato del risparmio (ATTIVO o INATTIVO)
        System.out.println("║ Stato risparmio: " + (risparmoAttivo ? "ATTIVO" : "INATTIVO"));
        // Stampa del consumo attuale basato sullo stato di risparmio
        System.out.println("║ Consumo attuale: " + leggiConsumoAttuale() + "W");
        // Stampa della riga inferiore del riquadro con caratteri speciali
        System.out.println("╚══════════════════════════════════════╝");
    }
    
    // Chiusura del corpo della classe NodoSensore
}
