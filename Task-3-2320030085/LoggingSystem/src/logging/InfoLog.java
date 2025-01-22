package logging;

public class InfoLog extends Logger{
	 public InfoLog(int level) {
	        this.level = level;
	    }
	    protected void write(String message) {
	        System.out.println("INFO: " + message);
	    }
	
}
