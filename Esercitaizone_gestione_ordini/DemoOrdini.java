public class DemoOrdini {
    public static void main(String[] args) {
        Prodotto p1 = new Prodotto(1, "Penna", 1.5);
        Prodotto p2 = new Prodotto(2, "Quaderno", 3.75);
        Prodotto p3 = new Prodotto(3, "Zaino", 29.99);

        // Test incapsulamento: tentativo di impostare prezzo non valido
        Prodotto pTest = new Prodotto(4, "Cancellino", 2.0);
        System.out.println("Prima: " + pTest.dettagli());
        pTest.setPrezzoUnitario(-5.0); // non valido, non deve cambiare
        System.out.println("Dopo tentativo prezzo invalido: " + pTest.dettagli());
        pTest.setPrezzoUnitario(2.5); // valido
        System.out.println("Dopo impostazione valida: " + pTest.dettagli());

        DettaglioOrdine[] ordini = new DettaglioOrdine[5];
        ordini[0] = new DettaglioOrdine(p1, 10);
        ordini[1] = new DettaglioOrdine(p2, 2);
        ordini[2] = new DettaglioOrdine(p3, 1);

        double totale = 0.0;
        for (int i = 0; i < ordini.length; i++) {
            if (ordini[i] != null) {
                ordini[i].dettagli();
                double totaleRiga = ordini[i].calcolaTotaleRiga();
                System.out.printf("Totale riga: %.2f%n", totaleRiga);
                totale += totaleRiga;
            }
        }

        System.out.printf("Totale ordine: %.2f%n", totale);
    }
}