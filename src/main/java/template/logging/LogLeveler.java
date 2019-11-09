package template.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogLeveler {
static final Logger logger = LoggerFactory.getLogger(LogLeveler.class);
	
	public static void main(String[] args) {
	    
	    logger.debug("Debug-message");
	    logger.error("Error-message");
	    logger.info("Info-message");
	    logger.trace("Trace-message");
	    logger.warn("Warn-message");
	  }
}
