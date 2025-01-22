package dip;

public class App {
	 private Message messageService;
	    public App(Message messageService) {
	        this.messageService = messageService;
	    }

	    public void processMessage(String message, String receiver) {
	        messageService.sendMessage(message, receiver);
	    }

}
