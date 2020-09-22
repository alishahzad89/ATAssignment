package main.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Helper {
	
	public static String getResourceFolderPath() {
		return System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator
				+ "resources" + File.separator;
	}

	public Properties readPropertyFile(String fileName) throws CustomException {
		try {
			String filePath = getResourceFolderPath() + fileName;
			FileReader reader = new FileReader(filePath);
			Properties property = new Properties();
			property.load(reader);
			return  property;

		} catch (FileNotFoundException e) {
			throw new CustomException("Property file path not found");
		} catch (IOException e) {
			throw new CustomException("Property file IO exception");
		}
	}
}
