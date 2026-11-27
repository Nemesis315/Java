import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.net.*;

public class UDPClient2 {

    public static void main(String[] args) {

        DatagramSocket socket = null;//ISTANZIAMO LA SOCKET DI UDP CON LA CLASSE PREPOSTA IN JAVA

        BufferedReader cl = /* COMPLETARE IL BUFFER DI LETTURA STRINGHE DA CONSOLE */ 

                                         /* GUARDARE COME FATTO SU ESERCIZIO DI TCP UNICST */ 

        try {

            socket = new ……………………….();//INSERIRE LA CLASSE CHE IN JAVA CREA LA SOCKET DI COMUNICAZIONE E IL SUO COSTRUTTORE

             String message = "Hello, UDP Server!";

            …………………………. serverAddress = ............. .getByName("127.0.0.1"); //ASSOCIA A serverAddress l'IP 127.0.0.1 CON LA CLASSE OPPORTUNA PER LA MANIPOLAZIONE DEGLI INDIRIZZI IP                                                                                        //PORT IN UDP DATAGRAM DI JAVA

            ........[] sendData = message.getBytes();//TRASFORMA IL MESSAGGIO IN ARRAY DI byte poiché IL PACKET DATAGRAM IN UDP FUNZIONA CON I BYTE

            ………………………. sendPacket = new ..................(sendData, sendData.length, serverAddress, 12345); //APPRONTA il MESSAGGIO PER IL Server, INSERIRE LA CLASSE CHE  

                                                                                                        //COSTRUISCE IL PACCHETTO PER DatagramSocket

            socket.........(sendPacket);//INSERIRE IL METODO CHE MANDA IL MESSAGGIO AL SERVER CON IL METODO PROPRIO DI UDP PER L'INVIO MESSAGGI IN JAVA CON LA DatagramSocket

            System.out.println("Messagio inviato: " + message);

            

            while(true) {    

                    ...…...[] receiveData = new byte[……...];//CREA UNA STRUTTURA DATI FATTA CON UN ARRAY DI 1024 BYTE PER RICEVERE I DATI

                    ……………………………….. receivePacket = new ..............(receiveData, receiveData.length);//COSTRUISCE IL PACCHETTO DATAGRAM DI RICEZIONE CON LA CLASSE PREPOSTA

                    socket..........(receivePacket);//INSERIRE IL METODO DI RICEZIONE DEL PACKET                                                                                   //ALLA CREAZIONE DI PACCHETTI DATAGRAM DI UDP                                                                                                                        socket.........(receivePacket);///CHIAMA IL METODO DI RICEZIONE TIPICO DELL'UDP CON JAVA UTILIZZATO DALLA socket

                    String message2 = new String(/* INSERIRE PACKET DEFINITO 2 RIGHE PRIMA */.getData(), 0, /* INSERIRE PACKET ORA DEFINITO */.getLength());

                    System.out.println("Ricevuto il messaggio: " + message2);

                    message = .....readLine();  //legge l'input DA TASTIERA CON L'OGGETTO BUFFEREADER CREATO IN CIMA AL CODICE 

                    ……….[] sendData2 = message.getBytes();  //CONVERTE IL MESSAGIO LETTO IN UN ARRAY DI byte

                    DatagramPacket sendPacket2 = new DatagramPacket(sendData2, sendData2.length, serverAddress, 12345); // COSTRUISCE IL PACKET DA INVIARE AL Server

                    socket........(sendPacket2);//INSERIRE IL METODO DI INVIO DEL PACKET

                    System.out.println("Messagio inviato: " + message +" Da IP e Porta: " + socket.getLocalAddress() + " e " + socket.getLocalPort());

                    

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