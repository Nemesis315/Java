

// Importazioni necessarie per gli Esercizi:
import java.util.Scanner;         // Per l'input da console e file.
import java.io.File;              // Per gestire i file.
import java.io.PrintWriter;       // Per scrivere sui file.
import java.io.FileNotFoundException; // Eccezione per la gestione dei file.
import java.util.Calendar;        // Interfaccia base per data/ora.
import java.util.GregorianCalendar; // Implementazione specifica della data/ora.
import java.text.SimpleDateFormat;  // Per formattare la data.
import java.util.ArrayList;       // Per la lista dinamica nell'I/O su file.

// La classe principale che contiene il metodo main, punto di partenza del programma.
public class DemoLezione { // Classe dimostrativa con il metodo main.

    public static void main(String[] args) { // Punto d'ingresso dell'applicazione Java.
        
        // Dichiarazione e Inizializzazione delle variabili per l'anno e mese correnti.
        int annoCorrente = 0; // Variabile che conterrà l'anno corrente.
        int meseCorrente = 0; // Variabile che conterrà il mese corrente.

        // Creazione di un oggetto GregorianCalendar per l'anno di riferimento.
        GregorianCalendar dataCorrente = new GregorianCalendar(); // Ottiene la data/ora corrente.

        // Ottenere singoli attributi (usando costanti statiche della classe Calendar).
        annoCorrente = dataCorrente.get(Calendar.YEAR); // Estrae l'anno dalla data corrente.
        // Gennaio � 0, quindi aggiungiamo 1 per il mese corretto.
        meseCorrente = dataCorrente.get(Calendar.MONTH) + 1; // Estrae il mese (corretto +1) dalla data corrente.
        
        // Stampa a video l'anno corrente.
        System.out.println("Anno di riferimento: " + annoCorrente); // Stampa l'anno di riferimento ottenuto.
        System.out.println("------------------------------------------"); // Stampa una linea di separazione.


        // --- Esercizio 1: Incapsulamento e Metodi (Classe Rettangolo) ---
        System.out.println("--- Esercizio 1: Incapsulamento e Metodi ---"); // Titolo esercizio 1.

        // Creazione di un oggetto Rettangolo.
        Rettangolo mioRettangolo = new Rettangolo(5.0, 10.0); // Istanzia un Rettangolo con base 5 e altezza 10.

        // Invocazione di un metodo sull'oggetto per calcolare l'area.
        System.out.println("Area iniziale: " + mioRettangolo.calcolaArea()); // Stampa l'area iniziale del rettangolo.

        // Modifica l'attributo 'base' tramite il metodo SETTER.
        mioRettangolo.setBase(7.5); // Aggiorna la base del rettangolo.
        
        // Stampa i dettagli dell'oggetto dopo la modifica.
        System.out.println(mioRettangolo.dettagli()); // Stampa i dettagli aggiornati del rettangolo.
        System.out.println("------------------------------------------"); // Separation line after exercise.

        // --- Esercizio 2: Costruttori con Overloading (Classe Persona) ---
        System.out.println("--- Esercizio 2: Costruttori con Overloading ---"); // Titolo esercizio 2.
        
        // Correzione: Uso del Costruttore 1. Ho eliminato 'annoCorrente' come parametro 
        // dato che Costruttore 1 in Persona.java prende solo il nome.
        Persona p1 = new Persona("Mario"); // Istanzia una persona p1 con nome Mario.
        System.out.println("Persona 1: " + p1.dettagli()); // Stampa i dettagli di p1.

        // Uso del Costruttore 2 (due parametri).
        Persona p2 = new Persona("Luisa", 25); // Istanzia p2 con nome e età.
        System.out.println("Persona 2: " + p2.dettagli()); // Stampa i dettagli di p2.

        // Invocazione di un metodo.
        p2.compiCompleanno(); // Incrementa l'età di p2 di 1.
        System.out.println("Dopo il compleanno: " + p2.dettagli()); // Stampa dettagli aggiornati di p2.
        System.out.println("------------------------------------------"); // Separatore dopo esercizio 2.
        
        // --- Esercizio 3: Input da Tastiera (Scanner) ---
        System.out.println("--- Esercizio 3: Input da Tastiera (Scanner) ---"); // Titolo esercizio 3: input.
        // Creazione di un oggetto Scanner per leggere l'input da tastiera (System.in).
        Scanner input = new Scanner(System.in); // Scanner per leggere l'input da console.

        System.out.print("Inserisci un numero intero (et�): "); // Prompt per l'età.
        // Legge e restituisce il prossimo intero dall'input.
        int etaInserita = input.nextInt(); // Legge l'intero immesso dall'utente.

        // Consuma il carattere 'Invio' residuo dopo nextInt() (Fondamentale).
        input.nextLine(); // Consuma il newline residuo del buffer.

        System.out.print("Inserisci il tuo nome: "); // Prompt per il nome.
        // Legge l'intera riga, includendo gli spazi.
        String nomeInserito = input.nextLine(); // Legge la riga completa con il nome.

        // Creazione di un nuovo oggetto Persona con i dati inseriti dall'utente.
        Persona utente = new Persona(nomeInserito, etaInserita); // Crea una Persona con i dati forniti.

        System.out.println("Oggetto creato: " + utente.dettagli()); // Stampa i dettagli dell'utente creato.
        System.out.println("------------------------------------------"); // Separatore dopo esercizio 3.
        

        // --- Esercizio 4: I/O su File (Aggiungi Numero Riga) ---
        System.out.println("--- Esercizio 4: I/O su File (Aggiungi Numero Riga) ---"); // Titolo esercizio 4.

        // Utilizzo del blocco try-catch per gestire l'eccezione di file non trovato.
        try { // Try per la lettura e scrittura di file (gestione FileNotFoundException).
            // 1. INPUT: Crea un oggetto File che punta a "input.txt" (deve esistere).
            File inputFile = new File("input.txt"); // Riferimento al file di input.
            // Crea un oggetto Scanner per leggere il contenuto del file.
            Scanner fileIn = new Scanner(inputFile); // Scanner per leggere il file di input.

            // 2. OUTPUT: Crea un oggetto PrintWriter per scrivere sul file "output_numerato.txt".
            PrintWriter fileOut = new PrintWriter("output_numerato.txt"); // PrintWriter per scrivere il file di output numerato.
            
            int numeroRiga = 1; // Contatore delle righe.

            // Loop che continua finche ci sono righe da leggere nel file.
            while (fileIn.hasNextLine()) { // Loop di lettura: scorre ogni riga del file di input.
                String rigaOriginale = fileIn.nextLine(); // Legge la riga corrente.
                // Scrive nel file di output, anteponendo il contatore di riga.
                fileOut.println(numeroRiga + ": " + rigaOriginale); // Scrive la riga numerata su output.
                numeroRiga++; // Incrementa il contatore.
            } // Fine while: lettura dal file di input.

            fileIn.close();  // IMPORTANTE: Chiude lo stream di input.
            fileOut.close(); // IMPORTANTE: Chiude lo stream di output e salva i dati.
            
            System.out.println("Operazione completata. Controlla il file 'output_numerato.txt'."); // Notifica operazione finita.

        } catch (FileNotFoundException e) { // Catch se input.txt non è disponibile.
            // Cattura l'errore se "input.txt" non viene trovato.
            System.out.println("ERRORE: File di input (input.txt) non trovato. Crea il file e riprova."); // Messaggio di errore per file mancante.
        }

        System.out.println("------------------------------------------"); // Separator.
        
        
        // --- Esercizio 5: Gestione Data e Ora (Classe GregorianCalendar) ---
        System.out.println("--- Esercizio 5: Gestione Data e Ora ---"); // Titolo esercizio 5.

        // Stampa i dati di data/ora (gia estratti all'inizio).
        System.out.println("Anno: " + annoCorrente + ", Mese: " + meseCorrente); // Stampa anno e mese correnti.

        // 2. Formattazione: uso della classe SimpleDateFormat.
        // Definisce il pattern di formattazione desiderato.
        SimpleDateFormat formattaItaliano = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss"); // Formattazione italiana per la data.

        // Applica il formato all'oggetto Date ottenuto da GregorianCalendar.
        String dataFormattata = formattaItaliano.format(dataCorrente.getTime()); // Converte la data in stringa formattata.

        System.out.println("Data e Ora Correnti Formattate: " + dataFormattata); // Stampa la data formattata.
        System.out.println("------------------------------------------"); // Separator.

        // --- Esercizio 6: Array di Oggetti, Scrittura e Lettura su File (Classe Impiegato) ---
        System.out.println("--- Esercizio 6: Array di Oggetti e I/O File ---"); // Titolo esercizio 6.
        // Questo esercizio non era nel tuo codice, l'ho ripristinato dalla versione precedente.

        // Creazione dell'array di 10 oggetti Impiegato (alloca spazio per 10 reference).
        Impiegato[] dipendenti = new Impiegato[10]; // Array che conterrà 10 oggetti Impiegato.

        // Ciclo per creare i 10 oggetti Impiegato e assegnare i reference all'array.
        for (int i = 0; i < 10; i++) { // Ciclo per creare i 10 impiegati.
            dipendenti[i] = new Impiegato("Nome" + i, "Cognome" + i, 50000.0 + (i * 1000)); // Crea un nuovo Impiegato alla posizione i.
        } // Fine for: creazione impiegati.

        // --- SCRITTURA DELL'ARRAY SU FILE (Serializzazione Semplice) ---
        
        try { // Try per la scrittura dell'array su file.
            PrintWriter out = new PrintWriter("dipendenti.txt"); // Crea il writer per scrivere il file dipendenti.txt.
            for (Impiegato imp : dipendenti) { // Itera sull'array per scrivere ogni impiegato su file.
                out.println(imp.getNome() + "," + imp.getCognome() + "," + imp.getSalario()); // Scrive i dati dell'impiegato separati da virgole.
            } // Fine for: scrittura dipendenti su file.
            out.close(); // Chiude il PrintWriter usato per salvare i dipendenti.
            System.out.println("Salvataggio completato in 'dipendenti.txt'."); // Notifica del salvataggio completato.

        } catch (FileNotFoundException exc) { // Gestione dell'eccezione in scrittura su file.
            System.out.println("ERRORE durante la scrittura su file: " + exc.getMessage()); // Stampa l'errore riscontrato.
        } // Fine catch per scrittura file dipendenti


        // --- LETTURA E STAMPA DEI DATI DAL FILE (Deserializzazione Semplice) ---

        ArrayList<Impiegato> dipendentiLetti = new ArrayList<>(); // Lista dove aggiungere gli impiegati letti dal file.
        
        try { // Try per la lettura di dipendenti.txt.
            File inputDipendenti = new File("dipendenti.txt"); // Riferimento al file creato precedentemente.
            Scanner in = new Scanner(inputDipendenti); // Scanner per leggere il file dipendenti.txt.

            while (in.hasNextLine()) { // Loop per leggere riga per riga il file di dipendenti.
                String riga = in.nextLine(); // Legge la riga corrente dal file.
                String[] dati = riga.split(","); // Suddivide la riga in campi separati da virgola.
                
                String nome = dati[0]; // Nome letto dal primo campo.
                String cognome = dati[1]; // Cognome letto dal secondo campo.
                double salario = Double.parseDouble(dati[2]); // Converte il salario dal terzo campo in double.
                
                Impiegato nuovoImp = new Impiegato(nome, cognome, salario); // Crea un nuovo Impiegato con i dati letti.
                dipendentiLetti.add(nuovoImp); // Aggiunge il nuovo impiegato alla lista.
            } // Fine while: lettura righe dipendenti.txt

            in.close(); // Chiude lo Scanner di input.
            
            System.out.println("\nLettura completata. Stampa dei dati letti:");
            for (Impiegato imp : dipendentiLetti) {
                System.out.println(imp.dettagli()); 
            }

        } catch (FileNotFoundException exc) {
            System.out.println("ERRORE: File 'dipendenti.txt' non trovato per la lettura.");
        }
        
        System.out.println("------------------------------------------");

        // --- Esercizio 7: Oggetti e Reference (Puntatori - Classe Data) ---
        System.out.println("--- Esercizio 7: Oggetti e Reference (Puntatori) ---");

		//1. Dichiarazione di una variabile di tipo reference 'oggi'
		Data oggiData; // Rinominato per evitare conflitto con 'oggi' di GregorianCalendar

		//2. Creazione dell'istanza (oggetto) e assegnazione del reference
		oggiData = new Data(2025, 11, 18);
		
		System.out.println("Data creata: " + oggiData.dettagli()); 
		
		//3. Creazione di un secondo reference che punta allo STESSO oggetto
		Data domani = oggiData; 

		//4. Modifica attraverso il secondo reference
		domani.setMese(12); 
		
		//5. Verifica: la modifica e visibile anche dal primo reference
		System.out.println("Data dopo modifica tramite 'domani': " + oggiData.dettagli()); 
		
		System.out.println("------------------------------------------");
        
        // Chiude lo scanner globale aperto per l'Esercizio 3.
        input.close(); 
    }
}