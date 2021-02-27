package Elso_Hf;

import java.io.FileInputStream;

public class fajlbeolvas {
		public String fajlHfBeolv(){
			try {
				FileInputStream fis = new FileInputStream("D:\\2. félév\\4. Hálózati technológiák\\feladatok\\Hazi\\HT\\Beolvas.txt");
				String s ="";
				int i =0;
				while((i=fis.read())!=-1){
					if(i!=10 && i!=13) {
					s+=(char) (i+1);
					
					}
					
				}
				
				
				fis.close();
				System.out.println(s);
				return s;
				
			}
			catch (Exception e) {
				System.out.print(""+e);
			}
		return null;
		}
}
