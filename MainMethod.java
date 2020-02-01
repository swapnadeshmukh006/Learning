package com.industry;
import com.industry.employeedata.Employee1;
import com.industry.employeedata.Address1;
import com.industry.employeecompany.Company;
public class MainMethod
{

public static void main(String[] args)
{
  Address1 address1 = new Address1("707ArcadiaDrive", 4, "bloomington", 61704 , "USA");

  Company company = new Company("capgemini", 123, address1);

  Employee1 employee1 = new Employee1("Sudarshan","Deshmukh", 12, company);

  Company employee1Company = employee1.getCompany();
  Address1 companyAddress1 = company.getAddress1();

  System.out.println("Employee1 first name" + " " +employee1.getFirstName() );
  System.out.println("Employee1 last name" +" "+employee1.getLastName() );
  System.out.println("Employee1 id" +" "+ employee1.getId() ) ;
  System.out.println("Company" + " "+ employee1Company.getCompanyName() + " "+"company id" +employee1Company.getCompanyId() +" " +employee1Company.getAddress1() );
  System.out.println("Address1" + " " +companyAddress1.getStreetName() + " " +companyAddress1.getAptNo() + " " +companyAddress1.getCity()
  + " "+companyAddress1.getZipCode() +  " " + companyAddress1.getCountry()) ;

}
}
