public class MainMethod
{

public static void main(String[] args)
{
  CompanyAddress address = new CompanyAddress("707 Arcadia Drive","#4", "bloomington","61704" , "USA");

  Company company = new Company("capgemini", 123,"Address");

  Employee1 employee = new Employee1("Sudarshan","Deshmukh",12,"company");

  Company empCompany = employee.getcompany();
  CompanyAddress companyAddress = address.getCompanyAddress();

  System.out.println("Employee first name" + employee.getfirstName() );
  System.out.println("Employee last name" +employee.getlastName() );
  System.out.println("Employee id" + employee.getid() );
  System.out.println("company" + empCompany.getcompanyName() + "company id" +empcompany.getcompanyId() );
  System.ount.println("Company Address" + companyAddress.getstreetName() + " " +companyAddress.getaptNo() + " " +companyAddress.getcity() + " "
  +companyAddress.getzipCode() + "companyAddress" + companyAddress.getcountry) ;

}
}
