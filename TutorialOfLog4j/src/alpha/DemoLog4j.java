package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoLog4j {

	private static Logger log=LogManager.getLogger(DemoLog4j.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.trace("Trace Message!");
	      log.debug("Debug Message!");
	      log.info("Info Message!");
	      log.warn("Warn Message!");
	      log.error("Error Message!");
	      log.fatal("Fatal Message!");
	
	}

}
