public class Employee1
{
  private String firstName;
  private String lastName;
  private int id;
  private Company company;

  public Employee1( String firstName,String lastName,int id,Company company)
  {
  this.firstName = firstName;
  this.lastName = lastName;
  this.id = id;
  this.company = company;
}

public String getFirstName()
{
  return this.firstName;
}
public String getLastName()
{
  return this.lastName;
}
public int getId()
{
  return this.id;
}
public Company getCompany()
{
  return this.company;
}

}
