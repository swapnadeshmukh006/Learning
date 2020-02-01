public class Address1
{
  private String streetName;
  private int aptNo;
  private String city;
  private int zipCode;
  private String country;

  public Address1(String streetName,int aptNo,String city,int zipCode,String country)
  {
    this.streetName = streetName;
    this.aptNo = aptNo;
    this.city = city;
    this.zipCode = zipCode;
    this.country = country;
  }
  public String getstreetName()
  {
    return this.streetName;
  }
  public int getaptNo()
  {
    return this.aptNo;
  }
  public String getcity()
  {
    return this.city;
  }
  public int getzipCode()
  {
    return this.zipCode;
  }
  public String getcountry()
  {
    return this.country;
  }

}
