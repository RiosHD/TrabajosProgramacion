package Extraclase;

public class Problema1 {

	static boolean existe(long d,long r) {

		boolean test=false;

		while(r>0) {

			if(d==r%10) {

				test=true;

				break;

			}

			r=r/10;

		}

		return test;

	}

	

	static long quitaRepetidos(long n) {

		long resultado=0,d=1,digito=0;

		

		

			digito=n%10;

			if(!existe(digito,resultado)) {

				resultado=resultado+digito*d;

				d=d*10;

			}

			n=n/10;

			return resultado;
		}

		


	public static void main(String[] args) {


                System.out.println(quitaRepetidos(723983));

	}


}



