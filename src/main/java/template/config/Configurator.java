package template.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configurator {
	public void printCliDDemoValue() {
		System.out.println(System.getProperty("jarCli"));
	}
	
	public void printCliFileProperties() {
		InputStream input = getClass().getResourceAsStream("/app.properties");
		Properties properties = new Properties();
		try {
			properties.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(properties.getProperty("app.name", "default value"));
		System.out.println(properties.getProperty("app.version", "another default value"));
		System.out.println(properties.getProperty("app.cli.defined", "app.cli.defined not defined"));
	}
	
	public String getCliDValue(String d_key) {
		return System.getProperty(d_key);
	}
	
	public Properties getCliFileProperties(String file_path) {
		Properties properties = new Properties();
		InputStream input = getClass().getResourceAsStream(file_path);
		try {
			properties.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}
}
