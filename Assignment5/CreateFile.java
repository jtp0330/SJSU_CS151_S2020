package A5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreateFile {
	
	public static void main(String[] args) throws IOException{
	
	try {
		InputStreamReader isr = new InputStreamReader(System.in);
		FileOutputStream foi = new FileOutputStream("command_line_output.txt");
		
	
		System.out.println("Enter @q to quit:");
		char input = (char)isr.read();
		
		while(input != 'q') {
			
			System.out.println(input);
			foi.write(input);
			input = (char)isr.read();
		}
		isr.close();
		foi.close();
		
		if(isr != null)
			isr.close();
		} catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	
}
