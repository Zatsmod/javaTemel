package cugrintro;

public class Cugrintro {

	public static void main(String[] args) {
		
		//Don't repeat yourself
		String internetSubeButonu ="İnternet Şubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = true;
		
		System.out.println(internetSubeButonu);
		
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düştü simgesi");
		} else if(dolarBugun>dolarDun){
		 
			System.out.println("Dolar yükseldi simgesi");  
			}
		else{
			
			System.out.println("Dolar eşittir simgesi");
		}
		
		
		
			
			
		}

}
