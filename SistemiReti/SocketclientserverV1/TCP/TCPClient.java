package SistemiReti.SocketclientserverV1.TCP;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class TCPClient
{
    public static void main(String[] arg)
    {
        int porta=2001;
        InetAddress serverAddress;
        Socket connection;
        try
        { 
            serverAddress = InetAddress.getLocalHost();
            System.out.println("Indirizzo del server trovato");
            connection = new Socket(serverAddress, porta);
            System.out.println("Connessione aperta");
            InputStream inSocket = connection.getInputStream();
            Scanner streamIn = new Scanner(inSocket);
            OutputStream outSocket = connection.getOutputStream();
            PrintWriter streamOut = new PrintWriter(outSocket, true);
            Scanner keyboard = new Scanner(System.in);
            while (true) 
                {
                System.out.print("Inserisci un numero: ");
                int guess = keyboard.nextInt();
                streamOut.println(guess);
                String response = streamIn.nextLine();
                System.out.println("Risposta dal server: " + response);
                if (response.startsWith("Indovinato")) 
                {
                    break;
                }
            }
            keyboard.close();
            streamIn.close();
            streamOut.close();
            connection.close();
            System.out.println("Connessione chiusa");
        }
        catch (IOException e)
        {
            System.err.println(e);
        }
    }
}