package SistemiReti.SocketclientserverV1.UTP;

import java.io.*;
import java.net.*;
import java.util.Random;
public class UDPServer
{
	public static void main(String[] args)
	{
		int port=2000;
		DatagramSocket dSocket;
		DatagramPacket inPacket;
		DatagramPacket outPacket;
		byte[] buffer;
		String messageIn, messageOut;
		Random rand = new Random();
		int numeroDaIndovinare = rand.nextInt(100) + 1; // numero tra 1 e 100
		System.out.println("Il numero da indovinare è: " + numeroDaIndovinare); // per debug, in produzione rimuovi
		System.out.println("Apertura porta in corso");
		try
		{
			dSocket = new DatagramSocket(port);
			while (true)
			{
				System.out.println("Server in ascolto sulla porta" + port + "\n");
				buffer = new byte[256];
				inPacket = new DatagramPacket(buffer, buffer.length);
				dSocket.receive(inPacket);
				InetAddress clientAddress = inPacket.getAddress();
				int clientPort = inPacket.getPort();
				messageIn = new String(inPacket.getData(),0,inPacket.getLength());
				System.out.println("SONO IL CLIENT" + clientAddress + ":" + clientPort + "> " + messageIn);
				try {
					int tentativo = Integer.parseInt(messageIn.trim());
					if (tentativo < numeroDaIndovinare) {
						messageOut = "Troppo basso!";
					} else if (tentativo > numeroDaIndovinare) {
						messageOut = "Troppo alto!";
					} else {
						messageOut = "Corretto! Hai indovinato il numero.";
					}
				} catch (NumberFormatException e) {
					messageOut = "Inserisci un numero valido.";
				}
				outPacket = new DatagramPacket(
				messageOut.getBytes(),
				messageOut.length(),
				clientAddress, clientPort);
				dSocket.send(outPacket);
				System.out.println("Risposta inviata");
			}
		}
		catch(IOException e)
		{
			System.err.println(e);
		}
	}
}
