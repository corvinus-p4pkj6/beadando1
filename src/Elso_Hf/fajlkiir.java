package Elso_Hf;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class fajlkiir {
	
	public void elsoHfKiir(String szöveg) {
		
		try {
			FileOutputStream tit = new FileOutputStream("D:\\2. félév\\4. Hálózati technológiák\\feladatok\\Hazi\\HT\\Kiir.txt");
			byte b[] = szöveg.getBytes();
			tit.write(b);
			tit.flush();
			tit.close();
			System.out.println("Kész");
			
		} catch (Exception e) {
			System.out.println(""+e);
		}
		
	}
}
