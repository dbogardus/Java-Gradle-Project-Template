package template.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configurator {
	public static void main(String[] args) {
		String fileName = "src/main/resources/config.properties";
		
		Properties prop = Configurator.getConfig(fileName);
		
		System.out.println(prop.getProperty("app.name", "default value"));
		System.out.println(prop.getProperty("app.version"));
	}
	
	public static Properties getConfig(String fileName) {
		Properties prop = new Properties();
		
		InputStream stream = null;
		try {
			stream = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(stream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop;
	}
}
