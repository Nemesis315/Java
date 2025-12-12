package lezioni.oggetti; // Definisce il package a cui appartiene questa classe.

// La classe Data serve come esempio per dimostrare i tipi di riferimento
public class Data { // Definizione della classe Data.
    // Inizio della definizione della classe Data.
    
    // Variabili istanza private (attribute dell'oggetto, Information Hiding).
    private int anno; // Anno della data.
    private int mese; // Mese della data.
    private int giorno; // Giorno della data.

    // Costruttore: viene invocato con 'new Data(a, m, g)' per creare l'oggetto
    public Data(int a, int m, int g) {
        this.anno = a;  // Assegna il valore di 'a' alla variabile istanza 'anno'.
        this.mese = m;  // Assegna il valore di 'm' alla variabile istanza 'mese'.
        this.giorno = g; // Assegna il valore di 'g' alla variabile istanza 'giorno'.
    }

    // Metodo GETTER: permette di leggere il valore dell'attributo 'anno'.
    public int getAnno() { // Restituisce l'anno memorizzato.
        return anno; // Restituisce il valore corrente di 'anno'.
    }

    // Metodo SETTER: permette di modificare il valore dell'attributo 'mese'.
    public void setMese(int nuovoMese) { // Imposta il mese della data.
        this.mese = nuovoMese; // Aggiorna il valore di 'mese'.
    }
    
    // Metodo che descrive un servizio: restituisce la data in formato stringa.
    public String dettagli() { // Restituisce la data in formato "gg/mm/aaaa".
        return giorno + "/" + mese + "/" + anno; // Ritorna la data formattata come stringa.
    }
} // Fine classe Data