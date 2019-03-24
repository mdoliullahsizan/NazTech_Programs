package FileIO;

import java.io.IOException;
import java.io.File;

public class Main_FileIO {

	public static void main(String[] args) throws IOException {
		File file1= new File("N:/STS/FileIOfromCode");
		file1.mkdir();
		
		File file2= new File("N:/STS/FileIOfromCode/FileIO.txt");
		
		System.out.println(file1.getAbsolutePath());
		file2.createNewFile();

	}

}
