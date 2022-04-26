package externalFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToCsvFile {

	public static void main(String[] args) throws IOException {

		String path = "myData\\hello.csv";
		File file = new File(path);
		FileWriter fileWriter = new FileWriter(file, true);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		bufferedWriter.write("First Name, Last Name, Dob");
		bufferedWriter.close();
		
	}

}
