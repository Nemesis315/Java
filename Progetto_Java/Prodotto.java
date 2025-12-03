public class Prodotto {
    private int codice;
    private String descrizione;
    private double prezzoUnitario;

    public Prodotto(int codice, String descrizione, double prezzoUnitario) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzoUnitario = prezzoUnitario;
    }

    public double getPrezzoUnitario() {
        return prezzoUnitario;
    }

    public void setPrezzoUnitario(double prezzoUnitario) {
        if (prezzoUnitario > 0.0) {
            this.prezzoUnitario = prezzoUnitario;
        }
    }

    public String dettagli() {
        return "Codice: " + codice + ", Descrizione: " + descrizione + ", Prezzo unitario: " + prezzoUnitario;
    }
}
