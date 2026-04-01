// Inizio del blocco di commento della classe
/**
 * Interfaccia GestoreEnergia
 * Definisce il contratto per la gestione dell'energia nei nodi di rete
 */
// Dichiarazione dell'interfaccia pubblica GestoreEnergia
public interface GestoreEnergia 
// Apertura del corpo dell'interfaccia
{
    // Inizio della documentazione del primo metodo astratto
    /**
     * Attiva la modalità di risparmio energetico
     */
    // Dichiarazione del primo metodo astratto per attivare il risparmio energetico
    void attivaRisparmoEnergetico();
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del secondo metodo astratto
    /**
     * Disattiva la modalità di risparmio energetico
     */
    // Dichiarazione del secondo metodo astratto per disattivare il risparmio energetico
    void disattivaRisparmoEnergetico();
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del terzo metodo astratto
    /**
     * Legge il consumo attuale di energia in Watt
     * @return il consumo energetico attuale in Watt
     */
    // Dichiarazione del terzo metodo astratto che restituisce un double
    double leggiConsumoAttuale();
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del quarto metodo astratto
    /**
     * Restituisce lo stato del risparmio energetico
     * @return true se il risparmio è attivo, false altrimenti
     */
    // Dichiarazione del quarto metodo astratto che restituisce un boolean
    boolean isRisparmoAttivo();
    
    // Chiusura del corpo dell'interfaccia
}
