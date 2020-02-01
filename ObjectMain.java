public class ObjectMain
{
  public static void main(String[] args)
  {
    Laptop laptop = new Laptop("Lenovo" ,"Yoga900", "Intel","16GB" ,"1000GB" );
    Mobile mobile = new Mobile("iphone","ad126","8GB","120GB");
    Tv tv = new Tv("Samsung", "model12", "52inch", "Black");
    Car car = new Car("HondaCRV","Black","Honda6517");

    System.out.println("Laptop" +" " + laptop.getLaptopName() + " "+laptop.getLaptopModel()+" "+laptop.getLaptopRam()+" "+laptop.getLaptopHardDisc());
    System.out.println("Mobile"+" "+mobile.getMobileCompany()+ " "+mobile.getMobileModel()+ ""+mobile.getMobileRam()+""+mobile.getMobileMemory());
    System.out.println("Tv"+" " +tv.getTvCompany()+""+tv.getTvSize()+""+tv.getTvColor()+""+tv.getTvModel());
    System.out.println("Car"+" "+car.getCarCompanyName()+""+car.getCarColor()+""+car.getCarModel());

  }


}
