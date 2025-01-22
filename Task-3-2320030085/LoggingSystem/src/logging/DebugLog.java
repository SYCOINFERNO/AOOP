package logging;

public class DebugLog extends Logger{
	 public DebugLog(int level) {
	        this.level = level;
	    }
	    protected void write(String message) {
	        System.out.println("DEBUG: " + message);
	    }

}
