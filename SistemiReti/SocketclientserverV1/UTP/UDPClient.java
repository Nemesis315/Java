package SistemiReti.SocketclientserverV1.UTP;

import java.io.*;
import java.net.*;
import java.util.Scanner;
public class UDPClient
{
	public static void main(String[] args)
	{
		int port = 2000;
		InetAddress serverAddress;
		DatagramSocket dSocket;
		DatagramPacket outPacket;
		DatagramPacket inPacket;
		byte[] buffer;
		String response;
		Scanner scanner = new Scanner(System.in);
		try
		{ 
			serverAddress = InetAddress.getLocalHost();
			System.out.println("Indirizzo del server trovato");
			dSocket = new DatagramSocket();
			while (true) {
				System.out.print("Inserisci un numero da 1 a 100 (o 'quit' per uscire): ");
				String input = scanner.nextLine();
				if (input.equalsIgnoreCase("quit")) {
					break;
				}
				outPacket = new DatagramPacket(input.getBytes(), input.length(), serverAddress, port);
				dSocket.send(outPacket);
				buffer = new byte[256];
				inPacket = new DatagramPacket(buffer, buffer.length);
				dSocket.receive(inPacket);
				response = new String(inPacket.getData(),0,inPacket.getLength());
				System.out.println("Risposta dal server: " + response);
				if (response.contains("Corretto")) {
					break;
				}
			}
			System.out.println("Connessione chiusa");
			dSocket.close();
			scanner.close();
		}
		catch(IOException e)
		{
			System.err.println(e);
		}
	}
}