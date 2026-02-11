package EsercitazioneSommativa; // Aggiunta del package per organizzare le classi

public class Convertitore extends Componente // Classe che rappresenta un convertitore, estende la classe Componente
{
	private double perditaPercent; // Percentuale di perdita del convertitore

	public Convertitore(String id, double energiaBase, double perditaPercent) // Costruttore per inizializzare l'id, l'energia base e la percentuale di perdita del convertitore
    {
		super(id, energiaBase); // Chiamata al costruttore della classe base Componente per inizializzare l'id e l'energia base
		this.perditaPercent = perditaPercent; // Assegnazione della percentuale di perdita al campo perditaPercent
	}

	public double getPerditaPercent() // Metodo getter per ottenere la percentuale di perdita del convertitore
    {
		return perditaPercent; // Restituisce la percentuale di perdita del convertitore
	}

	public void setPerditaPercent(double perditaPercent) // Metodo setter per impostare la percentuale di perdita del convertitore
    {
		this.perditaPercent = perditaPercent; // Assegna la nuova percentuale di perdita al campo perditaPercent
	}

	@Override
	public double calcolaRendimento() // Override del metodo calcolaRendimento() per calcolare il rendimento del convertitore tenendo conto della perdita
    {
		return getEnergiaBase() * (1.0 - perditaPercent / 100.0); // Calcolo del rendimento sottraendo la percentuale di perdita dall'energia base
	}
}
