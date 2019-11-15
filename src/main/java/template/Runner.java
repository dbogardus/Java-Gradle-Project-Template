package template;

import template.config.Configurator;
import template.logging.LogLeveler;

public class Runner {
	public static void main(String[] args) {
		System.out.println("Hello world!");

		Configurator configurator = new Configurator();
		System.out.println("=== CLI VALUE ===");
		configurator.printCliDDemoValue();
		System.out.println("=== CLI FILE VALUES ===");
		configurator.printCliFileProperties();

		System.out.println("=== LOG MESSAGES ===");
		LogLeveler.main(null);
	}
}
