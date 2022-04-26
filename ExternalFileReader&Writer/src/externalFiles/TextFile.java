package externalFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextFile {

	public static void main(String[] args) throws IOException {

		String path = "info\\xyz.txt";
		File f = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		
		//while there are more lines, keep printing
		String line = "";
		while((line=br.readLine()) !=null) {
			System.out.println(line);
		}
		
	}

}
