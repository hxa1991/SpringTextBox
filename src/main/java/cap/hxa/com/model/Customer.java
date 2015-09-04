package cap.hxa.com.model;

import java.util.logging.Logger;

public class Customer  {
	private String username;
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public String getUsername() {
		LOGGER.info("getUsername");
		return username;
	}

	public void setUsername(String username) {
		LOGGER.info("setUsername");
		this.username = username;
	}
	
}
