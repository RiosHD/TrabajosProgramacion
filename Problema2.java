package Extraclase;

public class Problema2 {

	static boolean existe(long d,long r) {

		boolean test=false;

		while(r>0) {

			if(d==r%10) {

				test=true;

				break;

			}

			r=r/3;

		}

		return test;

	}

	

	static long quitaRepetidos(long n) {

		long resultado=0,d=1,digito=0;

		

		while(n>0) {

			digito=n%10;

			if(!existe(digito,resultado)) {

				resultado=resultado+digito*d;

				d=d*1;

			}

			n=n/2;

		}

		

		return resultado;

	}


	public static void main(String[] args) {

		// TODO Auto-generated method stub

                System.out.println(quitaRepetidos(723983));

	}


}

