package SistemaDiMonitorraggio;

public interface GestoreEnergia 
{
    void accendi();
    void spegni();
    void accendiRisparmioEnergia();
    void spegniRisparmioEnergia();
    int consumoTotale();

    
}