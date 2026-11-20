package TCP_UNICAST;

import java.io.IOException;


public class Client extends ClientServer {

	public static void main(String[] args) throws  IOException{
		
		EchoClient thread = new EchoClient("localhost", 50000);
		thread.run();
		// TODO Auto-generated method stub

	}

}