package TCP_UNICAST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer extends ClientServer {
	protected ServerSocket port;
	protected Socket socket;
	public BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public EchoServer(int portNum, int nBacklog) throws IOException {//COSTRUTTORE DI ECHOSERVER CHE CONTIENE IL PROPRIO NUMERO DI PORTA E BACKLOG 
		port = new ServerSocket(portNum, nBacklog);
	}

	public void run() {//METODO RUN TIPICO DEI THREAD
		while (true) {
			try {

		socket = port.accept();//INSERIRE METODO DI ACCETTAZIONE  
                                         //CONNESSIONE ALLA SOCKET DEL CLIENT PER IL PROTOCOLLO TCP

		System.out.println("Accettata la connessione da " + socket.getInetAddress() + " " + socket.getPort());//ESTRAE L'INDIRIZZO DEL CLIENT

				provideAService(socket);//QUESTO E' IL METODO CHE LEGGE IL MESSAGGIO CHE GIUNGE DALLA SOCKET DEL CLIENT

				socket.close();//QUI CHIUDIAMO LA SOCKET CON IL METODO CORRETTO
				System.out.println("Connessione chiusa \n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} // run()       
 
	protected void provideAService(Socket socket) throws IOException {
		writeToSocket(socket, "Ciao, come stai? \n");//METODO EREDITATO DA CLIENTSERVER

		String str;

		do {

			str = readFromSocket(socket);//METODO EREDITATO DA CLIENTSERVER

			if (str.toLowerCase().equals("goodbye")) {
				writeToSocket(socket, "goodbye");
			    System.out.println("CLIENT: " + str);}
			else {
				System.out.println("CLIENT: " + str);
				String servStr;
		servStr = in.readLine(); // legge l'input da console CON IL PARAMETRO DI BUFFEREDREADER DEFNITO ALLE PRIME RIGHE	  
                writeToSocket(socket, "SERVER: " + servStr + "\n");//LO INVIA AL CLIENT TRAMITE LA SOCKET NOTA DEL CLIENT
			}
		} while (!str.toLowerCase().equals("goodbye"));

	} // provideAService()
}
	