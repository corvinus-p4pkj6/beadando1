package Elso_Hf;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class fajlkiir {
	
	public void elsoHfKiir(String sz�veg) {
		
		try {
			FileOutputStream tit = new FileOutputStream("D:\\2. f�l�v\\4. H�l�zati technol�gi�k\\feladatok\\Hazi\\HT\\Kiir.txt");
			byte b[] = sz�veg.getBytes();
			tit.write(b);
			tit.flush();
			tit.close();
			System.out.println("K�sz");
			
		} catch (Exception e) {
			System.out.println(""+e);
		}
		
	}
}
