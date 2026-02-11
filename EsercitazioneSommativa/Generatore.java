package EsercitazioneSommativa;

public class Generatore extends Componente 
{
	private double efficienzaPercent;

	public Generatore(String id, double energiaBase, double efficienzaPercent) 
    {
		super(id, energiaBase);
		this.efficienzaPercent = efficienzaPercent;
	}

	public double getEfficienzaPercent() 
    {
		return efficienzaPercent;
	}

	public void setEfficienzaPercent(double efficienzaPercent) 
    {
		this.efficienzaPercent = efficienzaPercent;
	}

	@Override
	public double calcolaRendimento() 
    {
		return getEnergiaBase() * (efficienzaPercent / 100.0);
	}
}
