package template.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configurator {
	public void printConfig() {
		System.out.println(System.getProperty("jarCli"));

		InputStream input = getClass().getResourceAsStream("/app.properties");
        Properties properties = new Properties();
		try {
			properties.load(input);
			System.out.println(properties.getProperty("app.name", "default value"));
			System.out.println(properties.getProperty("app.version"));
			System.out.println(properties.getProperty("app.cli.defined"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
