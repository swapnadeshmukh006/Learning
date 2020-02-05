	package com.loop;

	public class LoopControl{
	public static void main(String args[]){
	int i;
	System.out.println("List of even number");
	for(i=0;i<=100;i++){
		if(i%2==0){
			System.out.print(i +" ,");
		}
	}
	System.out.println("\n List of Odd number");	
		for(i=0;i<=100;i++){ 
			if(i%2 >0){
				System.out.print(i+" , ");
			}
		}
	}
}
