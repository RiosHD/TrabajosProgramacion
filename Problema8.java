package Extraclase;

public class Problema8 {

	public static void main(String[] args) {
		boolean[] asi= new boolean[8];
		
		asi[0]= false;
		asi[1]= true;
	    asi[2]= true;	
	    asi[3]= false;
	    asi[4]= true;
	    asi[5]= false;
	    asi[6]= false;
	    asi[7]= true;
	    
	    int pos=0;
// true ocupado false no
		for(int i= 0;i<asi.length; i++) {
			if(asi[i]==false) {
				pos=i;
			}
			System.out.println(pos);
		}

	}

}
