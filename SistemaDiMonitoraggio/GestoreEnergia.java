// Inizio del blocco commento della classe
/**
 * Interfaccia GestoreEnergia
 * Definisce il contratto per la gestione dell'energia nei nodi di rete
 */
// Dichiarazione dell'interfaccia pubblica
public interface GestoreEnergia 
// Apertura del corpo dell'interfaccia
{
    // Inizio della documentazione del primo metodo
    /**
     * Attiva la modalità di risparmio energetico
     */
    // Dichiarazione del metodo abstract per attivare il risparmio energetico
    void attivaRisparmoEnergetico();
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del secondo metodo
    /**
     * Disattiva la modalità di risparmio energetico
     */
    // Dichiarazione del metodo abstract per disattivare il risparmio energetico
    void disattivaRisparmoEnergetico();
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del terzo metodo
    /**
     * Legge il consumo attuale di energia in Watt
     * @return consumo energetico attuale
     */
    // Dichiarazione del metodo abstract che restituisce un double
    double leggiConsumoAttuale();
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del quarto metodo
    /**
     * Restituisce lo stato di risparmio energetico
     * @return true se il risparmio è attivo, false altrimenti
     */
    // Dichiarazione del metodo abstract che restituisce un boolean
    boolean isRisparmoAttivo();
    // Chiusura del corpo dell'interfaccia
}
