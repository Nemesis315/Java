// Inizio del blocco di commento della classe astratta
/**
 * Classe Astratta NodoRete
 * Rappresenta lo scheletro di un server di rete con gestione energetica
 */
// Dichiarazione della classe astratta che serve come base per i nodi di rete
public abstract class NodoRete 
// Apertura del corpo della classe
{
    // Dichiarazione della variabile istanza protected per l'ID del nodo
    protected String id;
    // Dichiarazione della variabile istanza protected per il gestore di energia
    protected GestoreEnergia gestore;
    // Dichiarazione della variabile istanza protected per lo stato attivo/inattivo
    protected boolean attivo;
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del costruttore
    /**
     * Costruttore della classe astratta
     * @param id identificativo del nodo
     * @param gestore il gestore di energia associato
     */
    // Dichiarazione del costruttore che accetta id e gestore
    public NodoRete(String id, GestoreEnergia gestore) 
    // Apertura del corpo del costruttore
    {
        // Assegnazione del parametro id alla variabile istanza this.id
        this.id = id;
        // Assegnazione del parametro gestore alla variabile istanza this.gestore
        this.gestore = gestore;
        // Inizializzazione dello stato attivo a true
        this.attivo = true;
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del metodo astratto elaboraDati
    /**
     * Metodo astratto per elaborare i dati
     */
    // Dichiarazione del metodo astratto che deve essere implementato dalle sottoclassi
    public abstract void elaboraDati();
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del metodo astratto getTipoNodo
    /**
     * Metodo astratto per ottenere il tipo di nodo
     * @return il tipo di nodo come stringa
     */
    // Dichiarazione del metodo astratto che ritorna il tipo di nodo
    public abstract String getTipoNodo();
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del metodo concreto spegni
    /**
     * Metodo concreto per spegnere il nodo
     */
    // Dichiarazione del metodo concreto spegni
    public void spegni() 
    // Apertura del corpo del metodo
    {
        // Impostazione della variabile attivo a false per spegnere il nodo
        attivo = false;
        // Stampa del messaggio di spegnimento con l'ID del nodo
        System.out.println("[" + id + "] Nodo spento");
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del metodo concreto accendi
    /**
     * Metodo concreto per accendere il nodo
     */
    // Dichiarazione del metodo concreto accendi
    public void accendi() 
    // Apertura del corpo del metodo
    {
        // Impostazione della variabile attivo a true per accendere il nodo
        attivo = true;
        // Stampa del messaggio di accensione con l'ID del nodo
        System.out.println("[" + id + "] Nodo acceso");
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del metodo concreto getStato
    /**
     * Metodo concreto per ottenere lo stato del nodo con tutte le informazioni
     * @return una stringa contenente lo stato completo del nodo
     */
    // Dichiarazione del metodo concreto getStato che ritorna una stringa
    public String getStato() 
    // Apertura del corpo del metodo
    {
        // Ritorno della stringa concatenata con le informazioni dello stato del nodo
        return "ID: " + id + 
               // Aggiunta del tipo di nodo
               " | Tipo: " + getTipoNodo() + 
               // Aggiunta dello stato attivo/inattivo
               " | Stato: " + (attivo ? "ATTIVO" : "INATTIVO") + 
               // Aggiunta del consumo energetico attuale
               " | Consumo: " + gestore.leggiConsumoAttuale() + "W" +
               // Aggiunta dello stato risparmio energetico
               " | Risparmio: " + (gestore.isRisparmoAttivo() ? "SI" : "NO");
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del getter getId
    /**
     * Getter per l'ID del nodo
     * @return l'identificativo del nodo
     */
    // Dichiarazione del metodo getter getId che ritorna una stringa
    public String getId() 
    // Apertura del corpo del metodo
    {
        // Ritorno dell'ID del nodo
        return id;
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del getter getGestore
    /**
     * Getter per il gestore energetico
     * @return il gestore di energia del nodo
     */
    // Dichiarazione del metodo getter getGestore
    public GestoreEnergia getGestore() 
    // Apertura del corpo del metodo
    {
        // Ritorno del gestore di energia
        return gestore;
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del metodo isAttivo
    /**
     * Verifica se il nodo è attivo
     * @return true se il nodo è attivo, false se è spento
     */
    // Dichiarazione del metodo isAttivo che ritorna un boolean
    public boolean isAttivo() 
    // Apertura del corpo del metodo
    {
        // Ritorno dello stato attivo del nodo
        return attivo;
    }
    
    // Chiusura del corpo della classe astratta
}