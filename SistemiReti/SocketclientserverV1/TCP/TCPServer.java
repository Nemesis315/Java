package SistemiReti.SocketclientserverV1.TCP;

import java.net.*;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

//creiamo la clsse TCPServer
public class TCPServer
{  
    //main della classe TCPServer
    public static void main(String[] arg)
    {
        int port=2001;
        ServerSocket sSocket;
        System.out.println("Apertura porta in corso");
        try
        {
            sSocket = new ServerSocket(port);
            while (true)
            {
                System.out.println("Server in ascolto sulla porta" + port + "\n");
                Socket connection = sSocket.accept();     
                System.out.println("Connessione stabilita e richiesta ricevuta");
                handleGame(connection);
            }
        }
        catch (IOException e)
        {
            System.err.println(e);
        }
    }

    private static void handleGame(Socket connection) 
    {
        try 
        {
            Random rand = new Random();
            int N = rand.nextInt(1000) + 1; // 1 to 1000
            int X = rand.nextInt(N) + 1; // 1 to N
            System.out.println("N: " + N + ", X: " + X); // per debug

            InputStream inSocket = connection.getInputStream();
            Scanner streamIn = new Scanner(inSocket);
            OutputStream outSocket = connection.getOutputStream();
            PrintWriter streamOut = new PrintWriter(outSocket, true); // auto flush

            int attempts = 0;
            while (streamIn.hasNextLine()) 
                {
                    String guessStr = streamIn.nextLine();
                    int guess = Integer.parseInt(guessStr);
                    attempts++;
                if (guess < X) {
                    streamOut.println("più alto");
                }
                else
                {
                    if (guess > X) 
                    {
                    streamOut.println("più basso");
                    }
                    else
                    {
                        streamOut.println("Indovinato in " + attempts + " tentativi");
                        break;
                    }
                    
                    
                }
            }
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