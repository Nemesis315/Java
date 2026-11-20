package TCP_UNICAST;

import java.io.IOException;



public class Server extends ClientServer {//ESTEDE CON UNA CLASSE DI TIPO THREAD CHE SERVE ALLA COMUNICAZIONE TRA CLIENT E SERVER

	public static void main(String[] args) throws IOException{
		
		EchoServer thread = new EchoServer(50000, 5);//
		thread.run();                                         //INSERIRE IL METODO GIUSTO PER L'AVVIO DI COMUNICAZIONE UNICAST

	}

}