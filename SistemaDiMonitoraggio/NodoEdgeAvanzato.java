// Inizio del blocco di commento della sottoclasse
/**
 * Sottoclasse NodoEdgeAvanzato
 * Estende NodoRete e gestisce la logica di analisi dati avanzata
 */
// Dichiarazione della classe che estende la classe astratta NodoRete
public class NodoEdgeAvanzato extends NodoRete 
// Apertura del corpo della classe
{
    // Dichiarazione della variabile istanza per la capacità di elaborazione in MB/s
    private int capacitaElaborazione;
    // Dichiarazione della variabile istanza per la soglia critica di consumo energetico
    private double sogliaCriticaConsumo;
    // Dichiarazione della variabile istanza per il contatore dei dati elaborati
    private int datiElaborati;
    // Dichiarazione della variabile istanza per il reference al sensore associato
    private NodoSensore sensoreAssociato;
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del costruttore
    /**
     * Costruttore di NodoEdgeAvanzato
     * @param id identificativo del nodo
     * @param gestore il gestore di energia
     * @param capacitaElaborazione capacità in MB/s
     * @param sogliaCriticaConsumo soglia massima di consumo in Watt
     */
    // Dichiarazione del costruttore che accetta quattro parametri
    public NodoEdgeAvanzato(String id, GestoreEnergia gestore, int capacitaElaborazione, double sogliaCriticaConsumo) 
    // Apertura del corpo del costruttore
    {
        // Chiamata del costruttore della superclasse NodoRete
        super(id, gestore);
        // Assegnazione della capacità di elaborazione
        this.capacitaElaborazione = capacitaElaborazione;
        // Assegnazione della soglia critica di consumo
        this.sogliaCriticaConsumo = sogliaCriticaConsumo;
        // Inizializzazione del contatore dei dati a 0
        this.datiElaborati = 0;
        // Inizializzazione del sensore a null
        this.sensoreAssociato = null;
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del metodo associaSensore
    /**
     * Associa un sensore a questo nodo edge
     * @param sensore il sensore da associare
     */
    // Dichiarazione del metodo che associa un sensore al nodo
    public void associaSensore(NodoSensore sensore) 
    // Apertura del corpo del metodo
    {
        // Assegnazione del sensore alla variabile istanza sensoreAssociato
        this.sensoreAssociato = sensore;
        // Stampa del messaggio di associazione del sensore
        System.out.println("[" + id + "] Sensore associato: " + sensore.getTipoSensore());
    }
    
    // Spazio vuoto per leggibilità
    
    // Annotazione @Override che indica l'override del metodo elaboraDati della superclasse
    @Override
    // Dichiarazione del metodo che elabora i dati
    public void elaboraDati() 
    // Apertura del corpo del metodo
    {
        // Verifica se il nodo è attivo
        if (!attivo) 
        // Apertura del corpo dell'if
        {
            // Stampa di un messaggio di errore se il nodo non è attivo
            System.out.println("[" + id + "] Errore: nodo non attivo");
            // Ritorno dal metodo per evitare l'elaborazione
            return;
        }
        
        // Verifica se il sensore è stato associato
        if (sensoreAssociato == null) 
        // Apertura del corpo dell'if
        {
            // Stampa di un messaggio di avviso se nessun sensore è associato
            System.out.println("[" + id + "] Avviso: nessun sensore associato");
            // Ritorno dal metodo per evitare l'elaborazione
            return;
        }
        
        // Commento che spiega il prossimo passo: lettura del valore dal sensore
        // Lettura del valore dal sensore associato
        // Assegnazione del valore letto dal sensore alla variabile valore
        double valore = sensoreAssociato.leggiValore();
        // Stampa del messaggio di elaborazione con il valore letto formattato
        System.out.println("[" + id + "] Elaborazione dati: " + String.format("%.2f", valore));
        
        // Commento che spiega il prossimo passo: analisi dei dati
        // Analizza i dati
        // Chiamata del metodo privato di analisi dei dati
        analizzaDati(valore);
        
        // Commento che spiega il prossimo passo: controllo del consumo
        // Controlla il consumo
        // Chiamata del metodo privato di controllo della soglia
        controllaSoglia();
        
        // Commento che spiega il prossimo passo: incremento del contatore
        // Incrementa il contatore
        // Incremento del contatore dei dati elaborati
        datiElaborati++;
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del metodo privato analizzaDati
    /**
     * Analizza i dati ricevuti dal sensore
     * @param valore il valore da analizzare
     */
    // Dichiarazione del metodo privato che analizza i dati
    private void analizzaDati(double valore) 
    // Apertura del corpo del metodo
    {
        // Stampa del messaggio di analisi con il valore e la capacità
        System.out.println("    ↳ Analisi: valore " + String.format("%.2f", valore) + 
                          " processato con capacità " + capacitaElaborazione + " MB/s");
        
        // Commento che spiega la logica successiva di rilevamento anomalie
        // Logica di analisi (esempio: rilevamento anomalie)
        // Verifica se il valore è superiore alla soglia anomala di 80
        if (valore > 80) 
        // Apertura del corpo dell'if
        {
            // Stampa di un messaggio di anomalia rilevata
            System.out.println("    ⚠️  ANOMALIA RILEVATA: valore superiore alla norma!");
        }
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del metodo privato controllaSoglia
    /**
     * Controlla se il consumo supera la soglia critica e agisce di conseguenza
     */
    // Dichiarazione del metodo privato che controlla il consumo
    private void controllaSoglia() 
    // Apertura del corpo del metodo
    {
        // Lettura del consumo attuale dal gestore di energia
        double consumoAttuale = gestore.leggiConsumoAttuale();
        
        // Verifica se il consumo supera la soglia critica
        if (consumoAttuale > sogliaCriticaConsumo) 
        // Apertura del corpo dell'if
        {
            // Stampa del messaggio di soglia critica superata
            System.out.println("    ⚠️  SOGLIA CRITICA: " + consumoAttuale + "W > " + sogliaCriticaConsumo + "W");
            // Stampa del messaggio di attivazione del risparmio energetico
            System.out.println("    → Attivando risparmio energetico...");
            // Attivazione del risparmio energetico nel gestore
            gestore.attivaRisparmoEnergetico();
        }
        // Altrimenti, se il consumo è tornato alla normalità
        else if (gestore.isRisparmoAttivo() && consumoAttuale < (sogliaCriticaConsumo * 0.7)) 
        // Apertura del corpo dell'else if
        {
            // Stampa del messaggio di normalizzazione del consumo
            System.out.println("    ✓ Consumo normalizzato");
            // Disattivazione del risparmio energetico nel gestore
            gestore.disattivaRisparmoEnergetico();
        }
    }
    
    // Spazio vuoto per leggibilità
    
    // Annotazione @Override che indica l'override del metodo getTipoNodo della superclasse
    @Override
    // Dichiarazione del metodo che ritorna il tipo di nodo
    public String getTipoNodo() 
    // Apertura del corpo del metodo
    {
        // Ritorno della stringa che identifica il tipo di nodo
        return "EDGE AVANZATO";
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del getter getCapacitaElaborazione
    /**
     * Getter della capacità di elaborazione
     * @return la capacità in MB/s
     */
    // Dichiarazione del getter della capacità di elaborazione
    public int getCapacitaElaborazione() 
    // Apertura del corpo del metodo
    {
        // Ritorno della capacità di elaborazione
        return capacitaElaborazione;
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del getter getDatiElaborati
    /**
     * Getter dei dati elaborati
     * @return il numero di dati elaborati
     */
    // Dichiarazione del getter dei dati elaborati
    public int getDatiElaborati() 
    // Apertura del corpo del metodo
    {
        // Ritorno del contatore dei dati elaborati
        return datiElaborati;
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del getter getSensoreAssociato
    /**
     * Getter del sensore associato
     * @return il sensore associato al nodo, oppure null se non c'è
     */
    // Dichiarazione del getter del sensore associato
    public NodoSensore getSensoreAssociato() 
    // Apertura del corpo del metodo
    {
        // Ritorno del sensore associato
        return sensoreAssociato;
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del metodo mostraStatoCompleto
    /**
     * Mostra lo stato completo del nodo edge in un riquadro formattato
     */
    // Dichiarazione del metodo che visualizza lo stato completo del nodo
    public void mostraStatoCompleto() 
    // Apertura del corpo del metodo
    {
        // Stampa della riga superiore del riquadro con caratteri speciali
        System.out.println("\n╔══════════════════════════════════════╗");
        // Stampa del titolo del nodo edge
        System.out.println("║ NODO EDGE AVANZATO");
        // Stampa dello stato completo del nodo usando il metodo della superclasse
        System.out.println("║ " + getStato());
        // Stampa della capacità di elaborazione
        System.out.println("║ Capacità: " + capacitaElaborazione + " MB/s");
        // Stampa del numero di dati elaborati
        System.out.println("║ Dati elaborati: " + datiElaborati);
        // Stampa della soglia critica di consumo
        System.out.println("║ Soglia critica: " + sogliaCriticaConsumo + "W");
        // Verifica se il sensore è associato
        if (sensoreAssociato != null) 
        // Apertura del corpo dell'if
        {
            // Stampa del tipo di sensore associato
            System.out.println("║ Sensore: " + sensoreAssociato.getTipoSensore());
        }
        // Stampa della riga inferiore del riquadro con caratteri speciali
        System.out.println("╚══════════════════════════════════════╝");
    }
    
    // Chiusura del corpo della classe NodoEdgeAvanzato
}
