package A5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Users\\Jared\\eclipse-workspace\\Assignment5\\A5\\src\\A5\\quote.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		try {
		while(br.ready())
			System.out.println(br.readLine());
		}catch(Exception e) {
			
			e.printStackTrace();
		}
	}

}
