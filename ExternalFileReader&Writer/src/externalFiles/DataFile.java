package externalFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataFile {

	public static void main(String[] args) throws IOException {

//		String path = "C:\\Users\\Prasbin\\Documents\\Eclipse Projects\\Practise\\info\\abc.properties";  // * This is static way
		String path = "info\\abc.properties";  // * This is dynamic way
		
		Properties properties = new Properties();
		
		FileInputStream fInput = new FileInputStream(path);
		properties.load(fInput);
		
		System.out.println(properties.get("username"));
		System.out.println(properties.get("password"));
		System.out.println(properties.get("browser"));
		
	}

}
