// Inizio del blocco di commento della classe Main
/**
 * Classe Main di Simulazione
 * Assembla i componenti e dimostra il polimorfismo in azione
 */
// Dichiarazione della classe Main
public class Main 
// Apertura del corpo della classe Main
{
    // Dichiarazione del metodo main che è il punto di ingresso del programma
    public static void main(String[] args) 
    // Apertura del corpo del metodo main
    {
        // Stampa della riga superiore decorativa
        
        // Stampa del titolo della simulazione
        System.out.println("  SISTEMA DI MONITORAGGIO EDGE GRID - SIMULAZIONE");
        // Stampa della riga decorativa inferiore
        
        
        // Commento che introduce la fase 1
        // Stampa della fase 1
        System.out.println("1. CREAZIONE SENSORI CON GESTIONE ENERGETICA");
        // Stampa della linea di separazione
        
        
        // Creazione del primo sensore di temperatura
        NodoSensore sensoreTemperatura = new NodoSensore("Temperatura", 15.0, 5.0);
        // Creazione del secondo sensore di umidità
        NodoSensore sensoreUmidita = new NodoSensore("Umidità", 12.0, 4.0);
        // Creazione del terzo sensore di luminosità
        NodoSensore sensoreLuminosita = new NodoSensore("Luminosità", 20.0, 8.0);
        
        // Stampa del messaggio di creazione del sensore di temperatura
        System.out.println("✓ Sensore Temperatura creato (15W normale, 5W risparmio)");
        // Stampa del messaggio di creazione del sensore di umidità
        System.out.println("✓ Sensore Umidità creato (12W normale, 4W risparmio)");
        // Stampa del messaggio di creazione del sensore di luminosità
        System.out.println("✓ Sensore Luminosità creato (20W normale, 8W risparmio)\n");
        
        // Commento che introduce la fase 2
        // Stampa della fase 2
        System.out.println("2. CREAZIONE NODI EDGE AVANZATI");
        // Stampa della linea di separazione
        
        
        // Creazione del primo nodo edge con il sensore di temperatura
        NodoEdgeAvanzato nodoEdge1 = new NodoEdgeAvanzato("EDGE-001", sensoreTemperatura, 500, 25.0);
        // Creazione del secondo nodo edge con il sensore di umidità
        NodoEdgeAvanzato nodoEdge2 = new NodoEdgeAvanzato("EDGE-002", sensoreUmidita, 450, 20.0);
        // Creazione del terzo nodo edge con il sensore di luminosità
        NodoEdgeAvanzato nodoEdge3 = new NodoEdgeAvanzato("EDGE-003", sensoreLuminosita, 600, 30.0);
        
        // Stampa del messaggio di creazione del nodo edge 1
        System.out.println("✓ Nodo Edge-001 creato (Capacità: 500 MB/s, Soglia: 25W)");
        // Stampa del messaggio di creazione del nodo edge 2
        System.out.println("✓ Nodo Edge-002 creato (Capacità: 450 MB/s, Soglia: 20W)");
        // Stampa del messaggio di creazione del nodo edge 3
        System.out.println("✓ Nodo Edge-003 creato (Capacità: 600 MB/s, Soglia: 30W)\n");
        
        // Commento che introduce la fase 3
        // Stampa della fase 3
        System.out.println("3. ASSOCIAZIONE SENSORI A NODI EDGE");
        // Stampa della linea di separazione
        
        
        // Associazione del sensore di temperatura al primo nodo edge
        nodoEdge1.associaSensore(sensoreTemperatura);
        // Associazione del sensore di umidità al secondo nodo edge
        nodoEdge2.associaSensore(sensoreUmidita);
        // Associazione del sensore di luminosità al terzo nodo edge
        nodoEdge3.associaSensore(sensoreLuminosita);
        
        // Stampa di una linea vuota per separazione
        System.out.println();
        
        // Commento che introduce la fase 4
        // Stampa della fase 4
        System.out.println("4. SIMULAZIONE DI ELABORAZIONE DATI");
        // Stampa della linea di separazione
        
        
        // Creazione di un array di tipo NodoRete che contiene i tre nodi edge
        NodoRete[] nodi = {nodoEdge1, nodoEdge2, nodoEdge3};
        
        // Stampa del titolo della prima iterazione
        System.out.println("\n▶ CICLO DI ELABORAZIONE - ITERAZIONE 1\n");
        // Inizio del ciclo for-each per iterare su tutti i nodi
        for (NodoRete nodo : nodi) 
        // Apertura del corpo del ciclo
        {
            // Chiamata del metodo di elaborazione dati su ciascun nodo
            nodo.elaboraDati();
            // Stampa di una linea vuota per separazione
            System.out.println();
        }
        
        // Stampa del titolo della seconda iterazione
        System.out.println("▶ CICLO DI ELABORAZIONE - ITERAZIONE 2\n");
        // Inizio del ciclo for-each per iterare su tutti i nodi
        for (NodoRete nodo : nodi) 
        // Apertura del corpo del ciclo
        {
            // Chiamata del metodo di elaborazione dati su ciascun nodo
            nodo.elaboraDati();
            // Stampa di una linea vuota per separazione
            System.out.println();
        }
        
        // Commento che introduce la fase 5
        // Stampa della fase 5
        System.out.println("\n5. STATO FINALE DEI NODI E SENSORI");
        // Stampa della linea di separazione estesa
        
        
        // Inizio del ciclo for-each per iterare su tutti i nodi
        for (NodoRete nodo : nodi) 
        // Apertura del corpo del ciclo
        {
            // Verifica se il nodo è un'istanza di NodoEdgeAvanzato
            if (nodo instanceof NodoEdgeAvanzato) 
            // Apertura del corpo dell'if
            {
                // Cast del nodo a NodoEdgeAvanzato
                NodoEdgeAvanzato edgeNodo = (NodoEdgeAvanzato) nodo;
                // Chiamata del metodo per visualizzare lo stato completo del nodo
                edgeNodo.mostraStatoCompleto();
                // Verifica se il sensore è stato associato
                if (edgeNodo.getSensoreAssociato() != null) 
                // Apertura del corpo dell'if
                {
                    // Stampa dello stato del sensore associato
                    edgeNodo.getSensoreAssociato().mostraStato();
                }
            }
        }
        
        // Commento che introduce la fase 6
        // Stampa della fase 6
        System.out.println("\n6. TEST DEL CONTROLLO ENERGETICO");
        // Stampa della linea di separazione estesa
        
        
        // Stampa del messaggio di attivazione
        System.out.println("Attivazione consumo massimo:");
        // Disattivazione del risparmio sul sensore di temperatura per consumo massimo
        sensoreTemperatura.disattivaRisparmoEnergetico();
        // Disattivazione del risparmio sul sensore di umidità per consumo massimo
        sensoreUmidita.disattivaRisparmoEnergetico();
        // Disattivazione del risparmio sul sensore di luminosità per consumo massimo
        sensoreLuminosita.disattivaRisparmoEnergetico();
        
        // Stampa del titolo della terza iterazione con consumo massimo
        System.out.println("\n▶ CICLO CON CONSUMO MASSIMO - ITERAZIONE 3\n");
        // Inizio del ciclo for-each per iterare su tutti i nodi
        for (NodoRete nodo : nodi) 
        // Apertura del corpo del ciclo
        {
            // Chiamata del metodo di elaborazione dati su ciascun nodo
            nodo.elaboraDati();
            // Stampa di una linea vuota per separazione
            System.out.println();
        }
        
        // Commento che introduce la fase 7
        // Stampa della fase 7
        System.out.println("\n7. GESTIONE DEL CICLO DI VITA");
        // Stampa della linea di separazione estesa
        
        
        // Stampa del messaggio di spegnimento
        System.out.println("Spegnimento nodo EDGE-001:");
        // Spegnimento del primo nodo edge
        nodoEdge1.spegni();
        // Tentativo di elaborazione dati su nodo spento
        nodoEdge1.elaboraDati();
        
        // Stampa del messaggio di riaccensione
        System.out.println("\nRiaccensione nodo EDGE-001:");
        // Riaccensione del primo nodo edge
        nodoEdge1.accendi();
        // Elaborazione dati su nodo riacceso
        nodoEdge1.elaboraDati();
        
        // Commento che introduce la fase 8
        // Stampa della fase 8
        System.out.println("\n8. RESOCONTO FINALE");
        // Stampa della linea di separazione estesa
        
        
        // Stampa del titolo del resoconto
        System.out.println("Statistiche di elaborazione:\n");
        // Inizio del ciclo for-each per iterare su tutti i nodi
        for (NodoRete nodo : nodi) 
        // Apertura del corpo del ciclo
        {
            // Verifica se il nodo è un'istanza di NodoEdgeAvanzato
            if (nodo instanceof NodoEdgeAvanzato) 
            // Apertura del corpo dell'if
            {
                // Cast del nodo a NodoEdgeAvanzato
                NodoEdgeAvanzato edgeNodo = (NodoEdgeAvanzato) nodo;
                // Stampa delle statistiche del nodo
                System.out.println("  • " + nodo.getId() + " - Dati elaborati: " + 
                                 edgeNodo.getDatiElaborati() + " | Stato: " + 
                                 (nodo.isAttivo() ? "ATTIVO" : "INATTIVO"));
            }
        }
        
        // Calcolo del consumo totale sommando i consumi attuali di tutti i sensori
        // Lettura del consumo attuale del sensore di temperatura
        double consumoTotale = sensoreTemperatura.leggiConsumoAttuale() + 
                              // Aggiunta del consumo attuale del sensore di umidità
                              sensoreUmidita.leggiConsumoAttuale() + 
                              // Aggiunta del consumo attuale del sensore di luminosità
                              sensoreLuminosita.leggiConsumoAttuale();
        
        // Stampa del consumo energetico totale di tutti i sensori
        System.out.println("\n  Consumo energetico totale: " + consumoTotale + "W");
        
        // Stampa della riga di separazione superiore finale
        
        // Stampa del messaggio di completamento
        System.out.println("  SIMULAZIONE COMPLETATA");
        // Stampa della riga di separazione inferiore finale
        
    }
    
    // Chiusura del corpo del metodo main
}
// Chiusura del corpo della classe Main