package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Demo2 {
	
	private static Logger log=LogManager.getLogger(Demo2.class.getName());
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
