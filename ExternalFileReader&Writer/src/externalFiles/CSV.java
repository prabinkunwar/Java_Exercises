package externalFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSV {

	public static void main(String[] args) throws IOException {
		// ArrayList
		List<String> allLines = new ArrayList<String>();
		
		//  CSV files : A text file that has each line --- values are coma separated
		
		String path ="myData\\myCSV.csv";
		File file = new File(path);
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		 
		String  line =" ";
		while( (line=bufferedReader.readLine()) != null) {
			//System.out.println(line);
			allLines.add(line);
		}
		System.out.println(allLines.get(1).split(",")[1]);
	}

}
