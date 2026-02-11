package EsercitazioneSommativa;

public class Convertitore extends Componente 
{
	private double perditaPercent;

	public Convertitore(String id, double energiaBase, double perditaPercent) 
    {
		super(id, energiaBase);
		this.perditaPercent = perditaPercent;
	}

	public double getPerditaPercent() 
    {
		return perditaPercent;
	}

	public void setPerditaPercent(double perditaPercent) 
    {
		this.perditaPercent = perditaPercent;
	}

	@Override
	public double calcolaRendimento() 
    {
		return getEnergiaBase() * (1.0 - perditaPercent / 100.0);
	}
}
