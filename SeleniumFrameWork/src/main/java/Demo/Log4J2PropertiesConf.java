package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4J2PropertiesConf {

	
	 private static Logger logger = LogManager.getLogger(Log4J2PropertiesConf.class);
	public static void main(String[] args) {
		 System.out.println("start");
		 logger.trace("This is a debug message");
	     logger.debug("This is a debug message");
	     logger.info("This is an info message");
	     logger.warn("This is a warn message");
	     logger.error("This is an error message");
	     logger.fatal("This is a fatal message");
	     System.out.println("END");	

	}

}
