package com.prime;

	public class PrimeNumber{
		public static void main(String args[]){
			int i,j;
			System.out.println("List of prime numbers :");
			for(i=2;i<100;i++){
				boolean isPrime =true;
				for(j=2;j<i;j++){
					if(i%j == 0){
						isPrime = false;
						break;
					}
				}
				if(isPrime){
					System.out.print(i+", ");
				}
			}
		}
	}		
