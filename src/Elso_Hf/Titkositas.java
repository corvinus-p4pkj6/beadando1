package Elso_Hf;

import java.io.IOException;

public class Titkositas {

	public static void main(String[] args) throws IOException {
		//fajlkiir ti = new fajlkiir();
		//ti.elsoHfKiir();
		fajlbeolvas f = new fajlbeolvas();
		String h = f.fajlHfBeolv();
		fajlkiir fk = new fajlkiir();
		fk.elsoHfKiir(h);
		
		// TODO Auto-generated method stub
		//System.out.println("üdv");
		//int beolvas = System.in.read();
		//System.out.println(beolvas);
	}

}
