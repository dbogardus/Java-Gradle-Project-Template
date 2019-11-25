package template.config;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.jupiter.api.Test;

public class TestPropertiesTest {
	@Test
	void testProperties() {
		InputStream input = getClass().getResourceAsStream("/test.properties");
		Properties properties = new Properties();
		try {
			properties.load(input);
		} catch (IOException e) {
			e.printStackTrace();
			assertTrue(false);
		}
		assertEquals("hello world", properties.getProperty("TEST_NAME", "default value"));
		assertEquals("1.01", properties.getProperty("TEST_VERSION"));
	}
}
