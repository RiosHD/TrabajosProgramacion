package Extraclase;

public class Problema5 {
	public static void main(String[] args) {
		  
		int numeros[] = {7,2,3,5,2,3,4};
		int mayor=0;
		
		for(int i=0; i<numeros.length;i++){
				
			 if(numeros[i]>mayor){ 
				 
				 mayor = numeros[i];
			 
			 }
	        
	        System.out.println(mayor);
	        }
	}
}
