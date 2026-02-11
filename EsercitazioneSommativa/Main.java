package EsercitazioneSommativa;  // Aggiunta del package per organizzare le classi

import java.util.InputMismatchException; // Aggiunta per gestire input non validi
import java.util.Scanner; // Aggiunta per leggere input da console

public class Main // Classe principale per eseguire il programma
{
	public static void main(String[] args) // Metodo main, punto di ingresso del programma
    {
		Scanner scanner = new Scanner(System.in); // Creazione di un oggetto Scanner per leggere input da console
		try // Blocco try per gestire eventuali errori di input
        {
			System.out.print("Quanti componenti vuoi inserire? "); // Richiesta del numero di componenti da inserire
			int n = scanner.nextInt(); // Lettura del numero di componenti
			scanner.nextLine(); // Consumo del newline rimasto dopo nextInt()
			if (n <= 0)  // Controllo per assicurarsi che il numero di componenti sia positivo
            {
				System.out.println("Numero non valido."); // Messaggio di errore per numero non valido
				return; // Terminazione del programma se il numero di componenti non è valido
			}

			Componente[] elenco = new Componente[n]; // Creazione di un array di componenti con la dimensione specificata

			for (int i = 0; i < n; i++)  // Ciclo per inserire i dettagli di ogni componente
            {
				System.out.println("Componente #" + (i + 1)); // Stampa del numero del componente corrente
				System.out.print("Tipo (G = Generatore, C = Convertitore): "); // Richiesta del tipo di componente
				String tipo = scanner.nextLine().trim().toUpperCase(); // Lettura del tipo di componente e conversione in maiuscolo
				System.out.print("ID componente: "); // Richiesta dell'ID del componente
				String id = scanner.nextLine().trim(); // Lettura dell'ID del componente e rimozione di eventuali spazi bianchi
				System.out.print("Energia base (numero): "); // Richiesta dell'energia base del componente
				double energiaBase = scanner.nextDouble(); // Lettura dell'energia base del componente
				scanner.nextLine(); // Consumo del newline rimasto dopo nextDouble()

				if (tipo.equals("G"))  // Controllo se il tipo è un generatore
				{
					System.out.print("Efficienza (%) del generatore: "); // Richiesta dell'efficienza del generatore
					double eff = scanner.nextDouble(); // Lettura dell'efficienza del generatore
					scanner.nextLine(); // Consumo del newline rimasto dopo nextDouble()
					elenco[i] = new Generatore(id, energiaBase, eff);   // Creazione di un nuovo oggetto Generatore e assegnazione all'array
				} else if (tipo.equals("C")) // Controllo se il tipo è un convertitore
                {
					System.out.print("Perdita (%) del convertitore: "); // Richiesta della perdita del convertitore
					double perdita = scanner.nextDouble(); // Lettura della perdita del convertitore
					scanner.nextLine(); // Consumo del newline rimasto dopo nextDouble()
					elenco[i] = new Convertitore(id, energiaBase, perdita); // Creazione di un nuovo oggetto Convertitore e assegnazione all'array
				} 
                else 
                {
					System.out.println("Tipo non valido: componente ignorato."); // Messaggio di errore per tipo non valido e ignoramento del componente
					elenco[i] = null; // Assegnazione di null all'array per indicare che il componente è stato ignorato
					tipoInvalido = true; // Variabile per tenere traccia se è stato inserito un tipo non valido
					continue; // Passaggio al prossimo ciclo senza incrementare i contatori di componenti validi
				}
			}

			System.out.print("Soglia di sicurezza per il rendimento: "); // Richiesta della soglia di sicurezza per il rendimento
			double soglia = scanner.nextDouble(); // Lettura della soglia di sicurezza per il rendimento

			System.out.println("\nRisultati analisi:"); // Stampa dell'intestazione per i risultati dell'analisi
			for (Componente c : elenco) // Ciclo per analizzare ogni componente e calcolare il rendimento
            {
				double rendimento = c.calcolaRendimento(); // Calcolo del rendimento del componente utilizzando il metodo calcolaRendimento()
				String info = String.format("ID=%s, energiaBase=%.2f, rendimento=%.2f", c.getId(), c.getEnergiaBase(), rendimento); // Formattazione delle informazioni del componente per la stampa
				if (rendimento > soglia) // Controllo se il rendimento supera la soglia di sicurezza
                {
					System.out.println("Registrato: " + info); // Stampa delle informazioni del componente se il rendimento supera la soglia
				} 
                else 
                {
					System.out.println("Anomalia: " + info); // Stampa delle informazioni del componente se il rendimento non supera la soglia, indicando un'anomalia
				}
			}

		} 
        catch (InputMismatchException e)  // Gestione dell'eccezione in caso di input non valido (ad esempio, se si inserisce un testo invece di un numero)
        {
			System.out.println("Input non valido. Terminazione."); // Messaggio di errore per input non valido e terminazione del programma
		} 
        finally // Blocco finally per chiudere lo scanner, garantendo che venga eseguito indipendentemente da eventuali errori
        {
			scanner.close(); // Chiusura dello scanner per liberare le risorse associate
		}
	}
}