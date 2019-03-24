package FileIO;

import java.io.File;
import java.io.IOException;

public class FileIO_Formater {

	public static void main(String[] args) throws IOException {
		File file1= new File("N:/STS/FileIOfromCode");
		file1.mkdir();
		
		File file2= new File("N:/STS/FileIOfromCode/FileIO.txt");
		
		System.out.println(file1.getAbsolutePath());
		
		if (file1.exists() && file2.exists()) {
			System.out.println("Exists");
		}
		else {
			file2.createNewFile();
		}

	}

}
