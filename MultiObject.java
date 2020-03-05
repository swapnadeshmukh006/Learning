package com.machines;

import com.machines.computer.Laptop;
import com.machines.electronics.Tv;
import com.machines.electronics.Mobile;
import com.machines.automobiles.Car;

public class MultiObject
{
  public static void main(String[] args)
  {
    Laptop lenovo = new Laptop("Lenovo" ,"Yoga900", "Intel","8GB" ,"1000GB" );
    Laptop dell = new Laptop("dell" ,"dell711", "Intel","16GB" ,"1000GB" );
    Laptop hp = new Laptop("hp" ,"hp100", "Intel","16GB" ,"500GB" );
    Laptop apple = new Laptop("apple" ,"apple234", "Intel","32" ,"1000GB" );

    Mobile samsung = new Mobile("samsung","samsung12","32GB","120GB");
    Mobile iphone = new Mobile("apple","apple34","16GB","256GB");
    Mobile nokia = new Mobile("nokia","nokia123","8GB","64GB");



    Tv onida = new Tv("onida", "model12", "52inch", "Black");
    Tv motorola = new Tv("motorola", "model23", "70inch", "white");

    Car honda = new Car("HondaCRV","Black","Honda6517");
    Car maruti = new Car("maruti","white","maruti56");


  System.out.println("lenovo" +" " + lenovo.getLaptopName() + " "+lenovo.getLaptopModel()+
  " "+lenovo.getLaptopRam()+" "+lenovo.getLaptopHardDisc());

  System.out.println("Dell " +" " + dell.getLaptopName() + " "+dell.getLaptopModel()+
  " "+dell.getLaptopRam()+" "+dell.getLaptopHardDisc());

  System.out.println("hp" +" " + hp.getLaptopName() + " "+hp.getLaptopModel()+
  " "+hp.getLaptopRam()+" "+hp.getLaptopHardDisc());

  System.out.println("apple" +" " + apple.getLaptopName() + " "+apple.getLaptopModel()+
  " "+apple.getLaptopRam()+" "+apple.getLaptopHardDisc());

  System.out.println("samsung"+" "+samsung.getMobileCompany()+ " "+samsung.getMobileModel()+
  ""+samsung.getMobileRam()+""+samsung.getMobileMemory());

  System.out.println("apple"+" "+iphone.getMobileCompany()+ " "+iphone.getMobileModel()+
  ""+iphone.getMobileRam()+""+iphone.getMobileMemory());

  System.out.println("nokia"+" "+nokia.getMobileCompany()+ " "+nokia.getMobileModel()+
  ""+nokia.getMobileRam()+""+nokia.getMobileMemory());

  System.out.println("onida"+" " +onida.getTvCompany()+""+onida.getTvSize()+""+
  onida.getTvColor()+""+onida.getTvModel());

  System.out.println("motorola"+" " +motorola.getTvCompany()+""+motorola.getTvSize()+""+
  motorola.getTvColor()+""+motorola.getTvModel());


  System.out.println("honda"+" "+honda.getCarCompanyName()+""+
  honda.getCarColor()+""+honda.getCarModel());

  System.out.println("maruti"+" "+maruti.getCarCompanyName()+""+
  maruti.getCarColor()+""+maruti.getCarModel());
  }
}
