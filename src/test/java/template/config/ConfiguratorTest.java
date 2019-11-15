package template.config;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Properties;

import org.junit.jupiter.api.Test;

class ConfiguratorTest {
	@Test
	void getCliFilePropertiesTest() {
		String file_path = "/app.properties";
		Configurator configurator = new Configurator();
		Properties properties = configurator.getCliFileProperties(file_path);

		assertEquals(properties.getProperty("app.name", "default not used"), "Properties Sample Code");
		assertEquals(properties.getProperty("app.version"), "1.09");
	}

}
