class Notifica 
{
    void invia() 
    {
        System.out.println("Invio di una notifica generica...");
    }
}
class Email extends Notifica 
{
    @Override // Sovrascriviamo il comportamento del padre
    void invia() 
    {
        System.out.println("Invio email con protocollo SMTP.");
    }
}
class SMS extends Notifica 
{
    @Override
    void invia() 
    {
        System.out.println("Invio SMS tramite gateway telefonico.");
    }
}


public class Esempio 
{
    public static void main(String[] args) 
    {
        Notifica notifica1 = new Email(); // Polimorfismo: Notifica è il tipo di riferimento
        Notifica notifica2 = new SMS();   // Polimorfismo: Notifica è il tipo di riferimento

        notifica1.invia(); // Chiamata al metodo invia() di Email
        notifica2.invia(); // Chiamata al metodo invia() di SMS
    }
}