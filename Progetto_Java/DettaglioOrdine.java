public class DettaglioOrdine {
    private Prodotto articolo;
    private int quantita;

    public DettaglioOrdine(Prodotto articolo, int quantita) {
        this.articolo = articolo;
        setQuantita(quantita);
    }

    public void setQuantita(int quantita) {
        if (quantita < 1) {
            this.quantita = 1;
        } else {
            this.quantita = quantita;
        }
    }

    public double calcolaTotaleRiga() {
        return quantita * articolo.getPrezzoUnitario();
    }

    public void dettagli() {
        System.out.println(articolo.dettagli() + " | Quantità: " + quantita);
    }
}
