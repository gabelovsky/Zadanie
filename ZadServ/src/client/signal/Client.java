package client.signal;

import server.communication.SignalReceiver;

public class Client {
	
	SignalReceiver sigRec;
	
	
	private Client(){};
	
	public Client(SignalReceiver sig){
		sigRec=sig;
	}
	
	
	public void sendSignal(){
		
	}
}
