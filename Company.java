public class Company
{
private String companyName;
private int companyId;
private Address1 address1;

public Company(String companyName,int companyId, Address1 address1)
{
  this.companyName = companyName;
  this.companyId = companyId;
  this.address1 = address1;
}
public String getCompanyName()
{
  return this.companyName;
}
public int getCompanyId()
{
  return this.companyId;
}
public Address1 getAddress1()
{
  return this.address1;
}

}
