package template.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogLeveler {
	private static Logger logger = LoggerFactory.getLogger(LogLeveler.class);

	public static void main(String[] args) {
		logger.error("Error-message");
		logger.warn("Warn-message");
		logger.info("Info-message");
		logger.debug("Debug-message");
		logger.trace("Trace-message");
	}
}
