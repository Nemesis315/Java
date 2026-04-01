

public class Generatore extends Componente // Classe che rappresenta un generatore, estende la classe Componente
{
	private double efficienzaPercent; // Percentuale di efficienza del generatore

	public Generatore(String id, double energiaBase, double efficienzaPercent) // Costruttore per inizializzare l'id, l'energia base e la percentuale di efficienza del generatore
    {
		super(id, energiaBase); // Chiamata al costruttore della classe base Componente per inizializzare l'id e l'energia base
		this.efficienzaPercent = efficienzaPercent; // Assegnazione della percentuale di efficienza al campo efficienzaPercent
	}

	public double getEfficienzaPercent() // Metodo getter per ottenere la percentuale di efficienza del generatore
    {
		return efficienzaPercent; // Restituisce la percentuale di efficienza del generatore
	}

	public void setEfficienzaPercent(double efficienzaPercent) // Metodo setter per impostare la percentuale di efficienza del generatore
    {
		this.efficienzaPercent = efficienzaPercent; // Assegna la nuova percentuale di efficienza al campo efficienzaPercent
	}

	@Override
	public double calcolaRendimento() // Override del metodo calcolaRendimento() per calcolare il rendimento del generatore tenendo conto dell'efficienza
    {
		return getEnergiaBase() * (efficienzaPercent / 100.0); // Calcolo del rendimento moltiplicando l'energia base per la percentuale di efficienza
	}
}
