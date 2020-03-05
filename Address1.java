package com.industry.employeedata;


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
  public String getStreetName()
  {
    return this.streetName;
  }
  public int getAptNo()
  {
    return this.aptNo;
  }
  public String getCity()
  {
    return this.city;
  }
  public int getZipCode()
  {
    return this.zipCode;
  }
  public String getCountry()
  {
    return this.country;
  }

}
