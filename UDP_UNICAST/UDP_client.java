import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.net.*;

public class UDP_client {

    public static void main(String[] args) {

        DatagramSocket socket = null;//ISTANZIAMO LA SOCKET DI UDP CON LA CLASSE PREPOSTA IN JAVA

        BufferedReader cl = new BufferedReader(new InputStreamReader(System.in));

        try {

            socket = new DatagramSocket();

             String message = "Hello, UDP Server!";

            InetAddress serverAddress = InetAddress.getByName("127.0.0.1"); //ASSOCIA A serverAddress l'IP 127.0.0.1 CON LA CLASSE OPPORTUNA PER LA MANIPOLAZIONE DEGLI INDIRIZZI IP                                                                                        //PORT IN UDP DATAGRAM DI JAVA

            byte[] sendData = message.getBytes();//TRASFORMA IL MESSAGGIO IN ARRAY DI byte poiché IL PACKET DATAGRAM IN UDP FUNZIONA CON I BYTE

            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 12345); //APPRONTA il MESSAGGIO PER IL Server, INSERIRE LA CLASSE CHE  

                                                                                                        //COSTRUISCE IL PACCHETTO PER DatagramSocket

            socket.send(sendPacket);//INSERIRE IL METODO CHE MANDA IL MESSAGGIO AL SERVER CON IL METODO PROPRIO DI UDP PER L'INVIO MESSAGGI IN JAVA CON LA DatagramSocket

            System.out.println("Messagio inviato: " + message);

            

            while(true) {    

                    byte[] receiveData = new byte[1024];//CREA UNA STRUTTURA DATI FATTA CON UN ARRAY DI 1024 BYTE PER RICEVERE I DATI

                    DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);//COSTRUISCE IL PACCHETTO DATAGRAM DI RICEZIONE CON LA CLASSE PREPOSTA

                    socket.receive(receivePacket);//INSERIRE IL METODO DI RICEZIONE DEL PACKET

                    String message2 = new String(receivePacket.getData(), 0, receivePacket.getLength());

                    System.out.println("Ricevuto il messaggio: " + message2);

                    message = cl.readLine();  //legge l'input DA TASTIERA CON L'OGGETTO BUFFEREADER CREATO IN CIMA AL CODICE 

                    byte[] sendData2 = message.getBytes();  //CONVERTE IL MESSAGIO LETTO IN UN ARRAY DI byte

                    DatagramPacket sendPacket2 = new DatagramPacket(sendData2, sendData2.length, serverAddress, 12345); // COSTRUISCE IL PACKET DA INVIARE AL Server

                    socket.send(sendPacket2);//INSERIRE IL METODO DI INVIO DEL PACKET

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