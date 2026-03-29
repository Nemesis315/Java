// Inizio del blocco commento della classe astratta
/**
 * Classe Astratta NodoRete
 * Rappresenta lo scheletro di un server di rete con gestione energetica (Composizione)
 */
// Dichiarazione della classe astratta che serve come base per i nodi di rete
public abstract class NodoRete 
// Apertura del corpo della classe
{
    // Dichiarazione della variabile istanza per l'ID del nodo
    protected String id;
    // Dichiarazione della variabile istanza per il gestore di energia (Composizione)
    protected GestoreEnergia gestore; // Composizione
    // Dichiarazione della variabile istanza per lo stato attivo/inattivo del nodo
    protected boolean attivo;
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del costruttore
    /**
     * Costruttore della classe astratta
     * @param id identificativo del nodo
     * @param gestore il gestore di energia associato
     */
    // Dichiarazione del costruttore che accetta l'ID e il gestore di energia
    public NodoRete(String id, GestoreEnergia gestore) 
    // Apertura del corpo del costruttore
    {
        // Assegnazione del parametro id alla variabile istanza
        this.id = id;
        // Assegnazione del parametro gestore alla variabile istanza
        this.gestore = gestore;
        // Inizializzazione dello stato attivo a true
        this.attivo = true;
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del metodo astratto
    /**
     * Metodo astratto per elaborare i dati
     */
    // Dichiarazione del metodo astratto per l'elaborazione dei dati
    public abstract void elaboraDati();
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del metodo astratto
    /**
     * Metodo astratto per ottenere il tipo di nodo
     */
    // Dichiarazione del metodo astratto che restituisce il tipo di nodo
    public abstract String getTipoNodo();
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del metodo concreto
    /**
     * Metodo concreto per spegnere il nodo
     */
    // Dichiarazione del metodo concreto spegni
    public void spegni() 
    // Apertura del corpo del metodo
    {
        // Impostazione dello stato attivo a false
        attivo = false;
        // Stampa del messaggio di spegnimento
        System.out.println("[" + id + "] Nodo spento");
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del metodo concreto
    /**
     * Metodo concreto per accendere il nodo
     */
    // Dichiarazione del metodo concreto accendi
    public void accendi() 
    // Apertura del corpo del metodo
    {
        // Impostazione dello stato attivo a true
        attivo = true;
        // Stampa del messaggio di accensione
        System.out.println("[" + id + "] Nodo acceso");
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del metodo concreto
    /**
     * Metodo concreto per ottenere lo stato del nodo
     */
    // Dichiarazione del metodo concreto getStato
    public String getStato() 
    // Apertura del corpo del metodo
    {
        // Ritorno della stringa con le informazioni dello stato del nodo
        return "ID: " + id + 
               " | Tipo: " + getTipoNodo() + 
               " | Stato: " + (attivo ? "ATTIVO" : "INATTIVO") + 
               " | Consumo: " + gestore.leggiConsumoAttuale() + "W" +
               " | Risparmio: " + (gestore.isRisparmoAttivo() ? "SI" : "NO");
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del getter
    /**
     * Getter per l'ID del nodo
     */
    // Dichiarazione del metodo getter getId
    public String getId() 
    // Apertura del corpo del metodo
    {
        // Ritorno dell'ID del nodo
        return id;
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del getter
    /**
     * Getter per il gestore energetico
     */
    // Dichiarazione del metodo getter getGestore
    public GestoreEnergia getGestore() 
    // Apertura del corpo del metodo
    {
        // Ritorno del gestore di energia
        return gestore;
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del metodo
    /**
     * Verifica se il nodo è attivo
     */
    // Dichiarazione del metodo isAttivo
    public boolean isAttivo() 
    // Apertura del corpo del metodo
    {
        // Ritorno dello stato attivo
        return attivo;
    }
    // Chiusura del corpo della classe
}