package template.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertiesReader {
	private final Logger logger = LoggerFactory.getLogger(PropertiesReader.class);

	private Properties properties;

	public PropertiesReader(Properties properties) {
		this.properties = properties;
	}

	public Properties getProperties() {
		return properties;
	}

	public void loadFileProperties(String file_path) {
		InputStream input = getClass().getResourceAsStream(file_path);
		try {
			this.properties.load(input);
		} catch (IOException e) {
			this.logger.error("Cannot read/load properties.");
		}

		this.logger.info(this.properties.toString());
	}

	public void setCliKeyValue(String d_key) {
		String d_value = System.getProperty(d_key);
		if (d_value != null) {
			this.properties.put(d_key, d_value);
		}

		this.logger.info("D Key: " + d_key + ", D Value: " + d_value);
	}

	public void setEnvVarKeyValue(String env_var_key) {
		String env_var_value = System.getenv(env_var_key);
		if (env_var_value != null) {
			this.properties.put(env_var_key, env_var_value);
		}

		this.logger.info("ENV VAR Key: " + env_var_key + ", ENV VAR Value: " + env_var_value);
	}
}
