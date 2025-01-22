package dip;

public class Sms implements Message{
	public void sendMessage(String message, String receiver) {
        System.out.println("SMS sent to " + receiver + " with message: " + message);
    }

}
