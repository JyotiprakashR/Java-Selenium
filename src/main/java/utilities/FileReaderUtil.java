package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReaderUtil {

	public static String getConfigProperty(String propName) {

		try {
			Properties properties = new Properties();
			FileInputStream fis = new FileInputStream(
					new File(System.getProperty("user.dir") + "/src/test/resources/config/test-config.properties"));
			properties.load(fis);
			return properties.getProperty(propName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return propName;
	}

	public static String getObjProperty(String propName) {

		try {
			Properties properties = new Properties();
			FileInputStream fis = new FileInputStream(
					new File(System.getProperty("user.dir") + "/src/test/resources/objProperties/obj.properties"));
			properties.load(fis);
			return properties.getProperty(propName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return propName;
	}

}
