package com.inheritance.demo;

abstract class Animal{
	public abstract void animalSound();
	public void sleep(){
	System.out.println("zzz");
	}
  } 
   	class Pig extends Animal{
		public void animalSound(){
			System.out.println("pig says oink");
		}
	}
	
	class MyMainClass{
		public static void main(String args[]){
			Pig myPig = new Pig();
			myPig.animalSound();
			myPig.sleep();
	}
	}

	
