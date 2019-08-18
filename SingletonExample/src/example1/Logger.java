package example1;

public class Logger {

	private Logger() {	}
	/* Caution of Multi-Thread environement
	 * 
	private static Logger myInstance;

	public static Logger getInstance() {
		if (myInstance == null) {
			myInstance = new Logger();
		}
		return myInstance;
	}
	
	public void log(String s) {
		System.err.println(s);
	}*/
	
	// Solution to Multi-Thread --> Inner Class
	
	public static class LoggerHolder{
		public static Logger logger = new Logger();
	}
	
	public static Logger getInstance() {
		return LoggerHolder.logger;
	}
	
	public void log(String s) {
		System.err.println(s);
	}

}
