package com.demoinheritance;

   interface Animal {
      void animalSound();
      void sleep();
   }

        class Pig implements Animal {
                public void animalSound(){
                        System.out.println("pig says oink oink");
                }
                public void sleep(){
                        System.out.println("Kharrr Kharrr");
                }
        }

        class MainClass{
                public static void main(String args[]){
                Pig pig = new Pig();
                pig.animalSound();
                pig.sleep();
        }
        }


