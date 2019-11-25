package template.config;

import java.util.Properties;

public class Configurator {
	private PropertiesReader reader;

	public Configurator(PropertiesReader reader) {
		this.reader = reader;
	}
	
	public void printCliDDemoValue() {
		this.reader.setCliKeyValue("JAR_CLI");
		System.out.println(this.reader.getProperties().getProperty("JAR_CLI"));
	}

	public void printCliFileProperties() {
		this.reader.loadFileProperties("/app.properties");
		Properties properties = this.reader.getProperties();
		
		System.out.println(properties.getProperty("APP_NAME", "default value"));
		System.out.println(properties.getProperty("APP_VERSION", "another default value"));
		System.out.println(properties.getProperty("APP_CLI_DEFINED", "APP_CLI_DEFINED not defined"));
	}

	public Properties getCliDValue(String d_key) {
		this.reader.setCliKeyValue(d_key);
		return this.reader.getProperties();
	}

	public Properties getCliFileProperties(String file_path) {
		this.reader.loadFileProperties("/app.properties");
		return this.reader.getProperties();
	}
}
