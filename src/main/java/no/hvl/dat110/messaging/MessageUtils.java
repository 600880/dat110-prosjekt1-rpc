package no.hvl.dat110.messaging;

import no.hvl.dat110.TODO;

public class MessageUtils {

	public static final int SEGMENTSIZE = 128;

	public static int MESSAGINGPORT = 8080;
	public static String MESSAGINGHOST = "localhost";

	public static byte[] encapsulate(Message message) {
		
		byte[] segment = null;
		byte[] data;
		
		// TODO - START
		
		// encapulate/encode the payload data of the message and form a segment
		// according to the segment format for the messaging layer
		
//		if (true)
//			throw new UnsupportedOperationException(TODO.method());
		data = message.getData();
		segment = new byte[SEGMENTSIZE];
		int length = data.length;
		byte b = (byte) length;
		segment[0] = b;
		
		for (int i = 0; i < length; i++) {
			segment[i+1] = data[i];
		}
			
		// TODO - END
		return segment;
		
	}

	public static Message decapsulate(byte[] segment) {

		Message message = null;
		
		// TODO - START
		// decapsulate segment and put received payload data into a message
		
//		if (true)
//			throw new UnsupportedOperationException(TODO.method());
		int length = segment[0];
		byte[] b = new byte[length];
		for (int i = 0; i < length; i++) {
			b[i] = segment[i+1];
		}
		
		message = new Message(b);
		
		// TODO - END
		
		return message;
		
	}
	
}
