package externalFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

	public static void main(String[] args) throws IOException {

		String path = "info\\hello.txt";
		File f = new File(path);
//		FileWriter fw = new FileWriter(f);
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Hello, I'm File writer.");
		bw.newLine();
		bw.write("I write to files.");
		bw.newLine();
		bw.write("Hello, I'm File writer.");
		bw.newLine();
		bw.write("I write to files.");
		bw.newLine();
		bw.write("Hello, I'm File writer.");
		bw.newLine();
		bw.write("I write to files.");
		bw.newLine();
		bw.write("Hello, I'm File writer.");
		bw.newLine();
		bw.write("I write to files.");
		bw.newLine();
		bw.close();
		
	}

}
