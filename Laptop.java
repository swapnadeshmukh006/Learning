package com.machines.computer;

public class Laptop
{
  private String laptopName;
  private String laptopModel;
  private String laptopProcessor;
  private String laptopRam;
  private String laptopHardDisc;

  public Laptop(String laptopName,String laptopModel,String laptopProcessor,String laptopRam,String laptopHardDisc)
  {
    this.laptopName = laptopName;
    this.laptopModel = laptopModel;
    this.laptopProcessor = laptopProcessor;
    this.laptopRam = laptopRam;
    this.laptopHardDisc = laptopHardDisc;
  }
  public String getLaptopName()
  {
    return this.laptopName;

  }
  public String getLaptopModel()
  {
    return this.laptopModel;
  }
  public String  getLaptopProcessor()
  {
    return this.laptopProcessor;
  }
  public String getLaptopRam()
  {
    return this.laptopRam;
  }
  public String getLaptopHardDisc()
  {
    return this.laptopHardDisc;
  }

}
