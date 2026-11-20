package TCP_UNICAST;

import java.net.*;
import java.io.*;
import java.io.BufferedReader;

public class EchoClient extends ClientServer {//ESTENDE UNA CLASSE DI TIPO THREAD CHE SERVE ALLA COMUNICAZIONE TRA CLIENT E SERVER
	protected Socket socket;
	public BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public EchoClient(String url, int port) throws UnknownHostException, IOException {//COSTRUTTORE
		socket = new Socket(url, port);
		System.out.println("CLIENT: Sono connesso a " + url + ": " + port);
	} // EchoClient()

    public void run() {//METODO RUN PROPRIO DELLA CLASSE THREAD
		try {
    		requestAService(socket);//METODO SOTTO DEFINITO CHE UTILIZZA LA SOCKET PER OPERARE
    		socket.close();//INSERIRE IL METODO CHE CHIUDE LA SOCKET
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
		}
	} // run()

	protected void requestAService(Socket socket) throws IOException {
		String servStr = readFromSocket(socket); // SVOLGE UNA PRIMA LETTURA DI CONTROLLO DEL MESSAGGIO DAL SOCKET
		if (servStr.substring(0, 4).equals("Ciao")) {
			System.out.println(servStr);
			String userStr = "";
			do {
				userStr = in.readLine(); // legge l input CON IL PARAMETRO DEFINITO ALLE PRIMA RIGHE DI TIPO BUFFEREDREADER
				writeToSocket(socket, userStr + "\n"); // lo scrive sul socket per inviare il messaggio al server
				servStr = readFromSocket(socket); // legge la risposta ricevuta dal SOCKET DEL server
				System.out.println(servStr);// SCRIVE A CONSOLE LA RISPOSTA ARRIVATA AL SERVER DAL SERVER
			} while (!userStr.toLowerCase().equals("goodbye")); //se riceve un  goodbye  chiude la comunicazione
		}   //IF
	}  //requestAService()
}