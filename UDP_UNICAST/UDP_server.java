import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.net.*;

public class UDPServer2{

    public static void main(String[] args) {

        BufferedReader cl = /* COMPLETARE CON IL BUFFER DI LETTURA DA CONSOLE */;

        DatagramSocket socket = null;  

        try {

            socket = new ……………………………….(/*STESSA PORTA INDICATA NEL CLIENT*/); //SCRIVERE LA CLASSE DI JAVA CHE CREA LA SOCKET IN UDP E LA Porta in ascolto DEL SERVER  

            byte[] receiveData = /* CREIAMO UN ARRY DI 1024 BYTE */;


            while (true) {

DatagramPacket receivePacket = new DatagramPacket(/* INSERIRE L'ARRAY DI 1024 BYE*/, /* INSERIRE L'ARRAY DI 1024BTYE*/.length);
//CREIAMO UN PACKET UDP DI DIMENSIONE 1024 BYTE

             socket..........(receivePacket);//APRE LA SOCKET IN RICEZONE SCRIVERE IL METODO DI RICEZIONE PER LA socket DELL'UDP DI JAVA

             String message = new String(/* INSERIRE L'ARRAY DI 1024 BYTE*/.getData(), 0, /*INSERIRE IL PACKET RICEVUTO DI 1024 BYE*/.getLength());//CONVERTE LO STREAM BYTE
                                                                                                                                                   //RICEVUTO IN UN MESSAGGIO STRIGA
                                                                                                                                                   //DI CARATTERI

             System.out.println("Ricevuto il messaggio: " + message);

             InetAddress address = receivePacket./*VEDERE COME FATTO SUL CLIENT*/;//ESTRAE L'INDIRIZZO IP DEL CLIENT DA CUI SI E' RICEVUTO IL MESSAGGIO

             String client = address.getHostName();//ESTRAE IL NOME DELL'HOST DA CUI SI E' RICEVUTO IL MESSAGGIO

             int porta = /*SCRIVERE LA PORTA COME FATTO PER address(INDIRIZZO IP) ESTRATTO ALLE 2 RIGHE PRECEDENTI*/.getPort();

             System.out.println("In chiamata Client: "+ client + "su porta: " + porta);

             String message2 = ….readLine(); // legge l'input DA CONSOLE per COMPLETARE INSERIRE LA STESSA VARIABILE IN CIMA AL CODICE IL BufferReader

         byte[] sendData2 = /*GUARDARE COME FATTO SUL CLIENT*/;//TRASFORMA IL MESSAGGIO2 INSERITO DA CONSOLE IN ARRAY DI BYTE

         DatagramPacket sendPacket2 = new DatagramPacket(/* INSERIRE L'ARRAY DI BYTE DI CON IL MESSAGGIO */, /* INSERIRE L'ARRAY DI BYTE DI CON IL MESSAGGIO */.length, address, porta);
             //sendPacket2 E' IL DATAGRAM DA INVIARE

             socket.send(/*INSERIRE IL DATAGRAM*/);//MANDA IL MESSAGGIO AL CLIENT

            }

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            if (socket != null) {

                socket.close();

            }

        }



    }

}