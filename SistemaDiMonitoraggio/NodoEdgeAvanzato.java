// Inizio del blocco commento della sottoclasse
/**
 * Sottoclasse NodoEdgeAvanzato
 * Estende NodoRete e gestisce la logica di analisi dati avanzata
 */
// Dichiarazione della classe che estende NodoRete
public class NodoEdgeAvanzato extends NodoRete 
// Apertura del corpo della classe
{
    // Dichiarazione della capacità di elaborazione in MB/s
    private int capacitaElaborazione; // In MB/s
    // Dichiarazione della soglia critica di consumo energetico
    private double sogliaCriticaConsumo; // Consumo massimo consentito
    // Dichiarazione del contatore dei dati elaborati
    private int datiElaborati;
    // Dichiarazione del reference al sensore associato
    private NodoSensore sensoreAssociato;
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del costruttore
    /**
     * Costruttore di NodoEdgeAvanzato
     * @param id identificativo del nodo
     * @param gestore il gestore di energia
     * @param capacitaElaborazione capacità in MB/s
     * @param sogliaCriticaConsumo soglia massima di consumo
     */
    // Dichiarazione del costruttore che accetta i parametri per il nodo edge
    public NodoEdgeAvanzato(String id, GestoreEnergia gestore,int capacitaElaborazione, double sogliaCriticaConsumo)                 
    // Apertura del corpo del costruttore
    {
        // Chiamata del costruttore della superclasse con id e gestore
        super(id, gestore);
        // Assegnazione della capacità di elaborazione
        this.capacitaElaborazione = capacitaElaborazione;
        // Assegnazione della soglia critica di consumo
        this.sogliaCriticaConsumo = sogliaCriticaConsumo;
        // Inizializzazione del contatore dei dati
        this.datiElaborati = 0;
        // Inizializzazione del sensore a null
        this.sensoreAssociato = null;
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del metodo
    /**
     * Associa un sensore a questo nodo edge
     */
    // Dichiarazione del metodo che associa un sensore al nodo
    public void associaSensore(NodoSensore sensore) 
    // Apertura del corpo del metodo
    {
        // Assegnazione del sensore alle variabile istanza
        this.sensoreAssociato = sensore;
        // Stampa del messaggio di associazione
        System.out.println("[" + id + "] Sensore associato: " + sensore.getTipoSensore());
    }
    
    // Spazio vuoto per leggibilità
    
    // Annotazione che indica l'override di un metodo della superclasse
    @Override
    // Dichiarazione del metodo che elabora i dati
    public void elaboraDati() 
    // Apertura del corpo del metodo
    {
        // Verifica se il nodo è attivo
        if (!attivo) 
        // Apertura del corpo del if
        {
            // Stampa di un messaggio di errore
            System.out.println("[" + id + "] Errore: nodo non attivo, impossibile elaborare dati");
            // Ritorno dal metodo
            return;
        }
        
        // Verifica se il sensore è stato associato
        if (sensoreAssociato == null) 
        // Apertura del corpo del if
        {
            // Stampa di un messaggio di avviso
            System.out.println("[" + id + "] Avviso: nessun sensore associato");
            // Ritorno dal metodo
            return;
        }
        
        // Commento che spiega il prossimo passo
        // Legge il valore dal sensore
        // Lettura del valore dal sensore associato
        double valore = sensoreAssociato.leggiValore();
        // Stampa del messaggio di elaborazione
        System.out.println("[" + id + "] Elaborazione dati del sensore: " + 
                          String.format("%.2f", valore));
        
        // Commento che spiega il prossimo passo
        // Analizza i dati
        // Chiamata del metodo di analisi dei dati
        analizzaDati(valore);
        
        // Commento che spiega il prossimo passo
        // Controlla il consumo
        // Chiamata del metodo di controllo della soglia
        controllaSoglia();
        
        // Commento che spiega il prossimo passo
        // Incrementa il contatore
        // Incremento del contatore dei dati elaborati
        datiElaborati++;
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del metodo privato
    /**
     * Analizza i dati ricevuti
     */
    // Dichiarazione del metodo privato che analizza i dati
    private void analizzaDati(double valore) 
    // Apertura del corpo del metodo
    {
        // Stampa del messaggio di analisi
        System.out.println("    ↳ Analisi: valore " + String.format("%.2f", valore) + 
                          " processato con capacità " + capacitaElaborazione + " MB/s");
        
        // Commento che spiega la logica successiva
        // Logica di analisi (esempio: rilevamento anomalie)
        // Verifica se il valore è superiore alla soglia anomala
        if (valore > 80) 
        // Apertura del corpo del if
        {
            // Stampa di un messaggio di anomalia
            System.out.println("    ⚠️  ANOMALIA RILEVATA: valore superiore alla norma!");
        }
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del metodo privato
    /**
     * Controlla se il consumo supera la soglia critica
     */
    // Dichiarazione del metodo privato che controlla il consumo
    private void controllaSoglia() 
    // Apertura del corpo del metodo
    {
        // Lettura del consumo attuale dal gestore
        double consumoAttuale = gestore.leggiConsumoAttuale();
        
        // Verifica se il consumo supera la soglia critica
        if (consumoAttuale > sogliaCriticaConsumo) 
        // Apertura del corpo del if
        {
            // Stampa del messaggio di soglia critica
            System.out.println("    ⚠️  SOGLIA CRITICA: consumo " + consumoAttuale + 
                              "W supera il limite di " + sogliaCriticaConsumo + "W");
            // Stampa del messaggio di attivazione
            System.out.println("    → Attivando risparmio energetico automatico...");
            // Attivazione del risparmio energetico
            gestore.attivaRisparmoEnergetico();
        }
        // Else block che verifica la condizione opposta
        else
        // Apertura del corpo dell'else
        {
            // Verifica se il consumo è ritornato alla normalità
            if (gestore.isRisparmoAttivo() && consumoAttuale < (sogliaCriticaConsumo * 0.7)) 
            // Apertura del corpo del if interno
            {
                // Stampa del messaggio di normalizzazione
                System.out.println("    ✓ Consumo normalizzato, disattivando risparmio energetico");
                // Disattivazione del risparmio energetico
                gestore.disattivaRisparmoEnergetico();
            }
        }
    }
    
    // Spazio vuoto per leggibilità
    
    // Annotazione che indica l'override di un metodo della superclasse
    @Override
    // Dichiarazione del metodo che ritorna il tipo di nodo
    public String getTipoNodo() 
    // Apertura del corpo del metodo
    {
        // Ritorno della stringa che identifica il tipo
        return "EDGE AVANZATO";
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del getter
    /**
     * Getter della capacità di elaborazione
     */
    // Dichiarazione del getter della capacità
    public int getCapacitaElaborazione() 
    // Apertura del corpo del metodo
    {
        // Ritorno della capacità di elaborazione
        return capacitaElaborazione;
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del getter
    /**
     * Getter dei dati elaborati
     */
    // Dichiarazione del getter dei dati
    public int getDatiElaborati() 
    // Apertura del corpo del metodo
    {
        // Ritorno del contatore dei dati
        return datiElaborati;
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del getter
    /**
     * Getter del sensore associato
     */
    // Dichiarazione del getter del sensore
    public NodoSensore getSensoreAssociato() 
    // Apertura del corpo del metodo
    {
        // Ritorno del sensore associato
        return sensoreAssociato;
    }
    
    // Spazio vuoto per leggibilità
    
    // Inizio della documentazione del metodo
    /**
     * Mostra lo stato completo del nodo edge
     */
    // Dichiarazione del metodo che visualizza lo stato
    public void mostraStatoCompleto() 
    // Apertura del corpo del metodo
    {
        // Stampa della riga superiore del riquadro
        System.out.println("\n╔════════════════════════════════════════╗");
        // Stampa del titolo del nodo
        System.out.println("║ NODO EDGE AVANZATO");
        // Stampa dello stato dal metodo della superclasse
        System.out.println("║ " + getStato());
        // Stampa della capacità di elaborazione
        System.out.println("║ Capacità: " + capacitaElaborazione + " MB/s");
        // Stampa dei dati elaborati
        System.out.println("║ Dati elaborati: " + datiElaborati);
        // Stampa della soglia critica
        System.out.println("║ Soglia critica: " + sogliaCriticaConsumo + "W");
        // Verifica se il sensore è presente
        if (sensoreAssociato != null) 
            {
            // Stampa del tipo di sensore associato
            System.out.println("║ Sensore: " + sensoreAssociato.getTipoSensore());
        }
        // Stampa della riga inferiore del riquadro
        System.out.println("╚════════════════════════════════════════╝");
    }
    // Chiusura del corpo della classe

};