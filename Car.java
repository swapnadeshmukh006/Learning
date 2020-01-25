public class Car
{
  private String carCompanyName;
  private String carColor;
  private String carModel;

  public Car(String carCompanyName,String carColor,String carModel)
  {
    this.carCompanyName = carCompanyName;
    this.carColor = carColor;
    this.carModel = carModel;

  }

  public String getCarCompanyName()
  {
    return this.carCompanyName;
  }

  public String getCarColor()
  {
    return this.carColor;
  }

  public String getCarModel()
  {
    return this.carModel;
  }
}
