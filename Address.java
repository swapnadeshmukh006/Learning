public class Address{
  private String streetName;
  private int aptNo;
  private String city;
  private int zipCode;
  private String country;
  public void setstreetName(String streetName)
  {
    this.streetName = streetName;
  }

  public String getstreetName()
  {
    return this.streetName;
}

  public void setaptNo(int aptNo)
  {
    this.aptNo = aptNo;
  }
  public int getaptNo()
  {
    return this.aptNo;
  }

  public void setcity(String city)
  {
    this.city = city;
  }

  public String getcity()
  {
    return this.city;
}

public void zipCode(int zipCode)
{
  this.zipCode = zipCode;
}

public int getzipCode()
{
  return this.zipCode;
}
public void country(String country)
{
  this.country = country;
}

public String getcountry()
{
  return this.country;
}
public static void main(String[] args)
{
Address a1 =  new Address();
a1.streetName ="arcadia drive" ;
a1.aptNo = 7 ;
a1.city = "bloomington" ;
a1.zipCode = 61704;
a1.country = "usa" ;
System.out.println("street-" +a1.streetName + "aptNo-" +a1.aptNo  + "city-" +a1.city + "zipCode -" +a1.zipCode +
"country-" +a1.country);
}

}
