package template.config;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Properties;

import org.junit.jupiter.api.Test;

class ConfiguratorTest {
	Configurator configurator = new Configurator();

	@Test
	void getCliFilePropertiesTest() {
		String file_path = "/app.properties";

		Properties properties = configurator.getCliFileProperties(file_path);

		assertEquals(properties.getProperty("app.name", "default not used"), "Properties Sample Code");
		assertEquals(properties.getProperty("app.version"), "1.09");
	}

	@Test
	void streamPropertiesPathTest() {
		Properties not_expected = new Properties();

		Properties actual = configurator.getCliFileProperties("/app.properties");

		assertNotEquals(not_expected, actual);
	}

	@Test
	void log4jPropertiesPathTest() {
		Properties not_expected = new Properties();

		Properties actual = configurator.getCliFileProperties("/log4j.properties");

		assertNotEquals(not_expected, actual);
	}

	@Test
	void testPropertiesPathTest() {
		Properties not_expected = new Properties();

		Properties actual = configurator.getCliFileProperties("/test.properties");

		assertNotEquals(not_expected, actual);
	}
}
