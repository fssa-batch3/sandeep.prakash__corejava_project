package day02.practice;



public class Logger {
	public static void debug (String msg) {
		System.out.println("DEBUG: " + msg);
	}
	public static void log (String msg) {
		// TODO complete this code using the above template
		System.out.println("LOG: " + msg);
	}
	
	public static void error (String msg) {
		// TODO complete this code using the above template
		System.out.println("ERROR: " + msg);
	}
	
	public static void debug (int num) {
		// TODO Complete this code
		System.out.println("DEBUG: " + num);
	}
	
	public static void log (int num) {
		// TODO complete this code using the above template
		System.out.println("LOG: " + num);
	}
	
	public static void error (int num) {
		// TODO complete this code using the above template
		System.out.println("ERROR: " + num);
	}
	
	// Similarly write overloaded methods for error and info.
	
	public static void main(String[] args) {
		Logger objlog=new Logger();
		
		objlog.log("Sandeep");
		objlog.error("String");
		objlog.debug("String");
		
		
		objlog.log(10);
		objlog.error(10);
		objlog.debug(10);
	}
}

