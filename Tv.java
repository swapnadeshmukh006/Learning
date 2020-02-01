package com.machines.electronics;

public class Tv {
  private String tvCompany;
  private String tvSize;
  private String tvColor;
  private String tvModel;

  public Tv(String tvCompany,String tvSize,String tvColor,String tvModel)
  {
    this.tvCompany = tvCompany;
    this.tvSize = tvSize;
    this.tvColor = tvColor;
    this.tvModel = tvModel;
  }
  public String getTvCompany()
  {
    return this.tvCompany;
  }

  public String getTvSize()
  {
    return this.tvSize;
  }

  public String getTvColor()
  {
    return this.tvColor;
  }

  public String getTvModel()
  {
    return this.tvModel;
  }
}
