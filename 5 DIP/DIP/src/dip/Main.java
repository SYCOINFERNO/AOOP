package dip;

public class Main {
	 public static void main(String[] args) {
	       
	        Message emailService = new Email();
	        App app1 = new App(emailService);
	        app1.processMessage("Hello via Email!", "kavyakanne22@gmail.com");

	        Message smsService = new Sms();
	        App app2 = new App(smsService);
	        app2.processMessage("Hello via SMS!", "0123456789");
	    }

}
