package Elso_Hf;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ora {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("D:\\2. félév\\4. Hálózati technológiák\\feladatok\\Hazi\\HT\\Beolvas.txt"));
		
		PrintWriter pw = new PrintWriter ("D:\\2. félév\\4. Hálózati technológiák\\feladatok\\Hazi\\HT\\Kiir.txt");
		
		String line = br.readLine();
		while(line!=null) {
			System.out.println(line);
			pw.println(line);
			line = br.readLine();
			
			
		}
		
		pw.flush();
		//flush();
		pw.close();
		br.close();
		
	}

}
