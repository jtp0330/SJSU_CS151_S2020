package A5;

import java.io.IOException;
import java.util.Scanner;

public class IntToHex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = 0;
		String[] hex = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
		String finhex = "";
		
		try {
			System.out.println("Enter an Integer: ");
			input = scan.nextInt();
			
			while(input > 0) {
				finhex = hex[input % 16] + finhex;
				input /= 16;	
				
			}
			
			System.out.println("The hex value is "+ finhex);
		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
