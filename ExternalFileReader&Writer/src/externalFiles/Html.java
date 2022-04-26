package externalFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Html {

	public static void main(String[] args) throws IOException {

		String path = "myData\\hello.html";
		File file = new File(path);
		FileWriter fileWriter = new FileWriter(file, true);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		bufferedWriter.write("<html>");
		bufferedWriter.newLine();
		bufferedWriter.write("<head>");
		bufferedWriter.newLine();
		bufferedWriter.write("<title>HTML Basics </title>");
		bufferedWriter.newLine();
		bufferedWriter.write("</head>");
		bufferedWriter.newLine();
		bufferedWriter.write("<body>");
		bufferedWriter.newLine();
		bufferedWriter.write("<p>Hello HTML </p>");
		bufferedWriter.newLine();
		bufferedWriter.write("</body>");
		bufferedWriter.newLine();
		bufferedWriter.write("</html>");
		bufferedWriter.newLine();
		bufferedWriter.close();
		
	}

}
