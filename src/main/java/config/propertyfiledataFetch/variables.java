package config.propertyfiledataFetch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class variables {
	
	public static Properties property;
	private static String path="src/main/resources/config.properties";
	
	
	public static void initializeProperty() {
		property = new Properties();
		try {
			InputStream instrm= new FileInputStream(path);
			property.load(instrm);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
