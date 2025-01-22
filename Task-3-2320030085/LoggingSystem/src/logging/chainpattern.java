package logging;

public class chainpattern {
	  private static Logger getChainOfLoggers() {

	        Logger errorLogger = new ErrorLog(Logger.ERROR);
	        Logger debugLogger = new DebugLog(Logger.DEBUG);
	        Logger infoLogger = new InfoLog(Logger.INFO);

	        infoLogger.setNextLogger(debugLogger);
	        debugLogger.setNextLogger(errorLogger);

	        return infoLogger;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(Logger.INFO, "This is an informational message.");
        loggerChain.logMessage(Logger.DEBUG, "This is a debug message.");
        loggerChain.logMessage(Logger.ERROR, "This is an error message.");
    }
	
}
