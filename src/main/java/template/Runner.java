package template;

import java.util.Properties;

import template.config.Configurator;
import template.config.PropertiesReader;
import template.logging.LogLeveler;

public class Runner {
	public static void main(String[] args) {
		System.out.println("Hello world!");

		Properties prop = new Properties();
		PropertiesReader reader = new PropertiesReader(prop);
		Configurator configurator = new Configurator(reader);
		System.out.println("=== CLI VALUE ===");
		configurator.printCliDDemoValue();
		System.out.println("=== CLI FILE VALUES ===");
		configurator.printCliFileProperties();

		System.out.println("=== LOG MESSAGES ===");
		LogLeveler.main(null);
	}
}
