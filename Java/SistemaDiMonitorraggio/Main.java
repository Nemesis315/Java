package SistemaDiMonitorraggio;

public class Main
{
    public static void main(String[] args) 
    {
        // Creazione di un sensore
        NodoSensore sensore = new NodoSensore("S001", 100);

        // Accensione del sensore
        sensore.accendi();

        // Attivazione del risparmio energetico
        sensore.accendiRisparmioEnergia();

        // Calcolo del consumo totale
        System.out.println("Consumo totale: " + sensore.consumoTotale());

        // Disattivazione del risparmio energetico
        sensore.spegniRisparmioEnergia();

        // Spegnimento del sensore
        sensore.spegni();

        // Calcolo del consumo totale dopo le modifiche
        System.out.println("Consumo totale dopo le modifiche: " + sensore.consumoTotale());
        // Creazione di un nodo edge avanzato
        NodoEdgeAvanzato nodoEdge = new NodoEdgeAvanzato("E001", 200);
        // Accensione del nodo edge
        nodoEdge.accendi();
        // Attivazione del risparmio energetico
        nodoEdge.accendiRisparmioEnergia();
        // Calcolo del consumo totale
        System.out.println("Consumo totale del nodo edge: " + nodoEdge.consumoTotale());
        // Disattivazione del risparmio energetico
        nodoEdge.spegniRisparmioEnergia();
        // Spegnimento del nodo edge
        nodoEdge.spegni();
        // Calcolo del consumo totale dopo le modifiche
        System.out.println("Consumo totale del nodo edge dopo le modifiche: " + nodoEdge.consumoTotale());
    }
}
