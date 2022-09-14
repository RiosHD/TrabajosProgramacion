package Extraclase;

public class Problema3 {

	public static void main(String[] args) {
		
		int numeros[] = {8,1,2,9,3,2,9,1};
		int busca=9;
		int contador=0;
		
        for (int i=0; i< numeros.length; i++) {
			
        	if(numeros[i]==busca){  
        		
        		contador++; }
		}
        
        System.out.println(contador);
	}

}
