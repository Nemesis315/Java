public class DettaglioOrdine 
{
    private final Prodotto articolo;
    private int quantita;

    public DettaglioOrdine(Prodotto articolo, int quantita) {
        this.articolo = articolo;
        this.quantita = (quantita < 1) ? 1 : quantita;
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