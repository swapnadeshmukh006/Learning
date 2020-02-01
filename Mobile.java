package com.machines.electronics;

public class Mobile
{
  private String mobileCompany;
  private String mobileModel;
  private String mobileRam;
  private String mobileMemory;

  public Mobile(String mobileCompany,String mobileModel,String mobileRam,String mobileMemory)

  {
    this.mobileCompany = mobileCompany;
    this.mobileModel = mobileModel;
    this.mobileRam = mobileRam;
    this.mobileMemory = mobileMemory;

  }

  public String getMobileCompany()
  {
    return this.mobileCompany;
  }

  public String getMobileModel()
  {
    return this.mobileModel;
  }

  public String getMobileRam()
  {
    return this.mobileRam;
  }
  public String getMobileMemory()
  {
    return this.mobileMemory;
  }
  
}
